public class stuBean {
    private String name;
    private int age;

    public stuBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void study() {
        System.out.println(name + "正在学习");
    }
    public void age() {
        System.out.println(name + "的年龄是" + age);
    }
}
