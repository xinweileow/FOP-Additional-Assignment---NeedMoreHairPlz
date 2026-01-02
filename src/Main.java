// fulfilled: a main class to test the system

public class Main {
    // this class does not need attributions and additional methods
    
    public static void main(String[] args) {
        // fulfilled: object creation
        CoreCourse mathsOne = new CoreCourse("WIX1001", "Computing Maths I", 2, null, "SE");
        CoreCourse mathsTwo = new CoreCourse("WIX1001", "Computing Maths II", 2, mathsOne, "SE");
        ElectiveCourse english = new ElectiveCourse("GLT1024", "Proficiency in English III", 1, null, "Language");

        Student john = new Student("John Doe", "123321001");
        Student jane = new Student("Jane Doe", "123321102");

        Registration registration = new Registration();

        // assume jane completed semester 1 and has completed maths 1
        registration.enroll(jane, mathsOne);
        registration.complete(jane, mathsOne);

        registration.enroll(jane, mathsTwo);  // this should success, jane has completed maths one

        // john is taking two courses this semester
        registration.enroll(john, mathsOne);
        registration.enroll(john, english);

        registration.enroll(john, mathsTwo);  // this should fail, john hasn't complete maths one yet
        registration.enroll(jane, english);   // this should fail, the capacity of english course is just one (1 on 1 tutoring lol)

        registration.complete(john, english); // if we make john complete his english
        registration.enroll(jane, english);   // this should success, since the slot is free again

        registration.drop(jane, english);     // turns out jane does not like english. either way this should success

        System.out.println();
        registration.displayCourses(john);

        System.out.println();
        registration.displayCourses(jane);
    }
}
