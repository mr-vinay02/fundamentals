package filehandling.createdeletefile;

import java.io.File;

public class CreateNewFile {
    public static void main(String[] args) throws Exception {

         File file = new File("C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\createdeletefile\\example.txt");

         if(file.createNewFile())
             System.out.println("File is Successfully Created : "+file.getName());

         else
             System.out.println("File is alraedy exist ");


        System.out.println("File name : "+file.getName());
        System.out.println("File name :" +file.getPath());
        System.out.println("File can be Readable :"+file.canRead());
        System.out.println("File can be Writable :" +file.canWrite());


    }
}
