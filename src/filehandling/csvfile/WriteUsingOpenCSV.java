package filehandling.csvfile;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingOpenCSV {

    public static void main(String[] args)  throws IOException {

        String path = "C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\csvfile\\example.csv";

        try(CSVWriter writer = new CSVWriter(new FileWriter(path)))
        {

            String[] header = {"ID" , "NAME" ,"AGE"};
            String[] row1 = {"01","VINAY" , "22"};
            String[] row2 = {"02" ,"Mari" , "23"};
            String[] row3 = {"01","VINAY" , "22"};
            String[] row4 = {"02" ,"Mari" , "23"};


            writer.writeNext(header);
            writer.writeNext(row1);
            writer.writeNext(row2);
            writer.writeNext(row3);
            writer.writeNext(row4);
        }
    }
}
