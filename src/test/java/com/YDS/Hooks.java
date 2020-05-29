package com.YDS;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseMain {

    private static CustomExtentReporter customExtentReporter;
    private static boolean isReporterRunning;

    BaseMain bm = new BaseMain();
    @Before
    public void setUp(){
        bm.openBrowser("firefox");
    }


    @After
    public void tearDown(){
        bm.closeBrowser();

    }

}
