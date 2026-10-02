public class add {
    public static void main(String[] args) {
        Add add = new Add(10,20);
        System.out.println("a + b = " + add.add());

        double x=add.add(10.5,20.5);
        System.out.println("10.5 + 20.5 = " + x);

        int a=add.getA();
        int b=add.getB();
        System.out.println("a = " + a + ", b = " + b);

        a=30;
        b=40;
        add.setA(a);
        add.setB(b);
        System.out.println("a + b = " + add.add());
    }
}

class Add {
    int a;
    int b;

    public Add(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int add() {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
