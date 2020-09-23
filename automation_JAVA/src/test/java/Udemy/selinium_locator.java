package Udemy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selinium_locator {
    public static void main(String[] arg) {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\devra\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.get("http://www.facebook.com");
        d.manage().window().maximize();
        d.findElement(By.name("email")).sendKeys("devrajadhikari333");
        d.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Musiclover1@");
        d.findElement(By.name("login")).click();
        //d.findElement(By.linkText("Forgot account?")).click();
        d.close();
    }
}
