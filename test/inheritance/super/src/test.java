public class test {
    public static void main(String[] args) {
      Zi z=new Zi();
      z.ziShow();
    }

}


class  Fu {
    String name="Fu";
    String address="Nanjing";
}

class Zi extends Fu{
    String name="Zi";
    String address="Chongqing";
    public void ziShow() {
        //输出为Zi
        System.out.println(name);
        System.out.println(this.name);
        //输出为Fu
        System.out.println(super.name);

        System.out.println(address);
        System.out.println(this.address);
        System.out.println(super.address);
    }
}



