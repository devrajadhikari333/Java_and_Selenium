package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Countrylist {
    @Test
    public void country() throws InterruptedException {
        String expected_result = "Canada";
        int i=0;
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.w3schools.com/html/html_tables.asp");
        wd.manage().window().maximize();
        //WebElement x = wd.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[3]"));
        //System.out.println(x.getText());
        List<WebElement> rows = wd.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/td[3]"));
        for(WebElement row:rows){
            //System.out.println(row.getText());
            if( row.getText().equals(expected_result)) {
                i++;
                break;
            }
        }
        Assert.assertEquals(i,1);
        wd.quit();
    }
}
