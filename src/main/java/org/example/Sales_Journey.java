package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Sales_Journey {
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

        WebElement SI=driver.findElement(By.xpath("//*[@placeholder='Select sum insured']"));
        SI.click();
        Thread.sleep(2000);
        SI.sendKeys("1 Crore");
        SI.sendKeys(Keys.ARROW_DOWN);
        SI.sendKeys(Keys.ENTER);


        driver.findElement(By.xpath("(//*[contains(text(),'Individual')])[1]")).click();
        WebElement field = driver.findElement(By.xpath("(//*[contains(@id,'Self')])[2]"));
        field.click();
        field.sendKeys("78");
        field.sendKeys(Keys.ARROW_DOWN);
        field.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[contains(.,'Calculate Premium')]"))).click();
        Thread.sleep(5000);
        WebElement buyNow = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[contains(text(),'Buy now')]")));
        buyNow.click();
        Thread.sleep(5000);
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));

// Click dropdown button
        WebElement identifyProofDropdown = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[@aria-haspopup='listbox']")
                )
        );
        identifyProofDropdown.click();

// Click Aadhaar Card option
        WebElement aadhaarOption = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//div[@role='option' and normalize-space()='Aadhaar Card']")
                )
        );
        aadhaarOption.click();
        //Upload Aadhar
        WebElement uploadFront = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//*[@name='identityProofDocumentFrontPath']")
                )
        );
        uploadFront.sendKeys("C:\\Users\\HP\\Downloads\\bhargav adhar front.jpg");

        WebElement uploadBack = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//*[@name='identityProofDocumentBackPath']")
                )
        );
       uploadBack.sendKeys("C:\\\\Users\\\\HP\\\\Downloads\\\\bhargav aadhar back.jpg");
        File front = new File("C:\\Users\\HP\\Downloads\\bhargav adhar front.jpg");
        File back = new File("C:\\Users\\HP\\Downloads\\bhargav aadhar back.jpg");

        uploadFront.sendKeys(front.getAbsolutePath());
        uploadBack.sendKeys(back.getAbsolutePath());
        //Select Second idetify Proof Aadhar
        Actions actions = new Actions(driver);

// open dropdown2
        WebElement dropdown = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("(//div[@class='w-full font-normal text-textBlack truncate'])[2]")
                )
        );
        dropdown.click();

// wait for option and click visible text
        WebElement aadhaarOption2 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("(//*[contains(text(),'Aadhaar Card')])[2]")
                )
        );

//        actions.moveToElement(aadhaarOption2).click().perform();

        //Print all Error Messages
        List<WebElement> messages = driver.findElements(
                By.xpath("//*[contains(@class,'text-red')]"));

        for(WebElement msg : messages)
        {
            if(!msg.getText().trim().isEmpty())
            {
                System.out.println(msg.getText());
            }
        }
        aadhaarOption2.click();
        Thread.sleep(30000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Continue')]"))).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Continue')])[2]"))).click();
//marital status Dropdown
        WebElement marital = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//*[contains(text(),'Select marital status')]")
                ));

        marital.click(); // Open dropdown
//Occupation Dropdown
        actions.sendKeys(Keys.ARROW_DOWN)   // Move to next option
                .sendKeys(Keys.ARROW_DOWN)   // Move again if needed
                .sendKeys(Keys.ENTER)        // Select option
                .perform();

        WebElement Occupation=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"headlessui-combobox-input-«r9l»\"]")));
        Occupation.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
       //Annual income Dropdown
        WebElement Annualincome=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"headlessui-listbox-button-«rac»\"]")));
        Annualincome.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[contains(text(),'No')])[3]"))).click();
        // Form 60
        WebElement From60=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"form60\"]")));
        From60.sendKeys(front.getAbsolutePath());


    }}
