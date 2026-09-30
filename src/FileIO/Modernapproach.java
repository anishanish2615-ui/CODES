package FileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Modernapproach {
    public static void main(String[] args)throws IOException {
        Files.writeString(Path.of("output.txt"),"Quick writer");

        String content = Files.readString(Path.of("output.txt"));
        System.out.println(content);

        List<String> lines=Files.readAllLines(Path.of("output.txt"));
        for(String line:lines){
            System.out.println(line);
        }
    }
}
