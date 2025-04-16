import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SEARCH_WITH_VALID_MARKETPLACE_ITEMS {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahmoud Fouad\\Pictures\\SELSNIUM\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=marketplace/extension&member_token=f07c731065b44b7068f78120f396f3e6");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("filter_search")));
        Thread.sleep(2000);
        search.sendKeys("Paypal");
        Thread.sleep(2000);
        search.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 5; i++) {
            js.executeScript("window.scrollBy(0, 300);");
            Thread.sleep(1000);
        }
    }
}