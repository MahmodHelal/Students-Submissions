import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class register {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahmoud Fouad\\Pictures\\SELSNIUM\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/register");
        driver.manage().addCookie(new Cookie("cf_clearance", "xMMENbSxGnXu7zDtlL7tv3qqC9zYAul2o97hccXr3T8-1743358002-1.2.1.1-cuyprlqeKHQR4g2GSXNjcT8IB2smd7pyTpD55H.ULVDUju3RHtH72xzIjRSTTPUAh81AuIexpxUFpBZP3x4h0S4JhOsdObKrNUMwSXOu6uYdrJUhICsXUfprXj12bc.1OK53Yan86ht.VRW86eokMr4E70OGm4tW.2BUcTMfWCruR7WUajqtZz7Eq1mVoFHB4ytRt4ioGgVih4wUygSQgDRCbR5Dd2hVCEwXX0qwwVHUZBXOzvm48IIvEu0cQgpWdiRNDXJAnX.LkJ138OtbBcql0TEfdfvULucYgOVYLLuAvBIF43q3Asek1jdiZSlWWZfZ2waAJ.y8fnECDTKu4EFRweZmC0F3Vejjopesb_eseTC_TSKQxa8gcXXBDdocru4SZju993wnTNUd4lOaGjhSbkv3sFGxV6w_G_wJIS4"));
        driver.manage().addCookie(new Cookie("session", "abc12345"));
        driver.navigate().refresh();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        WebElement username= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-username")));
        username.sendKeys("Mahmoud22222");
        Thread.sleep(1000);
        WebElement firstname= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-firstname")));
        firstname.sendKeys("Mahmoud");
        Thread.sleep(1000);
        WebElement lastname= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-lastname")));
        lastname.sendKeys("Fouad");
        Thread.sleep(1000);
        WebElement email= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email")));
        email.sendKeys("ffgghh2228@gmail.com");
        Thread.sleep(1000);
        WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-country")));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("Egypt");
        Thread.sleep(1000);
        WebElement Password1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-password")));
        Password1.sendKeys("01100138137");
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 2; i++) {
            js.executeScript("window.scrollBy(0, 300);");
            Thread.sleep(1000);
        }
        Thread.sleep(6000);
        WebElement registerButton = driver.findElement(By.xpath("//button[@type='submit' and contains(@class, 'btn-primary')]"));
        registerButton.click();


    }
}
