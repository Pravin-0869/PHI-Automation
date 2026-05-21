package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class handle_window {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        driver.get("https://uat-phidashboard.fynity.in/dashboard/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name=\"emailOrMobile\"]")).sendKeys("pravinkhotfyntune@gmail.com");
        driver.findElement(By.xpath("//input[contains(@name,'robotCheck')]")).click();
        driver.findElement(By.xpath("//input[contains(@name,'termsCheck')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Get OTP')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'headlessui-input-_r_2_')]"))).sendKeys("1");
        driver.findElement(By.xpath("//*[contains(@id,'headlessui-input-_r_3_')]")).sendKeys("2");
        driver.findElement(By.xpath("//*[contains(@id,'headlessui-input-_r_4_')]")).sendKeys("3");
        driver.findElement(By.xpath("//*[contains(@id,'headlessui-input-_r_5_')]")).sendKeys("4");
        driver.findElement(By.xpath("//*[contains(@id,'headlessui-input-_r_6_')]")).sendKeys("5");
        driver.findElement(By.xpath("//*[contains(@id,'headlessui-input-_r_7_')]")).sendKeys("6");
        driver.findElement(By.xpath("//button[contains(text(),'Verify')]")).click();

        WebElement get= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Get A Quote')])[2]")));
       get.click();
       WebElement Sell=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(text(),'Sell Now')])[1]")));
       Sell.click();

        Set<String> WindowIDs=driver.getWindowHandles();
        List<String> windowList=new ArrayList<>(WindowIDs);
        String ParentID=windowList.get(0);
        String ChildID=windowList.get(1);
        driver.switchTo().window(ChildID);
        System.out.println(driver.getTitle());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Enter full name\"]"))).sendKeys("pravin shivaji khot");
        driver.findElement(By.xpath("//input[@placeholder=\"Select pincode\"]")).sendKeys("400604");
        driver.findElement(By.xpath("(//*[contains(text(),'Individual')])[1]")).click();
        WebElement field = driver.findElement(By.xpath("(//*[contains(@id,'Self')])[2]"));
        field.click();
        field.sendKeys("78");
        field.sendKeys(Keys.ARROW_DOWN);
        field.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[contains(.,'Calculate Premium')]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[contains(text(),'Buy now')]")));
        Thread.sleep(10000);
        WebElement buyNow = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[contains(text(),'Buy now')]")));
        buyNow.click();

    }
}
