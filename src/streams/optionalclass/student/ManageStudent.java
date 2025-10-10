package streams.optionalclass.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ManageStudent {

    private static List<Student> students = new ArrayList<>();

    public static Optional<Student> getById(int id){
        for(Student student : students){
            if(id == student.getRollno()){
                return Optional.ofNullable(student);
            }
        }
        return null ;
    }

    public static void main(String[] args) {

        students.add(new Student(101,"Vinay","12"));
        students.add(new Student(102 , "Archana" , "10"));
        students.add(new Student(103 , "Ullas" , "11"));

        Optional<Student> student = getById(101);

        System.out.println(student);

        Optional<Student> noStudent = getById(15656);

        System.out.println(noStudent);
     }
}
