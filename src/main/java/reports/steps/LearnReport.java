package reports.steps;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReport {

	public static void main(String[] args) throws IOException {
		//Set the physical path
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./LeaftapsReports/result1.html");
		//create a object for ExtentReports
		//assign the path to that object
		//It is the start of the repoert
		ExtentReports extent=new ExtentReports();
		//assign the start report to that path
		extent.attachReporter(reporter);
		//create a object for ExtentTest
		//it is used to assign the test details
		ExtentTest test=extent.createTest("CreateLead","Create Lead Functionality");
		test.assignCategory("TestleafModule");
		test.assignAuthor("Vino");
		//create a step level status and snap
		test.pass("Enter the company name",MediaEntityBuilder.createScreenCaptureFromPath(".././snapsTestLeaf/cn.png").build());
		test.pass("Enter the First name",MediaEntityBuilder.createScreenCaptureFromPath(".././snapsTestLeaf/fn.png").build());
		test.pass("Enter the Last name",MediaEntityBuilder.createScreenCaptureFromPath(".././snapsTestLeaf/ln.png").build());
  
		extent.flush();

	}

}
