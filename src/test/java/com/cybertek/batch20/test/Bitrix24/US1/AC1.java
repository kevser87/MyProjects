package com.cybertek.batch20.test.Bitrix24.US1;

import com.cybertek.batch20.test.utility.Driver;
import com.cybertek.batch20.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AC1 {
    // 1. User should be able to click on upload files icon to upload files and pictures from local disks,
    // download from external drive, select documents from bixtrix24, and create files to upload
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com");


} @Test
    public void upload() throws InterruptedException {
        WebElement username=driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("helpdesk8@cybertekschool.com");
        WebElement password=driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");
        WebElement loging=driver.findElement(By.xpath("//input[@class='login-btn']"));
        loging.click();
        WebElement message=driver.findElement(By.id("feed-add-post-form-tab-message"));
        message.click();
        Thread.sleep(3000);

        WebElement file=driver.findElement(By.id("bx-b-uploadfile-blogPostForm"));
        file.click();
        Thread.sleep(3000);
       /*String path ="/Users/kevsireadlig/Desktop/Testsforupload.png";
        WebElement upload= driver.findElement(By.xpath("//div[@class='diskuf-uploader']"));
        upload.click();
        Thread.sleep(3000);
        upload.sendKeys(path);*/

        WebElement select=driver.findElement(By.xpath("//span[@class='wd-fa-add-file-light-title-text diskuf-selector-link']"));
        select.click();
        Thread.sleep(3000);
        WebElement select1=driver.findElement(By.linkText("My Drive"));
        select1.click();
        WebElement select3=driver.findElement(By.xpath("//a[@class='bx-file-dialog-content-link bx-file-dialog-icon bx-file-dialog-icon-folder']"));
        WebElement select4=driver.findElement(By.xpath("//span[@class='popup-window-button popup-window-button-disabled']"));

        select4.click();
        Thread.sleep(3000);
        WebElement download= driver.findElement(By.xpath("//span[@class='wd-fa-add-file-light-title diskuf-selector-link-cloud']"));
        download.click();
        WebElement googledrive= driver.findElement(By.xpath("//span[@class='bx-file-dialog-tab-item-link-text']"));
        googledrive.click();
        WebElement selected= driver.findElement(By.xpath("//span[@class='popup-window-button popup-window-button-disabled']"));
        selected.click();

        WebElement createpage=driver.findElement(By.xpath("//span[@class='wd-fa-add-file-editor-text']"));
        createpage.click();
        WebElement googledoc=driver.findElement(By.xpath("//span[@class='menu-popup-item-text']"));
        googledoc.click();





    }
}
