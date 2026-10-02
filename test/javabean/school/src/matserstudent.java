public class matserstudent extends student {
    public matserstudent() {
    }

    public matserstudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println(getName() + " is studying in grade " + getGrade() + " as a master student.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping as a master student."+"in a high level dormitory.");
    }
}
