
public class AboutClass {
    public static void main(String[] args) {
        Dog olddog=new Dog("Alice");
        System.out.println(olddog.getName());
        String newName = "Bob";
        olddog.setName(newName);
        System.out.println(olddog.getName());
    }

    static class Dog{
        public  String name;

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
