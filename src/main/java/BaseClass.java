import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.util.concurrent.TimeUnit;
public class BaseClass {
    public WebDriver driver;
    public static WebDriver sdriver;
    SoftAssert sa= new SoftAssert();
//    public String url="http://localhost:4200/";

    @BeforeClass
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2021.2.3\\chromedriver.exe");
        driver = new ChromeDriver();
        sdriver=driver;
        //driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:4200/");

    }
    @AfterClass
    public static void generatereport(){

    }
    @AfterClass
    public void closebrowser() throws InterruptedException {
        Thread.sleep(5000);

        driver.close();
    }

}
