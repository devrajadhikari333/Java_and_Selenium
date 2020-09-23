package Udemy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] arg) {
       // WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\devra\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());
        driver.get("https://www.yahoo.com");
        driver.navigate().back(); //navigate back to previous page
        driver.navigate().forward(); //navigate forward to next page
        driver.close(); //closes current browser
        driver.quit(); // closes all the browser open by selenium script
    }
}
