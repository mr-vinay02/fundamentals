package filehandling.jsonfile;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class JsonReader {

    public static void main(String[] args) throws IOException {

        try(FileReader reader = new FileReader("C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\jsonfile\\example.json"))
        {
            JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();

            System.out.println("NAME : "+ jsonObject.get("name").getAsString());
            System.out.println("AGE :" + jsonObject.get("age").getAsInt());
            System.out.println("SkILLS :" +  jsonObject.get("skills"));

        }
    }
}
