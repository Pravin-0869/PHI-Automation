package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Sleep_Commands {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://uat-phidashboard.fynity.in/dashboard/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder=\"Email or Phone Number\"]")).sendKeys("pravinkhotfyntune@gmail.com");
        driver.findElement(By.xpath("//input[contains(@name,'robotCheck')]")).click();
        driver.findElement(By.xpath("//input[contains(@name,'termsCheck')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Get OTP')]")).click();
        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'headlessui-input-_r_2_')]"))).sendKeys("1");
        driver.findElement(By.xpath("//*[contains(@id,'headlessui-input-_r_3_')]")).sendKeys("2");
        driver.findElement(By.xpath("//*[contains(@id,'headlessui-input-_r_4_')]")).sendKeys("3");
        driver.findElement(By.xpath("//*[contains(@id,'headlessui-input-_r_5_')]")).sendKeys("4");
        driver.findElement(By.xpath("//*[contains(@id,'headlessui-input-_r_6_')]")).sendKeys("5");
        driver.findElement(By.xpath("//*[contains(@id,'headlessui-input-_r_7_')]")).sendKeys("6");
        driver.findElement(By.xpath("//button[contains(text(),'Verify')]")).click();
        WebElement GET = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'Get A Quote')])[2]")));
        GET.click();
        WebElement Sell = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(text(),'Sell Now')])[1]")));
        Sell.click();
        WebElement Full_name1 = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"fullName\"]")));
//        driver.getWindowHandles();
//        Full_name.sendKeys("Pravin shivaji khot");
//        WebElement Pincode=Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder=\"Select pincode\"]")));
//        Pincode.sendKeys("400604");
        String parentWindow = driver.getWindowHandle();

        WebElement sellNow = Wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Sell Now')])[1]"))
        );

        sellNow.click();
        WebElement Fulll_name=Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Enter full name")));
        Fulll_name.sendKeys("pravin khot");

    }}

