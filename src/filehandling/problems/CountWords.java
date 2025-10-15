package filehandling.problems;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {

    public static void main(String[] args) {

        int wordCount = 0;
        String path = "C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\input.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(path))){

            String line;
            while((line = reader.readLine()) != null){
                String[] words = line.split(" ");
                for (String word : words){
                    wordCount++;
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Number of the Words in the line :"+wordCount);
    }
}
