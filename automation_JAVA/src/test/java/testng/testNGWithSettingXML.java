package testng;
import org.testng.annotations.*;

public class testNGWithSettingXML {
    @Test
    public void t1()
    {
        System.out.println("Running normal t1");
    }
    @Test
    public void t2()
    {
        System.out.println("Running normal t2");
    }
    @Test(groups = {"Regression"})
    public void r1()
    {
        System.out.println("Running Regression r1");
    }
    @Test(groups = {"Regression"})
    public void r2()
    {
        System.out.println("Running Regression r2");
    }
    @Test(groups = {"Smoke"})
    public void s1()
    {
        System.out.println("Running smoke s1");
    }
    @Test(groups = {"Smoke"})
    public void s2()
    {
        System.out.println("Running smoke s2");
    }
    @Test(groups = {"Sanity"})
    public void s3()
    {
        System.out.println("Running sanity testing s3");
    }
    @Test(groups = {"Sanity"})
    public void s4()
    {
        System.out.println("Running sanity testing s4");
    }
}
