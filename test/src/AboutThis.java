public class AboutThis {
    public static void main(String[] args) {
        class student{
            String name;
            int age;
            public student(){
//                this("小明",18);
            }

            public student(String name, int age) {
                this.name = name;
                this.age = age;
            }

            void output(){
                System.out.println("姓名：" + name + "，年龄：" + age);
            }
        }

        student s1=new student();
        s1.output();

    }
}
