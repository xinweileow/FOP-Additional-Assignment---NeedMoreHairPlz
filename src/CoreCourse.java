// fulfilled: at least two child classes
// fulfilled: inheritance

public class CoreCourse extends Course {
    private final String department;  // e.g. SE, AI, CST, IS

    // fulfilled: at least one constructor per class
    public CoreCourse(String courseCode, String courseName, int capacityLimit, Course prerequisite, String department) {
        super(courseCode, courseName, capacityLimit, prerequisite);
        this.department = department;
        // fulfilled: at least three attributes per class - 1 + attributes inherited from parent
    }

    // fulfilled: at least one overridden method per project
    @Override
    public String toString() {
        // this way we can just print course, output would be "Core Course: [Code] Name"
        return "Core Course: " + super.toString();
    }

    public String getDepartment() {
        return this.department;
    }
    // fulfilled: at least two methods per class
}
