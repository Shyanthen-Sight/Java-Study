public class classDog {
    String dog_name;
    String dog_age;

    public classDog(String dog_name, String dog_age) {
        this.dog_name = dog_name;
        this.dog_age = dog_age;
    }

    public String getDog_name() {
        return dog_name;
    }

    public void setDog_name(String dog_name) {
        this.dog_name = dog_name;
    }

    public String getDog_age() {
        return dog_age;
    }

    public void setDog_age(String dog_age) {
        this.dog_age = dog_age;
    }

    public void showDog(){
        System.out.println("狗的名字是：" + this.dog_name + "，年龄是：" + this.dog_age);
    }
}
