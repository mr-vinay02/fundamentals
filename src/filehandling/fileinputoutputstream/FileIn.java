package filehandling.fileinputoutputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileIn {

    public static void main(String[] args) throws IOException {

        FileInputStream in = new FileInputStream("C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\fileinputoutputstream\\example.txt");

        int character ;
        while((character = in.read()) != -1){

            System.out.print((char) character);

        }


    }
}
