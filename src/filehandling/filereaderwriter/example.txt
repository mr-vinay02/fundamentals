package filehandling.filereaderwriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BothInOne {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\filereaderwriter\\example.txt");
        FileReader reader = new FileReader("C:\\Users\\\\sujatha\\\\IdeaProjects\\\\fundamentals\\\\src\\\\filehandling\\\\filereaderwriter\\BothInOne.java");

        int character ;
        while( (character = reader.read()) != -1){

            writer.write((char)character);

        }

        writer.close();
        reader.close();
    }
}
