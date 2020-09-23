package Udemy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_dropdowns {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\devra\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.get("https://rahulshettyacademy.com/AutomationPractice/");
        d.manage().window().maximize();
        // Select class only works with static dropdowns where the tagname in select.
        Select s = new Select(d.findElement(By.id("dropdown-class-example")));
        //Option in static dropdowns can be seleted using three different class.
        //s.selectByIndex(2);
        //s.selectByValue("option2");
        s.selectByVisibleText("Option2");
        //d.quit();
    }
}
