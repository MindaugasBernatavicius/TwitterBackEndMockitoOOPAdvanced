package fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIldIOExample {

    public static void main(String args[]) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        // C:\Users\bernam\Desktop\TwitterBackEndMockitoOOPAdvanced
        Path currentRelativePath = Paths.get("");
        String s = ((Path) currentRelativePath).toAbsolutePath().toString();
        System.out.println(s);

        try {
            in = new FileInputStream("./target/classes/input.csv");
//            out = new FileOutputStream("./target/classes/output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}

