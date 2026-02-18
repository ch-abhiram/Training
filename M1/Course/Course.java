package first.src.M1.Course;

public class Course {
    private int id;
    private String title;
    private String category;
    private double price;
    private int availableSeats;

    public Course(int id, String title, String category, double price, int availableSeats) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.price = price;
        this.availableSeats = availableSeats;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void decreaseSeat(){
        availableSeats--;
    }
    public void increaseSeat(){
        availableSeats++;
    }
}
