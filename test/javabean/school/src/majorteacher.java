public class majorteacher extends teacher {
    public majorteacher() {
    }

    public majorteacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    @Override
    public void teach() {
        System.out.println(getName() + " is teaching " + getSubject() + " as a major teacher.");
    }
}
