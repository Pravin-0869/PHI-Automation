package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class X_path {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://uat-phidashboard.fynity.in/dashboard/login");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name=\"emailOrMobile\"]")).sendKeys("pravinkhotfyntune@gmail.com");
        driver.findElement(By.xpath("//input[@name=\"robotCheck\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"termsCheck\"]")).click();
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Verify')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[contains(text(),'Get A Quote')])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[contains(text(),'Sell Now')])[3]")).click();
//      Set<String> Window_ID=driver.getWindowHandles();
//      System.out.println(Window_ID);
        Thread.sleep(2000);
        Boolean b=driver.findElement(By.xpath("//input[contains(@placeholder,'Enter full name') or contains(@id,'fullName')]")).isDisplayed();
        System.out.println(b);
        driver.findElement(By.xpath("//input[contains(@id,'headlessui-combobox-input-«r4»')]")).sendKeys("400001");
    }
}
// Element not found exception= when Your locater is incorrect
// no-such-element-exception=Element is not present in your page