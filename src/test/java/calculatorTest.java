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
        int result = calculator.sum(40, 6);
        Assert.assertEquals(46, result);
    }

    @Test
    public void testMinus() {
        Assert.assertEquals(4, calculator.minus(20,16));
    }

    @Test
    public void testDivid() {
        Assert.assertEquals(4, calculator.divid(12, 3));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(12, calculator.multiply(3,4));
    }

    @Test
	public void testMin(){
		int min = calculator.min(10,20);bash: t: command not found

                Assert.assertEquals(20,max);
	}
    @Test 
	public void testMax(){
		int max = calculator.max(2000, -2000);
		Assert.assertEquals(2000,max);
	}
    @Test
    public void testMinElement() {
        int tab[]={51, 24, 19, 5, 37, 76, 61, 99, 101, 36};
        int a=calculator.minElement(tab);
        Assert.assertEquals(5,a);
    }

    @Test
    public void testMaxElement() {
        int tab[]={51, 24, 19, 5, 37, 76, 61, 99, 300, 36,2,4,7,8};
        int max=calculator.maxElement(tab);
        Assert.assertEquals(300,max);

    }

}
