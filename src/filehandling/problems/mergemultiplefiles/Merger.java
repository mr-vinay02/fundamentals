package filehandling.problems.mergemultiplefiles;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Merger {

    public static void main(String[] args) {

        List<String> files = Arrays.asList(
                "C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\problems\\mergemultiplefiles\\file1.txt",
                "C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\problems\\mergemultiplefiles\\file2.txt",
                "C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\problems\\mergemultiplefiles\\file3.txt"
        );

        String mergerFilePath = "C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\problems\\mergemultiplefiles\\merger.txt" ;



        try (BufferedWriter writer = new BufferedWriter(new FileWriter(mergerFilePath))) {

            for (String path : files) {

                BufferedReader reader = new BufferedReader(new FileReader(path));

                String line;
                while((line = reader.readLine()) != null){
                    writer.write(line);
                    writer.newLine();
                }

            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
