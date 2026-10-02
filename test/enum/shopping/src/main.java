public class main {
    public static void main(String[] args) {

    OrderState o1=OrderState.PAYMENT_PENDING;
    System.out.println(o1.getName());
    switch (o1){
        case PAYMENT_PENDING:
            System.out.println("订单待支付");
            break;
        case PROCESSING:
            System.out.println("订单处理中");
            break;
        case SHIPPED:
            System.out.println("订单已发货");
            break;
        case OUT_FOR_DELIVERY:
            System.out.println("订单运输中");
            break;
        case DELIVERED:
            System.out.println("订单已送达");
            break;
        case CANCELED:
            System.out.println("订单已取消");
            break;
    }
    }
}
