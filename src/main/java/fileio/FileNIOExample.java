package fileio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileNIOExample {
    public static void main(String[] args){

        List<Person> myFriends = new ArrayList<>();

        try {
            List<String> linesOfText = Files.readAllLines(Paths
                    .get("./target/classes/input.csv"), StandardCharsets.UTF_8);

            for(int i = 0; i < linesOfText.size(); i++){
                if(i == 0)
                    continue;

                // System.out.println(linesOfText.get(i));
                String[] vals = linesOfText.get(i).split(",");
                // add a new person to a list of friends
                myFriends.add(new Person(Integer.parseInt(vals[0]), vals[1], Integer.parseInt(vals[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Person friend: myFriends) {
            System.out.println(friend);
        }
    }
}