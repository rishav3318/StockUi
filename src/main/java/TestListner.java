import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestListner extends BaseClass implements ITestListener {
    public WebDriver driver;
    private Object WebDriver;


    @Override
    public void onTestStart(ITestResult result) {
        Reporter.log("Test is started"+" "+result+result.getTestName());


    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Reporter.log("Test is pass"+" "+result+result.getName());

    }

    @Override
    public void onTestFailure(ITestResult result)
    {
//        Date date= new Date();
//        String currentDate=result.getName()+date.toString().replaceAll(" ","_").replaceAll(":","_");
//        String path="C:\\Users\\rkumarrai\\Desktop\\Screenshot\\"+currentDate+".png";
//        TakesScreenshot scrShot =(TakesScreenshot)sdriver;
//        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//        File DestFile=new File(path);
//
//        try {
//            FileUtils.copyFile(SrcFile, DestFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Date date= new Date();
        String currentDate=date.toString().replaceAll(" ","_").replaceAll(":","_");
        String path="C:\\Users\\rkumarrai\\Desktop\\Screenshot\\"+currentDate+".png";
        EventFiringWebDriver event=new EventFiringWebDriver(BaseClass.sdriver);
        File src=event.getScreenshotAs(OutputType.FILE);
        File dest = new File(path);
        try {
            FileUtils.copyFile(src,dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        Reporter.getCurrentTestResult();


    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {


    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {



    }
            }

