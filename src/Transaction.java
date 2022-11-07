public class Transaction {
    private int id;
    private String name;
    private String description;
    private double price;

    public Transaction(int id, String name, String description, double amount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = amount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + price + "\n";
    }
}
