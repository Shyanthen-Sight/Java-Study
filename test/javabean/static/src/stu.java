public class stu {
    public static void main(String[] args) {
        stuBean stu1 = new stuBean();
        stuBean stu2 = new stuBean();
        stu1.name = "张三";
        stu1.age = 20;
        stu2.name = "李四";
        stu2.age = 22;
        stuBean.teacherName = "王老师";
        System.out.println(stu1.name + "的年龄是" + stu1.age+"老师是"+stuBean.teacherName);
        System.out.println(stu2.name + "的年龄是" + stu2.age+"老师是"+stuBean.teacherName);

    }
}
