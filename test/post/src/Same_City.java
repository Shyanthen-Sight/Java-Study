public class Same_City extends CommonCac{
    public Same_City(String packageId, int weight, String receiver) {
        super(packageId, weight, receiver);
    }

    public Same_City() {
    }

    @Override

    public int calculateShippingCost(int weight) {
        int cost=10*weight+10;
        return cost;
    }
}
