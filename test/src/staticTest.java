public class staticTest {
//   static public class student{
//        static String school="Yangtz Normal University";
//        String name;
//        int age;
//    }
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        s1.name="张三";
        s1.age=20;
        s2.name="李四";
        s2.age=21;
        System.out.println(s1.name+" "+s1.age+" "+student.school);
        System.out.println(s2.name+" "+s2.age+" "+student.school);
    }
}
//or
class student{
    static String school="Yangtz Normal University";
    String name;
    int age;
}
