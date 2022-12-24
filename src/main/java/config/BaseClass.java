package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static WebDriver driver = initDriverChrome();
    private static WebDriver initDriverChrome(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        return webDriver;
    }
}
