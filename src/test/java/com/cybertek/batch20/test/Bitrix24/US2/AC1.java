package com.cybertek.batch20.test.Bitrix24.US2;

import com.cybertek.batch20.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AC1 {
    //1. User should be able to click on "High Priority" checkbox to set the current task to a top priority task.

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com");
    }
    @Test
    public void link() throws InterruptedException {
        WebElement username=driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("helpdesk8@cybertekschool.com");
        WebElement password=driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");
        WebElement loging=driver.findElement(By.xpath("//input[@class='login-btn']"));
        loging.click();
        Thread.sleep(3000);

        WebElement task =driver.findElement(By.id("feed-add-post-form-tab-tasks"));
        task.click();
        Thread.sleep(3000);
        WebElement high= driver.findElement(By.id("tasks-task-priority-cb"));
        high.click();


    }
}
