package filehandling.csvfile;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadUsingOpenCSV {
    public static void main(String[] args) {

        String path = "C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\csvfile\\example.csv";

        try (CSVReader reader = new CSVReader(new FileReader(path))) {

            String[] newLine;
            while ((newLine = reader.readNext()) != null) {
                System.out.println(Arrays.toString(newLine));
            }

        } catch (IOException | CsvValidationException e) {  // ✅ catch both in one
            e.printStackTrace();
        }
    }
}
