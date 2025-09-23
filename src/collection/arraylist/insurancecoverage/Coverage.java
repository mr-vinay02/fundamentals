package collection.arraylist.insurancecoverage;

public class Coverage {

    private String type;
    private double amount;
    private double premium;

    public Coverage(String type, double amount, double premium) {
        this.type = type;
        this.amount = amount;
        this.premium = premium;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getPremium() {
        return premium;
    }

    @Override
    public String toString() {
        return "Coverage{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                ", premium=" + premium +
                '}';
    }
}
