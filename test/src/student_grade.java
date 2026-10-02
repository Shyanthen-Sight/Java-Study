class Student{
    String name;
    double score;
     static int count = 0;
    Student(String name,double score){
        this.name = name;
        this.score = score;
        Student.count++;
    }
    void showInfo(){
        System.out.println("姓名:" + this.name + ",成绩:" + this.score);
    }
    void changeScore(double newScore){
        this.score = newScore;
    }
}
public class student_grade {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 80);
        Student s2 = new Student("李四", 90);
        s1.showInfo();
        s2.showInfo();
        Student s3=s1;
        s3.changeScore(95);
        System.out.println("s1的成绩为：" + s1.score);
        System.out.println("s3的成绩为：" + s3.score);
        System.out.println("学生对象个数：" + Student.count);
    }
}
