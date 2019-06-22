package streams;

import com.twitter.core.model.user.User;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFilterReduce {
    public static void main(String[] args){

        //  Get the average age of people that are above 18 from List<User>
        List<User> myFriend = new ArrayList<>(){{
            add(new User("Mindaugas", "@m1ndas", 11, null));
            add(new User("Jonas", "@xcz", 2, null));
            add(new User("Petras", "@peter", 42, null));
            add(new User("Jhony", "@jjDj", 33, null));
            add(new User("Pony", "@horse", 12, null));
        }};

        Stream<User> ss = myFriend.stream();

        OptionalDouble avergateAgeAbove18 = ss
                                        .mapToDouble(p -> p.getAge()) // map
                                        .filter(age -> age > 18) // filter
                                        .average(); // reduce

        System.out.println(avergateAgeAbove18.getAsDouble());


        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael");
        List namesLengths = names.stream().map(String::length).collect(Collectors.toList());


        // TODO :: avg salary of indian employees
    }
}
