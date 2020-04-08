package listeners;

import org.testng.*;
import org.testng.xml.XmlSuite;


import java.util.List;

public class TestListener implements ISuiteListener, ITestListener,IReporter {
    @Override
    public void onStart(ISuite iSuite) {
        Reporter.log("start suite",true);
        System.out.println("listener");
    }

    @Override
    public void onFinish(ISuite iSuite) {
       Reporter.log("finish suite",true);
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        Reporter.log("onrestart");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
      Reporter.log("passed",true);
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
     Reporter.log("failed",true);
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
       Reporter.log("on test skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
       Reporter.log("on test failed but within success percentage");
    }

    @Override
    public void onStart(ITestContext iTestContext) {
       Reporter.log("on start");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        Reporter.log("on finish");
    }
    @Override
    public void generateReport(List<XmlSuite> list, List<ISuite> list1, String s) {

    }
}
