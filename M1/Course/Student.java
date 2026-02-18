package first.src.M1.Course;

public class Student {
    private int id;
    private String name;
    private String city;
    private String type;

    public Student(int id, String name, String city, String type) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getType() {
        return type;
    }
}
