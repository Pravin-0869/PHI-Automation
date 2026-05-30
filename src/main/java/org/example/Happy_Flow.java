package org.example; ////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.chrome.ChromeDriver;
////import org.openqa.selenium.edge.EdgeDriver;
////
////public class org.example.Happy_Flow {
////
////    public static void main(String[] args)throws InterruptedException {
////
////        WebDriver driver = new ChromeDriver();
////        driver.get("https://uat-phidashboard.fynity.in/dashboard/login");
////        driver.manage().window().maximize();
////        Thread.sleep(3000);
////        driver.findElement(By.id("headlessui-input-_r_23_")).sendKeys("pravinkhotfyntune@gmail.com");
////
////        Thread.sleep(3000);
////        driver.close();
////    }
////}
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import java.time.Duration;
//
//public class org.example.Happy_Flow {
//    public static void main(String[] args)throws InterruptedException {
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://uat-phidashboard.fynity.in/dashboard/login");
//        driver.manage().window().maximize();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(
//                By.xpath("//input[contains(@id,'headlessui-input')]")
//        )).sendKeys("pravinkhotfyntune@gmail.com");
//
//        Thread.sleep(3000);
//
//        driver.quit();
//    }
//}

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

public class Happy_Flow {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://uat-phidashboard.fynity.in/dashboard/login");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.name("emailOrMobile")
        )).sendKeys("pravinkhotfyntune@gmail.com");

        wait.until(ExpectedConditions.elementToBeClickable(
                By.name("robotCheck")
        )).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.name("termsCheck")
        )).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[normalize-space()='Get OTP']")
        )).click();

        List<WebElement> otpBoxes = wait.until(
                ExpectedConditions.numberOfElementsToBeMoreThan(
                        By.xpath("//input[@maxlength='1']"), 5)
        );

        String otp = "123456";

        for (int i = 0; i < otp.length(); i++) {
            otpBoxes.get(i).sendKeys(String.valueOf(otp.charAt(i)));
        }

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[normalize-space()='Verify']")
        )).click();

        wait.until(ExpectedConditions.urlContains("dashboard"));

        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.tagName("body")
        ));

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='Get A Quote']")
        )).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h1[contains(text(),'Get A Quote')]")
        ));

        WebElement sellNow = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("(//button[normalize-space()='Sell Now'])[1]")
        ));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sellNow);


        driver.findElement(By.partialLinkText("Get A Quote")).click();

        driver.quit();
    }
}