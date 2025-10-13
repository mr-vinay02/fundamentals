package filehandling.createdeletefile;


import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) throws IOException {

         File file = new File("C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\createdeletefile\\example.txt");

         if(file.exists()) {
             if (file.delete())
                 System.out.println("File is Successfully Deleted ");
             else
                 System.out.println("File can't delete");
         }
         else
             System.out.println("File not found ");

    }
}
