package org.example;

import config.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testik extends BaseClass {
    static WebElement counter;
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://google.com");
        searchString ("Украина");
        System.out.println(getResult());
        Thread.sleep(5000);
        driver.quit();

    }

    private static String getResult() {
        return driver.findElement(By.id("result-stats")).getText();
    }

    private static void searchString(String str){
        WebElement search;
        By searchBy = By.tagName("input");
        search = driver.findElement(searchBy);
        search.sendKeys(str);
        search.submit();
    }
}
