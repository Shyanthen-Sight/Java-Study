class Tom {
    int x;
    static int y;

    void f(int x, int y) {
        this.x = x;
        Tom.y = y;
    }
}

public class Main {
    public static void main(String args[]) {
        Tom tom = new Tom();

        System.out.printf("%d,%d\n", tom.x, tom.y);

        tom.f(100, 200);

        System.out.printf("%d,%d\n", tom.x, tom.y);

        Tom cat = new Tom();
        cat.f(1000, 290);

        System.out.printf("%d,%d\n", cat.x, cat.y);
    }
}