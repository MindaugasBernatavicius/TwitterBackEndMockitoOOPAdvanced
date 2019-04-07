package generics;

import com.twitter.core.model.message.Tweet;
import com.twitter.core.model.user.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenericDynamicArrayTest {

    GenericDynamicArray gda;

    @Before
    public void setup(){
        gda = new GenericDynamicArray(10);
    }

    @Test
    public void addChar_passingACharacter_worksFine(){
        // given
        Character c = 'c';

        // when
        gda.add(c);

        // then
        Assert.assertEquals('c', gda.getAt(0));
    }

    @Test
    public void addChar_passingATweet_worksFine(){
        // given
        Tweet tw = new Tweet(3, "Tweet text",
                new User("Mindaugas","@m1ndas", 18, null),
                null,null, null);

        // when
        gda.add(tw);

        // then
        Assert.assertSame(tw, gda.getAt(0));

        System.out.println(gda.getAt(0));
    }
}
