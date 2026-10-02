public class student extends person {
    private String grade;

    public student() {

    }

    public student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void study() {
        System.out.println(getName() + " is studying in grade " + grade + ".");
    }
}
