import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListner.class)
/**
 * @Author Rishav Kumar RAi
 * Description of class This class contains method to test Stock ui and extends the base class
 */
public class TestClasses extends BaseClass {
    HomePage page;
    FilterPage fpage;

    /***
     * @author=RishavKumarrai
     * @throws InterruptedException
     */


    @Test
    public void verifyhomepage() throws InterruptedException {
        page = new HomePage(driver);
        page.Loginbuttonclick();
        page.EnteremailLogin();
        page.enterpassword();
        page.userlogin();
    }

    /***
     * @author Rishav
     * Description=This method is used to verify the sectors in filter section
     */

    @Test(priority = 2)
    public void verifysector() {
        fpage = new FilterPage(driver);
        fpage.sectorfilter();
        fpage.verifyNoCheckboxSelected();
        fpage.checksectorcheckbox();
        fpage.clickonfiltericon();
    }

    /**
     * @Author Rishav Kumar Rai
     * @Description This method is used to verify the pricebrand filter
     */

    @Test(priority = 3)
    public void verifypricebrand() {
        fpage=new FilterPage(driver);
        fpage.pricebrand();
        fpage.clickonfiltericon();
    }

    /***
     * @Author Rishav Kumar Rai
     * @Description This Method is used to verify the filter button
     */
    @Test(priority = 1)
    public void verifyfilterbutton() {
        fpage = new FilterPage(driver);
        fpage.filterbuttonenabled();
    }

    /***
     * @Author Rishav Kumar Rai
     * @throws InterruptedException
     * @Description This method is used to verify the risk filter
     */
    @Test(priority = 4)
    public void verifyrisksection() throws InterruptedException {
        fpage=new FilterPage(driver);
        fpage.riskfilter();
        fpage.clickonfiltericon();
    }

    /***
     * @Author Rishav Kumar Rai
     * @Description This method is used to verify the radio button
     */
    @Test(priority = 5)
    public void verifymediumriskbutton() {
        fpage=new FilterPage(driver);
        fpage.selectmediumriskfilter();
        fpage.clickonfiltericon();
    }

    /***
     * @Author Rishav Kumar Rai
     * @Description This Method is used to verify the Risk low radio button
     */
    @Test(priority = 6)
    public void verifyriskLowbutton(){
        fpage=new FilterPage(driver);
        fpage.selectlowbutton();
        fpage.clickonfiltericon();
    }

    /***
     * @Author Rishav Kumar Rai
     * @Description This the method is used to verify the High risk radio button
     */
    @Test(priority = 7)
    public void verifyriskhighbutton(){
        fpage=new FilterPage(driver);
        fpage.sellecthighbutton();
        fpage.clickonfiltericon();
    }

}

