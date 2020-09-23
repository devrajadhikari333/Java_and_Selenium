package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNgParameter {

    @Test
    @Parameters({"id","name"})
    public void getIdName(int id, String name)
    {
        System.out.println("Getting values from .xml file" +id+ "and" +name );
    }
}
