package filehandling.csvfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Readcsv {

    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\csvfile\\example.csv");

        BufferedReader bufferedReader = new BufferedReader(reader);

        String line ;

        while( ( line = bufferedReader.readLine()) != null){

            String[] values = line.split(",");

            System.out.println(Arrays.toString(values));
        }
    }
}
