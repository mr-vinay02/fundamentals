package filehandling.bufferedclass;

import java.io.*;

public class BufferedRead {

    public static void main(String[] args) throws IOException {



        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\bufferedclass\\example.txt"));

        String line ;
        while((line = bufferedReader.readLine()) != null ){
            System.out.println(line);
        }
    }
}
