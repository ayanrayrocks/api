package com.api.listners;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener implements ITestListener {

    private static final Logger log = LogManager.getLogger(TestListener.class);


    public void onTestStart(ITestResult iTestResult) {
        log.info("Test start" + iTestResult.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult iTestResult) {
        log.info("Test success" + iTestResult.getMethod().getMethodName());
    }

    public void onTestFailure(ITestResult iTestResult) {
        log.info("Test failure" + iTestResult.getMethod().getMethodName());
    }

    public void onTestSkipped(ITestResult iTestResult) {
        log.info("Test skipped" + iTestResult.getMethod().getMethodName());
    }

    public void onTestFinish(ITestResult iTestResult) {
        log.info("Test finished" + iTestResult.getMethod().getMethodName());
    }

}
