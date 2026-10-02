public class generalteacher extends teacher {
    public generalteacher() {
    }

    public generalteacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    @Override
    public void teach() {
        System.out.println(getName() + " is teaching " + getSubject() + " as a general teacher.");
    }
}
