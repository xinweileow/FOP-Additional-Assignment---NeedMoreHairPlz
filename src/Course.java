// fulfilled:  at least one base class
public class Course {
    // fulfilled: attributes
    protected String courseCode;
    protected String courseName;
    protected final int capacityLimit;
    protected int enrolledCount;
    protected Course  prerequisite;

    // fulfilled: at least one constructor per class
    public Course(String courseCode, String courseName, int capacityLimit, Course prerequisite) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.capacityLimit = capacityLimit;
        this.enrolledCount = 0;
        this.prerequisite = prerequisite;
    }

    public Course getPrerequisite() {
        return this.prerequisite;
    }

    public boolean isFull() {
        return this.enrolledCount >= this.capacityLimit;
    }

    public void incrementStudentCount() {
        if (!this.isFull())
            this.enrolledCount++;
    }

    public void decrementStudentCount() {
        if (this.enrolledCount > 0)
            this.enrolledCount--;
    }

    // fulfilled: at least one overridden method per project
    @Override
    public String toString() {
        return "[" + this.courseCode + "] " + this.courseName;
    }
    // fulfilled: at least two methods per class
}
