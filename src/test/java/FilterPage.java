import org.openqa.selenium.*;
import org.testng.Assert;

import java.util.List;

public class FilterPage extends BaseClass {
    By verifyfilterbutton=By.xpath("//span[contains(.,'Apply')]");
    By verifysector=By.xpath("//span[contains(.,'Sector')]");
    By verifychecbox=By.xpath("//div[@formgroupname='sector']//input");
    By pricebrand=By.xpath("//span[contains(.,' Price Brand')]");
    By riskfilter= By.xpath("//span[contains(.,'Risk ')]");
    By getRiskfiltermedium=By.xpath("//div[@id='riskContainer']//label[contains(.,'Medium')]");
    By getfilterlow=By.xpath("//div[@id='riskContainer']//label[contains(.,'Low')]");
    By getfilterhigh=By.xpath("//div[@id='riskContainer']//label[contains(.,'High')]");

    public FilterPage(WebDriver driver){
        this.driver=driver;

    }
    public void filterbuttonenabled(){
        WebElement filterbutton= driver.findElement(verifyfilterbutton);
        boolean actualvalue=filterbutton.isEnabled();
//        Boolean expectedvalue=true;
        Assert.assertEquals(actualvalue, true);
    }
    public void clickonfiltericon(){
        WebElement applyfilter=driver.findElement(verifyfilterbutton);
        applyfilter.click();
        sa.assertAll();
    }
    public void sectorfilter(){
        Assert.fail("Nethod is fail");
        WebElement sector=driver.findElement(verifysector);
        String Actual=sector.getText();
        String expected="SECTOR";
        Assert.assertEquals(Actual,expected);
        sector.click();
    }
    public void verifyNoCheckboxSelected()
    {
        List<WebElement> checkbox=driver.findElements(verifychecbox);
        for(WebElement selectcheckbox:checkbox) {
            String element=selectcheckbox.getAttribute("id");
            sa.assertFalse(selectcheckbox.isSelected(),element+" is already selected");
        }
    }
    public void checksectorcheckbox(){
        List<WebElement> checkbox=driver.findElements(verifychecbox);
        for(WebElement selectcheckbox:checkbox)
        {
            if(!selectcheckbox.isSelected())
            selectcheckbox.click();
        }
    }
    public void pricebrand(){
        WebElement brand=driver.findElement(pricebrand);
        brand.click();
        String actualbrandtext=brand.getText();
        String expectedbrandtext="PRICE BRAND";
        Assert.assertEquals(actualbrandtext,expectedbrandtext);
}
  public void riskfilter(){
        WebElement risk=driver.findElement(riskfilter);
        String actualrisktext=risk.getText();
        String expectedrisktext="RISK";
      Assert.assertEquals(actualrisktext,expectedrisktext);
      JavascriptExecutor j=(JavascriptExecutor)driver;
      j.executeScript("arguments[0].click()",risk);
    }
    public void selectmediumriskfilter(){
        WebElement mediumbutton=driver.findElement(getRiskfiltermedium);
        JavascriptExecutor j=(JavascriptExecutor)driver;
        j.executeScript("arguments[0].click()",mediumbutton);
//        boolean buttontrue=mediumbutton.isEnabled();
        Assert.assertTrue(mediumbutton.isEnabled(),"btnradio1"+"is enabled");
    }
    public void selectlowbutton(){
        WebElement lowbutton=driver.findElement(getfilterlow);
        JavascriptExecutor j=(JavascriptExecutor)driver;
        j.executeScript("arguments[0].click()",lowbutton);
        Assert.assertTrue(lowbutton.isEnabled(),"riskContainer"+lowbutton+"is enabled");

    }
    public void sellecthighbutton(){
        WebElement highbutton=driver.findElement(getfilterhigh);
        JavascriptExecutor j=(JavascriptExecutor)driver;
        j.executeScript("arguments[0].click()",highbutton);
        Assert.assertTrue(highbutton.isEnabled(),"riskContainer"+highbutton+"is enabled");


    }



}