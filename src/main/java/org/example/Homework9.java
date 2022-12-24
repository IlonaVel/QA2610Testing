package org.example;

import config.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Homework9 extends BaseClass {
    static By buttonLocator = By.id("btn-consultation-hero");
    public static void main(String[] args) throws InterruptedException {
        WebElement button;
        List <WebElement> webElementList;
        driver.get("https://ithillel.ua/courses/qa-automation");
        button = driver.findElement(buttonLocator);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(button.getText());
        webElementList=driver.findElements(By.tagName("a"));
        for (WebElement l:webElementList){
            System.out.println(l.getAttribute("href"));
        }
        By somecss = By.cssSelector("#btn-consultation-hero");
        By somexpath = By.xpath("//*[@id=\"btn-consultation-hero\"]");
        System.out.println(button.getText());
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.quit();
    }
}