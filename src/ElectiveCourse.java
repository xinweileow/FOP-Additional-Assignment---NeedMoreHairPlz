// fulfilled: at least two child classes
// fulfilled: inheritance

public class ElectiveCourse extends Course {
    private final String category;  // e.g. English, Entrepreneurship

    // fulfilled: at least one constructor per class
    public ElectiveCourse(String courseCode, String courseName, int capacityLimit, Course prerequisite, String category) {
        super(courseCode, courseName, capacityLimit, prerequisite);
        this.category = category;
        // fulfilled: at least three attributes per class - 1 + attributes inherited from parent
    }

    // fulfilled: at least one overridden method
    @Override
    public String toString() {
        // this way we can just print course, output would be "Core Course: [Code] Name"
        return "Elective Course: " + super.toString();
    }

    public String getCategory() {
        return this.category;
    }
    // fulfilled: at least two methods per class
}
