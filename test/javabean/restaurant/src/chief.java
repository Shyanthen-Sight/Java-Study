public class chief extends person {
    public chief() {
    }

    public chief(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void cook() {
        System.out.println(getName() + " is cooking.");
    }
}
