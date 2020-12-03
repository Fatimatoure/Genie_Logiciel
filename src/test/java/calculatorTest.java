import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class calculatorTest {

    calculator calculator;
    @Before
    public void setUp() throws Exception {
        calculator = new calculator();
    }
    @Test
    public void testSum() {
        int result = calculator.sum(3, 23);
        Assert.assertEquals(26, result);
    }

    @Test
    public void testMinus() {
        Assert.assertEquals(2, calculator.minus(22, 20));
    }

    @Test
    public void testDivid() {
        Assert.assertEquals(2, calculator.divid(6, 3));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(12, calculator.multiply(3,4));
    }

    @Test
    public void testMin() {
        int tab[]={51, 24, 19, 5, 37, 76, 61, 99, 101, 36};
        int a=calculator.minElement(tab);
        Assert.assertEquals(5,a);
    }

    @Test
    public void testMax() {
        int tab[]={51, 24, 19, 5, 37, 76, 61, 99, 101, 36,2,4,7,8};
        int max=calculator.maxElement(tab);
        Assert.assertEquals(101,max);

    }

}