package filehandling.insurancemanagementsystem;

public class Policies {

    private int id;
    private String name;
    private double amount;

    public Policies(int id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }
}
