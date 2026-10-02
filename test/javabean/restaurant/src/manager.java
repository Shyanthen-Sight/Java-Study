public class manager extends person {
    private String manageBonus;

    public manager() {

    }

    public manager(String name, int id, double salary, String manageBonus) {
        super(name, id, salary);
        this.manageBonus = manageBonus;
    }

    public String getManageBonus() {
        return manageBonus;
    }

    public void setManageBonus(String manageBonus) {
        this.manageBonus = manageBonus;
    }

    public void manage() {
        System.out.println(getName() + " is managing with a bonus of " + manageBonus + ".");
    }
}
