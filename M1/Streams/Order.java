package first.src.M1.Streams;

public class Order {
    private int orderId;
    private String customerName;
    private String category;
    private double amount;
    private String city;
    private String status;

    // Constructor
    public Order(int orderId, String customerName, String category,
                 double amount, String city, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.category = category;
        this.amount = amount;
        this.city = city;
        this.status = status;
    }

    // Getters
    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public String getCity() {
        return city;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // toString()
    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", category='" + category + '\'' +
                ", amount=" + amount +
                ", city='" + city + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
