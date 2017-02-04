import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Bobfr on 2/4/2017.
 */
public class TheCakeIsNotALieTest {
    @Test
    public void answer() throws Exception {
        Assert.assertEquals(2, TheCakeIsNotALie.answer("abccbaabccba"));
    }
    @Test
    public void answer2() throws Exception {
        Assert.assertEquals(4, TheCakeIsNotALie.answer("abcabcabcabc"));
    }

    @Test
    public void answer3() throws Exception {
        Assert.assertEquals(3, TheCakeIsNotALie.answer("aaabbaaabbaaabb"));
    }

    @Test
    public void answer4() throws Exception {
        Assert.assertEquals(1, TheCakeIsNotALie.answer("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzfzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }


    @Test
    public void answer5() throws Exception {
        Assert.assertEquals(1, TheCakeIsNotALie.answer("aafaaaa"));
    }

    @Test
    public void answer6() throws Exception {
        Assert.assertEquals(1, TheCakeIsNotALie.answer("a"));
    }

}