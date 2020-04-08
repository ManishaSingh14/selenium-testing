package listeners;

import org.testng.*;
import org.testng.xml.XmlSuite;

import java.util.List;

public class AppListener implements ISuiteListener, ITestListener, IReporter {

    @Override
    public void generateReport(List<XmlSuite> list, List<ISuite> list1, String s) {

    }

    @Override
    public void onStart(ISuite iSuite) {
    Reporter.log("on start");
    }

    @Override
    public void onFinish(ISuite iSuite) {
     Reporter.log("on finish");
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
