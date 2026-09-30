package FileIO;

import java.io.FileWriter;
import java.io.Writer;

public class Writing {
    public static void main(String[] args) {
        try {
            FileWriter Writer = new FileWriter("output.txt");
            Writer.write("Hello World");
            Writer.write("Max verstappen you are the world champion");
            Writer.close();
            System.out.println("Successfully wrote to the file.");
        }catch (Exception e){
            System.out.println("Error writing to the file."+e.getMessage());
        }
    }
}
