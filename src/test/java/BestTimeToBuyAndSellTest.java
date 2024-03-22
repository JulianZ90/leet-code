import array.BestTimeToBuyAndSell;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellTest {

    @Test
    public void test1(){
        BestTimeToBuyAndSell bestTimeToBuyAndSell = new BestTimeToBuyAndSell();
        int maxProfit = bestTimeToBuyAndSell.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        assertEquals(5, maxProfit);
    }

    @Test
    public void test2(){
        BestTimeToBuyAndSell bestTimeToBuyAndSell = new BestTimeToBuyAndSell();
        int maxProfit = bestTimeToBuyAndSell.maxProfit(new int[]{7,6,4,3,1});
        assertEquals(0, maxProfit);
    }

    @Test
    public void test3(){
        BestTimeToBuyAndSell bestTimeToBuyAndSell = new BestTimeToBuyAndSell();
        int maxProfit = bestTimeToBuyAndSell.maxProfit(new int[]{2,4,1});
        assertEquals(2, maxProfit);
    }


}
