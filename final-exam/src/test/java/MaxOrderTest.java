import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxOrderTest {
    @Test
    public void test(){
        MaxOrder maxOrder = new MaxOrder();
        int expect = 8;
        int res =  maxOrder.getResult(8);
        assertEquals(8, res);
    }

}
