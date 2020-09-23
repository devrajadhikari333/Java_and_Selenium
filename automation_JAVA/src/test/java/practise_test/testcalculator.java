package practise_test;

import org.junit.Assert;
import org.junit.Test;

public class testcalculator {
    @Test
    public void testadd(){
        calculator c= new calculator();
        Assert.assertEquals(10, c.add(5,5));
    }
    @Test
    public void testsub(){
        calculator c= new calculator();
        Assert.assertEquals(0, c.sub(5,5));
    }
    @Test
    public void testmultiply(){
        calculator c= new calculator();
        Assert.assertEquals(25, c.mul(5,5));
    }
    @Test
    public void testdiv(){
        calculator c= new calculator();
        Assert.assertEquals(0, c.div(5,5));
    }
    @Test
    public void testfac(){
        calculator c= new calculator();
        Assert.assertEquals(3, c.fac(5,5));
    }
}
