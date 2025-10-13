package filehandling.fileinputoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOut {

    public static void main(String[] args) throws IOException {

        FileOutputStream out = new FileOutputStream("C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\fileinputoutputstream\\example.txt");

        String sentence = "I am Vinay ";
        byte[] sentenceByte =  sentence.getBytes();
        out.write(sentenceByte);



    }
}
