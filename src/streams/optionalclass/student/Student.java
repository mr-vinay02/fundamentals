package streams.optionalclass.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Student {
    private int rollno;
    private String name;
    private String studing;

    public Student(int rollno, String name, String studing) {
        this.rollno = rollno;
        this.name = name;
        this.studing = studing;
    }

    private static List<Student> students = new ArrayList<>();



    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStuding(String studing) {
        this.studing = studing;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getStuding() {
        return studing;
    }




    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", studing='" + studing + '\'' +
                '}';
    }
}
