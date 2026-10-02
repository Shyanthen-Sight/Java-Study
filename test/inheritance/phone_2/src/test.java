public class test {
    public static void main(String[] args) {
        phoneG1 phone1 = new phoneG1();
        phoneG2 phone2 = new phoneG2();
        phoneG3 phone3 = new phoneG3();
        phone1.call();
        System.out.println("");
        phone2.call();
        phone2.message();
        System.out.println("");
        phone3.call();
        phone3.message();
        phone3.game();
    }
}
