package BDD.StepsDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    WebDriver driver;
    String passd = "Test@123";
    @Given("^User is in gmail login page$")
    public void userIsInGmailLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.gmail.com");
        driver.manage().window().maximize();
    }

    @When("^Enters valid user in User Field$")
    public void entersValidUserInUserField() {
        WebElement username = driver.findElement(By.id("identifierId"));
        username.sendKeys("qatesting00567@gmail.com");

    }

    @And("^click next button$")
    public void clickNextButton() {
        WebElement clck = driver.findElement(By.className("VfPpkd-RLmnJb"));
        clck.click();
    }

    @And("^Enters valid password in password field$")
    public void entersValidPasswordInPasswordField() throws Throwable{
        Thread.sleep(5000);
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys(passd);
    }

    @And("^Click on next button to login$")
    public void clickOnNextButtonToLogin() {
        WebElement clk = driver.findElement(By.className("VfPpkd-RLmnJb"));
        clk.click();
    }

    @Then("^Verify User is on email profile$")
    public void verifyUserIsOnEmailProfile() {
    }

    @And("^Enters invalid password in password field$")
    public void entersInvalidPasswordInPasswordField() throws Throwable {
        Thread.sleep(5000);
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("123456");
    }

    @Then("^Display Error message$")
    public void displayErrorMessage() throws Throwable {
        Thread.sleep(5000);
        WebElement err = driver.findElement(By.xpath("//div[@jsname='B34EJ']/span"));
        //WebElement err = driver.findElement(By.xpath("//*[@id=\'view_container\']/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span"));
        System.out.println(err.getText());
    }
}
