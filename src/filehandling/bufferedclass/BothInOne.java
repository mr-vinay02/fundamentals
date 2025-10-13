package filehandling.bufferedclass;

import java.io.*;

public class BothInOne {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\bufferedclass\\BothInOne.java"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\bufferedclass\\example.txt"));

        String line ;

        while((line = reader.readLine()) != null){
            writer.write(line);
            writer.newLine();
        }

        writer.flush();
        writer.close();
        reader.close();

    }
}
