public class main2 {
    public static void main(String[] args) {
        //获取所有枚举项
        OrderState[] states=OrderState.values();
        System.out.println("所有订单状态：");
        for (int i=0;i<states.length;i++) {
            System.out.println(states[i]);
        }
        //获取一个指定的枚举项
        OrderState o1=OrderState.valueOf("SHIPPED");
        System.out.println("指定订单状态：" + o1);

    }
}
