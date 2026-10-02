public class CommonCac {
    private String packageId;
    private int weight;
    private  String receiver;

    public CommonCac() {
    }

    public CommonCac(String packageId, int weight, String receiver) {
        this.packageId = packageId;
        this.weight = weight;
        this.receiver = receiver;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public int calculateShippingCost(int weight) {
      int cost=10*weight;
        return cost;
    }
}
