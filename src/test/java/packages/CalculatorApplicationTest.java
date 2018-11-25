package packages;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class CalculatorApplicationTest {

    @Test
    public void add()
    {
        CalculatorApplication caltest = new CalculatorApplication();
        Assert.assertEquals(2, caltest.add(1,1));
        System.out.println("Unit test for add function finished without error.");

    }

    @Test
    public void subtract() {
        Assert.assertEquals(0, new CalculatorApplication().subtract(1,1));
        System.out.println("Unit test for subtract function finished without error.");

    }

    @Test
    public void multiply() {
        Assert.assertEquals(10, new CalculatorApplication().multiply(5,2));
        System.out.println("Unit test for multiply function finished without error.");
    }

    @Test
    public void divide() {
        Assert.assertEquals(3, new CalculatorApplication().divide(6,2));
        System.out.println("Unit test for divide function finished without error.");
    }

}