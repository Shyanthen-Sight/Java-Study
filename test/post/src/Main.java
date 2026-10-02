//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Foreign_City foreignCity=new Foreign_City("123", 10, "Alice");
         Same_City sameCity=new Same_City("456", 20, "Bob");
         System.out.println("Foreign City Shipping Cost: " + foreignCity.calculateShippingCost(10));
         System.out.println("Same City Shipping Cost: " + sameCity.calculateShippingCost(20));
        }
    }
