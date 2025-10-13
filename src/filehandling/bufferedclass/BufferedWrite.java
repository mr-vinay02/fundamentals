package filehandling.bufferedclass;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWrite {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\bufferedclass\\example.txt");

        if(!file.exists()){
            if(file.createNewFile())
                System.out.println("File Created Successfully");
        }
        else{
            System.out.println("File is Exists");
        }

        FileWriter writer = new FileWriter(file.getAbsoluteFile());

        BufferedWriter bufferedWrite = new BufferedWriter(writer);

        bufferedWrite.write("Hello Vinay!");
        bufferedWrite.newLine();
        bufferedWrite.write("BufferedWriter makes writing faster!");
        bufferedWrite.newLine();
        bufferedWrite.write("Java I/O simplified.");

        bufferedWrite.flush();

        writer.close();

        System.out.println("✅ Data written successfully using BufferedWriter.");

    }
}
