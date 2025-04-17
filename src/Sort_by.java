import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Sort_by {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahmoud Fouad\\Pictures\\SELSNIUM\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
                driver.get("https://www.opencart.com/index.php?route=marketplace/extension&member_token=f07c731065b44b7068f78120f396f3e6");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        WebElement commercialButton = driver.findElement(By.xpath("//a[contains(text(), 'Commercial')]"));
        Thread.sleep(1000);
        commercialButton.click();
        WebElement SORTdropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-sort")));
        Thread.sleep(1000);
        Select dropdown = new Select(SORTdropdownElement);
        dropdown.selectByVisibleText("Rating");
        Thread.sleep(1000);
        WebElement categoryButton = driver.findElement(By.xpath("//a[contains(text(), 'Marketplaces')]"));
        categoryButton.click();
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 5; i++) {
            js.executeScript("window.scrollBy(0, 300);");
            Thread.sleep(1000);
        }
    }
}
