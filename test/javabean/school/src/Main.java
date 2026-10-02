public class Main {
    public static void main(String[] args) {
        // Create a bachelor student
        BachelorStudent bachelorStudent = new BachelorStudent("Alice", 20, "Sophomore");
        bachelorStudent.study();
        bachelorStudent.sleep();
        bachelorStudent.eat();

        // Create a master student
        matserstudent masterStudent = new matserstudent("Bob", 25, "Graduate");
        masterStudent.study();

        // Create a major teacher
        majorteacher majorTeacher = new majorteacher("Dr. Smith", 40, "Mathematics");
        majorTeacher.teach();

        // Create a general teacher
        generalteacher generalTeacher = new generalteacher("Ms. Johnson", 35, "English");
        generalTeacher.teach();

        // Make the master student sleep
        masterStudent.sleep();
    }
}