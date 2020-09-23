package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class openbrowser {
    @Test
    public void firstBrowser() throws InterruptedException {
        //Ser Chrome Browser Driver
        //System.setproperty("webdriver.chrome.driver","chromedriver.exe")
        //Open Broswer
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://www.gmail.com");
        wd.manage().window().maximize();

        String expectedTitle = "Gmail";
        String actualTitle = wd.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedTitle,actualTitle);
        wd.quit();

        System.out.println("close browser");
        Assert.assertTrue(true);

        /*wd.findElement(By.id("identifierId")).sendKeys("devrajadhikari333@gmail.com");
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wd.findElement(By.xpath("//div[@id='identifierNext']")).click();
        WebElement passwordButton = wd.findElement(By.xpath("//input[@name='Musiclover1@']"));
        //WebDriverWait wait = new WebDriverWait(wd, 30);
        //wait.until(ExpectedConditions.elementToBeClickable(passwordButton));
        passwordButton.sendKeys("Password for Email");
        wd.findElement(By.xpath("//div[@id='passwordNext']")).click();*/
    }
    @Test
    public void facebook() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver wd = new FirefoxDriver();
        wd.get("http://www.facebook.com");
        wd.manage().window().maximize();
        wd.quit();
    }
    @Test
    public void add(){
        int result=10;
        int a=4,b=6;
        Assert.assertEquals(result,a+b);
    }
}
