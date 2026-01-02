public class Registration {
    // fulfilled: a constructor per class. explicitly defined no arg constructor count as well
    public Registration() {}

    // seriously how am i going to define attributes for this class?

    // fulfilled challenge: validate course capacity and prerequisites
    public void enroll(Student student, Course course) {
        // check 1: capacity
        if (course.isFull()) {
            System.out.println("Error: " + course + " is full");
            return;
        }

        // check 2: prerequisite
        Course prerequisite = course.getPrerequisite();
        if (prerequisite != null) {
            if (!student.hasCompleted(prerequisite)) {
                System.out.println("Error: Prerequisite missing, must complete " + prerequisite + " first");
                return;
            }
        }

        // if all checks pass
        student.addCurrentCourse(course);
        course.incrementStudentCount();
        System.out.println("Success: " + student + " enrolled in " + course);
    }

    public void complete(Student student, Course course) {
        if (student.markCompleted(course)) {
            course.decrementStudentCount();
            System.out.println("Success: " + student + " has completed " + course);
        }
        else {
            System.out.println("Error: " + student + " has to be enrolled in " + course + " in order for them to complete this course");
        }
    }

    public void drop(Student student, Course course) {
        if (student.drop(course)) {
            course.decrementStudentCount();
            System.out.println("Success: " + student + " has dropped " + course);
        }
        else {
            System.out.println("Error: " + student + " has to be enrolled in " + course + " in order for them to drop this course");
        }
    }

    public void displayCourses(Student student) {
        student.displayCourses();
    }
    // fulfilled: at least two methods
}