public class OuterInner2 {


    static class OuterInner {
        class outer {
            void show() {
                System.out.println("这是外部类");
            }

            class inner {
                void show() {
                    System.out.println("这是内部类");
                }
            }
        }

        public static void main(String[] args) {
            outer out = new OuterInner().new outer();
            out.show();
            outer.inner in = out.new inner();
            in.show();

        }

    }
}