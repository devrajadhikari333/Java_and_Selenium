package testng;

import org.testng.annotations.*;

public class tstng_first {
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before Method");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("Before Method");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Testing");
    }
    @Test
    public void test1()
    {
        System.out.println("test1");
    }
    @Test
    public void test2()
    {
        System.out.println("test2");
    }
    @AfterTest
    public void AfterTest()
    {
        System.out.println("AfterTest");
    }
}
