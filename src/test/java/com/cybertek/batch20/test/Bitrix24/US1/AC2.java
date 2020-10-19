package com.cybertek.batch20.test.Bitrix24.US1;

import com.cybertek.batch20.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AC2 {
    //2. User should be able to add users from selecting contact from E-mail user,
    // Employees and Departments and Recent
    //contact lists
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com");

    }
    @Test
    public void US1AC2() throws InterruptedException {
        WebElement username=driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("helpdesk8@cybertekschool.com");
        WebElement password=driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");
        WebElement loging=driver.findElement(By.xpath("//input[@class='login-btn']"));
        loging.click();
        WebElement message=driver.findElement(By.id("feed-add-post-form-tab-message"));
        message.click();
        Thread.sleep(3000);
        WebElement add=driver.findElement(By.id("bx-destination-tag"));
        add.click();
        Thread.sleep(2000);
        WebElement allemployers= driver.findElement(By.linkText("All employees"));
        allemployers.click();

        WebElement name1 =driver.findElement(By.linkText("helpdesk23@cybertekschool.com"));
       name1.click();
       Thread.sleep(3000);
       name1.click();
       Thread.sleep(3000);

       WebElement employee=driver.findElement(By.linkText("Employees and departments"));
       employee.click();

       WebElement name2=driver.findElement(By.xpath("//div[@class='bx-finder-company-department-employee-name']"));
       name2.click();
       Thread.sleep(2000);

       WebElement email=driver.findElement(By.linkText("E-mail users"));
       email.sendKeys("cybertek@gmail.com");



    }
}