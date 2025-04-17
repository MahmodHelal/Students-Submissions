import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Header_Navigate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahmoud Fouad\\Pictures\\SELSNIUM\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.opencart.com/index.php?route=common/home");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement Features = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Features")));
        driver.manage().window().maximize();
        Thread.sleep(2000);
        Features.click();
        WebElement DEMO = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Demo")));
        Thread.sleep(2000);
        DEMO.click();
        WebElement Marketplace = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Marketplace")));
        Thread.sleep(2000);
        Marketplace.click();
        WebElement Blog = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Blog')]")));
        Thread.sleep(2000);
        Blog.click();
        WebElement resources = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Resources')]")));
        Thread.sleep(2000);
        resources.click();
        WebElement Download = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Download")));
        Thread.sleep(2000);
        Download.click();
    }
}