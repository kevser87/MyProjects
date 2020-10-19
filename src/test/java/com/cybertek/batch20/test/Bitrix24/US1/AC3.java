package com.cybertek.batch20.test.Bitrix24.US1;

import com.cybertek.batch20.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AC3 {

    WebDriver driver;

    //  User should be able to attach link by clicking on the link icon
    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com");


    }@Test
    public void link() throws InterruptedException {
        WebElement username=driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("helpdesk8@cybertekschool.com");
        WebElement password=driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");
        WebElement loging=driver.findElement(By.xpath("//input[@class='login-btn']"));
        loging.click();
        WebElement message=driver.findElement(By.id("feed-add-post-form-tab-message"));
        message.click();
        Thread.sleep(3000);

        WebElement link=driver.findElement(By.xpath("//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']"));
        link.click();
        WebElement link2 =driver.findElement(By.xpath("//input[@id='linkidPostFormLHE_blogPostForm-href']"));
        link2.sendKeys("http/www.amazon.com");


    }
}