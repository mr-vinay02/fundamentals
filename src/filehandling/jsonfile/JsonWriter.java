package filehandling.jsonfile;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class JsonWriter {
    public static void main(String[] args) throws IOException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        JsonData data = new JsonData("vinay" , 22 ,new String[]{"java" ,"Spring" , "Mysql"});

        try(FileWriter writer = new FileWriter("C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\jsonfile\\example.json"))
        {
            gson.toJson(data,writer);
        }

    }
}
