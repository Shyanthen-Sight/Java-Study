class Tom {
    int x;
    static int y;

    void f(int x, int y) {
        this.x = 100;
        Tom.y = 200;
    }
}

public class test {
    public static void main(String[] args) {
        Tom tom = new Tom();

        System.out.printf("%d,%d\n", tom.x, Tom.y);

        tom.f(100, 200);
        System.out.printf("%d,%d\n", tom.x, Tom.y);

        Tom cat = new Tom();
        cat.f(1000, 300);

        System.out.printf("%d,%d\n", cat.x, cat.y);
        System.out.printf("%d,%d\n", cat.x, tom.y);
    }
}