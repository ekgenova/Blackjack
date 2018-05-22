import org.junit.Assert;
import org.junit.Test;

public class BlackjackTest {

    @Test
    public void blackjackTest(){
        Blackjack blackjack = new Blackjack();
        Assert.assertEquals(20, blackjack.blackjack(20, 25));
        Assert.assertEquals(0, blackjack.blackjack(23,24));
        Assert.assertEquals(18, blackjack.blackjack(22, 18));
        Assert.assertEquals(16, blackjack.blackjack(5,16));
    }
}
