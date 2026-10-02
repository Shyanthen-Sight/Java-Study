public class Main {
    public static void main(String[] args) {
       chief chief = new chief();
         chief.setName("John");
            chief.setId(1);
            chief.setSalary(50000);
            chief.eat();
            chief.cook();
       manager manager = new manager();
            manager.setName("Alice");
            manager.setId(2);
            manager.setSalary(60000);
            manager.eat();
            manager.manage();

    }
}