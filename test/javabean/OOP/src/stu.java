public class stu {
    public static void main(String[] args) {
        stuBean stu=new stuBean("张三", 20);
        stu.study();
        stu.age();
        System.out.println(stu.getAge());
    }
}
