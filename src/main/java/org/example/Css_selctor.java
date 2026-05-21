package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Css_selctor {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://uat-phidashboard.fynity.in/dashboard/login");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#headlessui-input-_r_0_")).sendKeys("pravinkhotfyntune@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='robotCheck']")).click();
        driver.findElement(By.cssSelector("input[name='termsCheck']")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id='headlessui-input-_r_2_']")).sendKeys("1");
        driver.findElement(By.cssSelector("input[id=\"headlessui-input-_r_3_\"]")).sendKeys("2");
        driver.findElement(By.cssSelector("input[id=\"headlessui-input-_r_4_\"]")).sendKeys("3");
        driver.findElement(By.cssSelector("input[id=\"headlessui-input-_r_5_\"]")).sendKeys("4");
        driver.findElement(By.cssSelector("input[id=\"headlessui-input-_r_6_\"]")).sendKeys("5");
        driver.findElement(By.cssSelector("input[id=\"headlessui-input-_r_7_\"]")).sendKeys("6");
        driver.findElement(By.cssSelector("button[type=\"button\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Get A Quote")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='mb-10']//div[3]//div[1]//div[3]//button[1]")).click();//Sell now
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"fullName\"]")).sendKeys("Pravin shivaji khot");







    }
}
