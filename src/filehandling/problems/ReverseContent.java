package filehandling.problems;

import filehandling.bufferedclass.BufferedRead;

import java.io.*;

public class ReverseContent {

    public static void main(String[] args) {

        StringBuilder reverse = new StringBuilder();

        String inputFilePath = "C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\input.txt";
        String outputFilePath = "C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\problems\\reverse.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter (outputFilePath))
        ){

            String line ;

            while( (line = reader.readLine()) != null){

                reverse.append(line).append("\n");
            }

            reverse.reverse();

            writer.write(reverse.toString());



        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
