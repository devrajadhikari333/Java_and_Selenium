package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class sum {
   @Test
    public void number() throws InterruptedException {
        double sum=0;
        double expected= 90.35;
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");
        wd.manage().window().maximize();
        List<WebElement> rows = wd.findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[6]"));
        for(WebElement row:rows) {
            System.out.println(row.getText());
            double no = Double.parseDouble(row.getText());
            sum = sum+no;
        }
        System.out.println("Total is:"+sum);
        Assert.assertEquals(expected,sum,0.001);
        wd.quit();
    }
}
