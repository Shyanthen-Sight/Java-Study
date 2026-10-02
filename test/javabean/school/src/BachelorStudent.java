public class BachelorStudent extends student  {
    public BachelorStudent() {
    }

    public BachelorStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println(getName() + " is studying in grade " + getGrade() + " as a bachelor student.");
    }
}
