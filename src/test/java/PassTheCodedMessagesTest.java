import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Bobfr on 2/7/2017.
 */
public class PassTheCodedMessagesTest {
    @Test
    public void answer() throws Exception {
        Assert.assertEquals(4311, PassTheCodedMessages.answer(new int[]{3,1,4,1}));
    }
    @Test
    public void answer2() throws Exception {
        Assert.assertEquals(94311, PassTheCodedMessages.answer(new int[]{3, 1, 4, 1, 5, 9}));
    }

    @Test
    public void answer3() throws Exception {
        Assert.assertEquals(111111, PassTheCodedMessages.answer(new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
    }

    @Test
    public void answer4() throws Exception {
        Assert.assertEquals(888, PassTheCodedMessages.answer(new int[]{8, 8, 8, 8, 2}));
    }

    @Test
    public void answer5() throws Exception {
        Assert.assertEquals(999999999, PassTheCodedMessages.answer(new int[]{9,9,9,9,9,9,9,9,9}));
    }

    @Test
    public void answer6() throws Exception {
        Assert.assertEquals(0, PassTheCodedMessages.answer(new int[]{1}));
    }

    @Test
    public void answer7() throws Exception {
        Assert.assertEquals(5100, PassTheCodedMessages.answer(new int[]{1,0,0,1,5}));
    }

    @Test
    public void answer8() throws Exception {
        Assert.assertEquals(111, PassTheCodedMessages.answer(new int[]{1,1,1,1,1}));
    }

    @Test
    public void answer9() throws Exception {
        Assert.assertEquals(111, PassTheCodedMessages.answer(new int[]{1,1,1}));
    }

    @Test
    public void answer10() throws Exception {
        Assert.assertEquals(74400, PassTheCodedMessages.answer(new int[]{0,4,0,4,7}));
    }
    @Test
    public void answer11() throws Exception {
        Assert.assertEquals(0, PassTheCodedMessages.answer(new int[]{0,0,0,0,7}));
    }

    @Test
    public void answer12() throws Exception {
        Assert.assertEquals(6, PassTheCodedMessages.answer(new int[]{6}));
    }

    @Test
    public void answer13() throws Exception {
        Assert.assertEquals(0, PassTheCodedMessages.answer(new int[]{0}));
    }

    @Test
    public void answer14() throws Exception {
        Assert.assertEquals(93333333, PassTheCodedMessages.answer(new int[]{3,3,3,1,3,3,3,3,9}));
    }

    @Test
    public void answer15() throws Exception {
        Assert.assertEquals(93, PassTheCodedMessages.answer(new int[]{9,4,3,1}));
    }
}