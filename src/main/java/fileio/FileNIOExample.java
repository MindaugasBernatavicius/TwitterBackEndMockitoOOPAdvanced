package fileio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNIOExample {
    public static void main(String[] args){
        //    Product product = new Product();
        try {
            List<String> productLines = Files.readAllLines(Paths.get("./target/classes/input.csv"), StandardCharsets.UTF_8);
            for (:
                 ) {
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}