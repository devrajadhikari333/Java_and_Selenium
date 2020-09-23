package Udemy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\devra\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:spicejet.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        //driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("(//a[@text='Chennai (MAA)'])[2]")).click(); //when there are more than 1 similar xpath available we can use index xpath.
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        //if client doesnt accept the index Xpath,
        //we can use parent child relation Xpath
    }
}
