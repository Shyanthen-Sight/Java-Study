public class Foreign_City extends CommonCac{
    public Foreign_City() {

    }

    public Foreign_City(String packageId, int weight, String receiver) {
        super(packageId, weight, receiver);
    }

    @Override
    public int calculateShippingCost(int weight) {
        int cost=10*weight+15;
        return cost;
    }
}
