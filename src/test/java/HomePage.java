import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends BaseClass {
    public WebDriver driver;
    By clickLogin=By.xpath("//button[@ng-reflect-router-link='/login']");
    By enteremaillogin=By.xpath("//input[@id='exampleInputEmail1']");
    By enterpassword=By.xpath("//input[@id='exampleInputPassword1']");
    By clickonuserlogin=By.xpath("//button[@type='submit']");
    By verifyfilterbutton=By.xpath("//span[contains(.,' Apply ')]");
    public HomePage(WebDriver driver){

        this.driver=driver;
    }



    public void Loginbuttonclick() throws InterruptedException {

        WebElement Login= driver.findElement(clickLogin);

        Login.click();
    }
    public void EnteremailLogin(){
        WebElement enteremail=driver.findElement(enteremaillogin);
        enteremail.sendKeys("rishav3318@gmail.com");
    }
    public void enterpassword(){
        WebElement enterusername=driver.findElement(enterpassword);
        enterusername.sendKeys("Risu2060@");
        
    }
    public void userlogin(){
        WebElement userloginbutton=driver.findElement(clickonuserlogin);
        userloginbutton.click();
    }
    public void filterbutton(){
        WebElement filterbutton=driver.findElement(verifyfilterbutton);
        filterbutton.isEnabled();
    }



}
