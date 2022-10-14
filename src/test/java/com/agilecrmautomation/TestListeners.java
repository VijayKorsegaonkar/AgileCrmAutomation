package com.agilecrmautomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestListeners extends BaseClass implements ITestListener,ISuiteListener {
	ExtentReports extentReport;
	ExtentSparkReporter sparkReport;
	public void onStart(ISuite suite) {
		System.out.println("this is onStart Method");
		String reportPath=System.getProperty("user.dir")+"//ExecutionResults//AutomationReport.html";
		sparkReport=new ExtentSparkReporter(reportPath);
		sparkReport.config().setDocumentTitle("AgileCrmAutomationReport");
		sparkReport.config().setReportName("Automation Report");
		// to add information into the html report, we need to create ExtentReports class instance
		extentReport=new ExtentReports();
		extentReport.attachReporter(sparkReport);
		extentReport.setSystemInfo("Username", "Vijay");
		extentReport.setSystemInfo("Environment", "Test");
		extentReport.setSystemInfo("Browser", "Chrome");
	}

	public void onFinish(ISuite suite) {
		System.out.println("this on finish methods");
		driver.quit();
		extentReport.flush();
	}

	public void onStart(ITestContext context) {

		System.out.println("This is onStart method of Test");
	}

	public void onFinish(ITestContext context) {
		System.out.println("This is onFinish method of Test");
	}

	public void onTestStart(ITestResult result) {
	//	String methodName=result.getMethod().getMethodName();
		String methodName=result.getName();
		logger=extentReport.createTest(methodName);
		System.out.println("This is onTestStart method");
	}

	public void onTestSuccess(ITestResult result) {
		//add success information into extent report using logger variable 
				logger.pass("Successfully executed the test:"+result.getName());
		System.out.println("This is onTestSuccess method");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("This is onTestFailure method");
	

	TakesScreenshot takeSc = (TakesScreenshot) driver;
	File screenShotfile = takeSc.getScreenshotAs(OutputType.FILE);

	String fileName = result.getName();

	// get project folder path
	String outputPath = System.getProperty("user.dir") + "//ExecutionResults//Screenshots//" + fileName + ".png";

	File ouputFile=new File(outputPath);

	try
	{

		FileUtils.copyFile(screenShotfile, ouputFile);

	}catch(
	IOException e)
	{
		e.printStackTrace();
	}
	logger.fail("The test execution is failed due to : "+ result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		logger.skip("The test is skipped due to the :" + result.getSkipCausedBy());
		System.out.println("This is onTestSkipped method");
	}

	public void onTestFailedwithTimeout(ITestResult result) {
		System.out.println("This is onTestFailedwithTimeout method");
		onTestFailure(result);
	}

}
