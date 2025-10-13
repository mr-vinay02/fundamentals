package filehandling.filereaderwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\filereaderwriter\\example.txt");

        int  character ;
        while( (character = reader.read()) != -1){
            System.out.print((char)character);
        }

        reader.close();
    }
}
