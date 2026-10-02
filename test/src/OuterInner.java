
public class OuterInner {
    class outer{
        void show(){
            System.out.println("这是外部类哦");
        }
        class inner{
            void show(){
                System.out.println("这是内部类哦");
            }
        }
    }

    public static void main(String[] args) {
        OuterInner o=new OuterInner();
        OuterInner.outer out=o.new outer();
        out.show();
        OuterInner.outer.inner in=out.new inner();
        in.show();

    }

}
