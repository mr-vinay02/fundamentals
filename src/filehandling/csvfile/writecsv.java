package filehandling.csvfile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class writecsv {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\csvfile\\example.csv";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.append("ID,NAME,AGE\n");
            writer.append("01,vinay,11\n");
            writer.append("02,mari,12\n");
            writer.append("03,ullas,13\n");

            System.out.println(" CSV file written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
