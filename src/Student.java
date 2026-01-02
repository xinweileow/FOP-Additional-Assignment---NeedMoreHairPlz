import java.util.ArrayList;

public class Student {
    // fulfilled: at least three attributes per class
    private final String name;
    private final String id;
    private final ArrayList<Course> completedCourses;
    private final ArrayList<Course> currentCourses;

    // fulfilled: at least one constructor per class
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.completedCourses = new ArrayList<>();
        this.currentCourses = new ArrayList<>();
    }

    public void addCurrentCourse(Course course) {
        this.currentCourses.add(course);
    }

    public boolean isTaking(Course course) {
        return currentCourses.contains(course);
    }

    public boolean hasCompleted(Course course) {
        return completedCourses.contains(course);
    }

    public boolean markCompleted(Course course) {
        if (this.isTaking(course)) {
            currentCourses.remove(course);
            completedCourses.add(course);
            return true;
        }
        return false;
    }

    // fulfilled: ability to drop course
    public boolean drop(Course course) {
        if (this.isTaking(course)) {
            currentCourses.remove(course);
            return true;
        }
        return false;
    }

    // fulfilled: ability to display registered course
    public void displayCourses() {
        // remove square brackets before and after strings
        String completed = completedCourses.toString();
        String current = currentCourses.toString();
        System.out.println(this + "'s Course Information");
        System.out.println("Taken:  " + completed.substring(1, completed.length() - 1));
        System.out.println("Taking:  " + current.substring(1, current.length() - 1));
    }

    @Override
    public String toString() {
        // this way we can just print student, output would be "student name (student id)"
        return this.name + " (" + this.id + ")";
    }
    // fulfilled: at least two methods per class
}
