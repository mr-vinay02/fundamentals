package filehandling.createdeletefile;

import java.io.File;
import java.io.IOException;

public class PermissionTOFile {

    public static void main(String[] args)throws IOException {

        File file = new File("src/filehandling/createdeletefile/permission.txt");

        if(file.createNewFile()) {
            if (file.exists())
                System.out.println("File is created");
        }
        else{
            System.out.println("File is Exists");
        }



        System.out.println("File can be Readable :"+file.canRead());
        System.out.println("File can be Writable :"+file.canWrite());
        System.out.println("File can be Exectable :"+file.canExecute());

        file.setReadable(false);
        file.setWritable(false);
        file.setExecutable(false);

        System.out.println("File can be Readable :"+file.canRead());
        System.out.println("File can be Writable :"+file.canWrite());
        System.out.println("File can be Exectable :"+file.canExecute());


        if(file.delete())
            System.out.println("File is Deleted Successfully");

    }
}

