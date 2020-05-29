package com.YDS;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverInfo;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class BaseMain {
    public static WebDriver driver;

    public void openBrowser(String Browser) {
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
        WebDriverManager.getInstance(DriverManagerType.EDGE).setup();
        WebDriverManager.getInstance(DriverManagerType.IEXPLORER).setup();

        switch (Browser) {
            case "firefox":
                driver = new FirefoxDriver();
                break;

            case "Edge":
                driver = new EdgeDriver();
                break;

            case "Opera":
                driver = new OperaDriver();
                break;

            case "IExplorer":
                driver = new InternetExplorerDriver();
                break;

            default:
                driver = new ChromeDriver();
                break;

        }
        driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void closeBrowser() {
        driver.quit();
    }


}
