package filehandling.filereaderwriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWrite {

    public static void main(String[] args) {

        try {
            File file = new File("src/filehandling/filereaderwriter/example.txt");

            if(!file.exists()){
                if(file.createNewFile())
                    System.out.println("Created new FIle");
            }
            else{
                System.out.println("File already Exist ");
            }

            FileWriter writer = new FileWriter(file.getAbsoluteFile());

            writer.write("Hello Vinay!\n");
            writer.write("This is a FileWriter example.\n");
            writer.write("Java makes file handling easy!");

            writer.close();

            System.out.println(" Data written successfully to example.txt");


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
