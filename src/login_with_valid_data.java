import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class login_with_valid_data {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahmoud Fouad\\Pictures\\SELSNIUM\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.opencart.com/index.php?route=account/login");
        driver.manage().addCookie(new Cookie("cf_clearance", "9IYdTQ6aLuV1.eh2smJVWNjSpnDTx41Qe8Oa070ijmg-1743871717-1.2.1.1-dIENmwu13uCKeAEA26Hv2xzCgQybSRVyJj36rPZsIK9hagHQSrXPlNOqYW8Ydv7XLT4ffi7NTetkSMXo1e59ZvFBZCcp0rici58b68qvIwjjhp3Govma4H6X3cZoRGz85zZwCapWofom5J9nDU.iuylMeH12YO3XS__lpGOsyxfcqvUMCMnh.j5B3rOQ2Ijyxt7nVzZ7M0GIK6Wd4REIIAOghuFDvySZ4j21nh2QrscuFjHzbP3KzOFHYr2cB_zo5a1iTj.iPWQqNVr_8HDgFTGUdiGFsE58.m.JjBqj.mnhMfmz3yXEGF4mEEJhgiA7.WvWgwyVlST8JyeFaCn.dW1q48USChjZ8ty7WPBBwn_Xy3TRAsBjgHqOsiqExr3V"));
        driver.manage().addCookie(new Cookie("session", "abc12345"));
        driver.navigate().refresh();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email")));
        email.sendKeys("ffgghh2228@gmail.com");
        Thread.sleep(2000);
        WebElement Password1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-password")));
        Password1.sendKeys("01100138137");
        Password1.sendKeys(Keys.ENTER);
        WebElement PIN = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("pin")));
        PIN.sendKeys("2213");
        PIN.sendKeys(Keys.ENTER);
    }
}
