// 抽象父类：图形
abstract class Shape {
    // 抽象方法：没有方法体，只定义规范，子类必须实现
    public abstract double getArea();

    // 普通方法，抽象类可以有完整方法
    public void showInfo() {
        System.out.println("图形面积 = " + getArea());
    }
}

// 子类：圆形，继承抽象类Shape，必须重写抽象方法getArea
class Circle extends Shape{
    private double r;
    public Circle(double r){
        this.r = r;
    }
    // 实现抽象方法
    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}

// 子类：矩形，继承抽象类Shape
class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(double w, double h){
        this.width = w;
        this.height = h;
    }
    @Override
    public double getArea() {
        return width * height;
    }
}

public class abstractDemo {
    public static void main(String[] args) {
        // Shape s = new Shape(); // ❌错误！抽象类不能new对象

        // 多态：父类引用指向子类对象
        Shape circle = new Circle(2);
        circle.showInfo();

        Shape rect = new Rectangle(3,4);
        rect.showInfo();
    }
}
