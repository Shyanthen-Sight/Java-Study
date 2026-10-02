public class MemberDefault {
    public static void main(String[] args) {
        class demo{
            int count;
            String name;
            void show(){
                int local;
                System.out.println(count);
                System.out.println(name);
//                System.out.println(local); // ❌错误！局部变量必须初始化后才能使用
            }
        }
        demo demo = new demo();
        demo.show();
    }

}
