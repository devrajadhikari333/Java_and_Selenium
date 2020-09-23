package ExcelRead;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class excelread {
    WebDriver wd;
    FileInputStream inputStream;
    Workbook workbook; //source.xlsx
    Sheet employeeSheet;

    /*@Before
    public void Setup() throws IOException {
        String fileName = "Source.xlsx";
        //user.dir gives the root folder, here Automation_java
        String filePath = System.getProperty("user.dir") + "\\src\\test\\resources";
        File file = new File(filePath + "\\" +fileName);
        //Create an object of fileInputStream class to read excel file
        inputStream = new FileInputStream(file);
        workbook = new XSSFWorkbook(inputStream);
        employeeSheet = workbook.getSheet("User");
        String site=employeeSheet.getRow(0).getCell(1).getStringCellValue();
        //System.setProperty("webdriver.chrome.driver", "chromedriver_old.exe");
        WebDriverManager.chromedriver().setup();
        //create ChromeDriver instance
        d = new ChromeDriver();
        d.get(site);
        d.manage().window().maximize();
    }
    @Test
    public void readExcel() throws InterruptedException, IOException {
        //find number of rows in excel file
        String email=employeeSheet.getRow(1).getCell(1).getStringCellValue();
        String pass=employeeSheet.getRow(2).getCell(1).getStringCellValue();
        WebElement emailElement = d.findElement(By.name("identifier"));
        emailElement.sendKeys(email);
        WebElement nextButtonElement = d.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]"));
        nextButtonElement.click();
        Thread.sleep(5000);

        WebElement txtPwd = d.findElement(By.name("password"));
        txtPwd.sendKeys(pass);
        WebElement btnNext = d.findElement(By.id("passwordNext"));
        btnNext.click();
        Thread.sleep(5000);
    }

}*/


    @Before
    public void setup() throws IOException {
        String fileName = "Source.xlsx";
        //user.dir gives the root folder, here Automation_java
       String filePath = System.getProperty("user.dir") + "\\src\\test\\resources";
        File file = new File(filePath + "\\" + fileName);
        //Create an object of FileInputStream class to read excel file
        inputStream = new FileInputStream(file);
        workbook = new XSSFWorkbook(inputStream);
       // FileInputStream fs = new FileInputStream("C:\\Users\\devra\\IdeaProjects\\automation_JAVA\\src\\test\\resources\\Source.xlsx");
       // XSSFWorkbook workbook = new XSSFWorkbook(fs);
        employeeSheet = workbook.getSheet("User"); //sheetname
        String site = employeeSheet.getRow(0).getCell(1).getStringCellValue();
        //System.setProperty("webdriver.chrome.driver", "chromedriver_old.exe");
        WebDriverManager.chromedriver().setup();
        //Create ChromeDriver instance
        wd = new ChromeDriver();
        wd.get(site);
        wd.manage().window().maximize();
    }

    @Test
    public void readExcel() throws InterruptedException, IOException {
        //Find number of rows in excel file
        String email = employeeSheet.getRow(1).getCell(1).getStringCellValue();
        String pass = employeeSheet.getRow(2).getCell(1).getStringCellValue();
        WebElement emailElement = wd.findElement(By.name("identifier"));
        emailElement.sendKeys(email);
        WebElement nextButtonElement = wd.findElement(By.xpath("//*[@id='identifierNext']"));
        nextButtonElement.click();
        Thread.sleep(5000);
        //password
        WebElement txtPwd = wd.findElement(By.name("password"));
        txtPwd.sendKeys(pass);
        WebElement btnNext = wd.findElement(By.id("passwordNext"));
        btnNext.click();
        Thread.sleep(5000);
    }
}