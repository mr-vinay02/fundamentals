package streams.problems.studentresultprocessing;

public class Student
{
    private int id;
    private String name;
    private double score;

    // Constructor
    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getScore() { return score; }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', score=" + score + "}";
    }
}


