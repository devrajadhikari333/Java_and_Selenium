package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_class {
    @Test
    public void Itsutra() throws InterruptedException {
        int i,j;
        String[] expected= {"Shrestha","Ramesh",""};
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("https://automationpractice.itsutra.com/");
        wd.manage().window().maximize();
        wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[5]/a")).click();
        Thread.sleep(5000);
        wd.findElement(By.xpath("/html/body/div[2]/p/a")).click();
        Thread.sleep(5000);
        wd.findElement(By.id("LastName")).sendKeys("Sanjyal");
        wd.findElement(By.id("FirstMidName")).sendKeys("Mahesh");
        wd.findElement(By.id("HireDate")).sendKeys("10/10/2020");
        wd.findElement(By.id("OfficeAssignment_Location")).sendKeys("Irving");
        wd.findElement(By.xpath("/html/body/div[2]/form/div/div[5]/div/table/tbody/tr[2]/td[2]/input")).click();
        Thread.sleep(5000);
        wd.findElement(By.xpath("/html/body/div[2]/form/div/div[6]/div/input")).click();
       // wd.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[i]/th[j]"));
    }
}
