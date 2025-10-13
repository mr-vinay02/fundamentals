package filehandling.fileinputoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BothInone {
    public static void main(String[] args) {

        try(FileInputStream in = new FileInputStream("C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\fileinputoutputstream\\BothInone.java");
                FileOutputStream out = new FileOutputStream("C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\fileinputoutputstream\\example.txt");) {

            int character ;

            while((character = in.read()) != -1){

                out.write(character);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
