import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


import java.security.Key;
import java.time.Instant;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//public class Open_Browsers {
//    public static void main(String[] args){
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahmoud Fouad\\Pictures\\SELSNIUM\\Selenium\\Drivers\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
////        driver.navigate().to("https://www.google.co.uk/");
////      // WebElement search= driver.findElement(By.name("q"));
////        //WebElement search= driver.findElement(By.xpath("//textarea[@class="gLFyf\"]"));
////       search.sendKeys("موعد صلاة الظهر");
////       search.sendKeys(Keys.ENTER);
//        driver.navigate().to("https://www.facebook.com/?locale=ar_AR");
//         WebElement search= driver.findElement(By.id("email"));
//       // WebElement search= driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
//        search.sendKeys("ffgghh2228@gmail.com");
//        WebElement password= driver.findElement(By.id("pass"));
//        password.sendKeys("9999999999");
//        search.sendKeys(Keys.ENTER);
public class Open_Browsers {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahmoud Fouad\\Pictures\\SELSNIUM\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("https://www.google.co.uk/");
//      // WebElement search= driver.findElement(By.name("q"));
//        WebElement search= driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
//       search.sendKeys("موعد صلاة الظهر");
//       search.sendKeys(Keys.ENTER);
        //  driver.navigate().to("https://www.opencart.com/index.php?route=account/register");
        //WebElement login= driver.findElement(By.("btn btn-link navbar-btn"));
        //login.click();
        // WebElement search= driver.findElement(By.xpath("//
//        WebElement username= driver.findElement(By.id("input-username"));
//        // WebElement search= driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
//        username.sendKeys("Mahmoud22");
//        WebElement firstname= driver.findElement(By.id("input-firstname"));
//        firstname.sendKeys("Mahmoud");
//        WebElement lastname= driver.findElement(By.id("input-lastname"));
//        lastname.sendKeys("Fouad");
//        WebElement email= driver.findElement(By.id("input-email"));
//        email.sendKeys("ffgghh2228@gmail.com");
//        WebElement country= driver.findElement(By.id("input-country"));
//        country.("Fouad");
//        email.sendKeys(Keys.ENTER);
        /// /////////////////////////////////////////////////
        /// /////////////////////////////////////////////////
        /// ////////////////////////////////////////////////
        /// //////////////register with valid data /////////////////////////////////////////////
//        driver.navigate().to("https://www.demoblaze.com/");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("signin2")));
//        signup.click();
//        WebElement Username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign-username")));
//        Username.sendKeys("Mahmoud22");
//        WebElement Password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign-password")));
//        Password.sendKeys("01100138137");
//        WebElement signUpButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Sign up')]")));
//       signUpButton.click();
        /// //////////////////////////////////////////////
        /// //////////////register with empty fields /////////////////////////////////////////////
//        driver.navigate().to("https://www.demoblaze.com/");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("signin2")));
//        signup.click();
//        WebElement signUpButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Sign up')]")));
//        signUpButton.click();
        /// //////////////////////////////////////////////////////
        /// //////////////register with existing data /////////////////////////////////////////////
//        driver.navigate().to("https://www.demoblaze.com/");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("signin2")));
//        signup.click();
//        WebElement Username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign-username")));
//        Username.sendKeys("Mahmoud22");
//        WebElement Password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign-password")));
//        Password.sendKeys("01100138137");
//        WebElement signUpButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Sign up')]")));
//        signUpButton.click();
        /// ///////////////////////////////////////////////////////////////////////
        /// //////////////register with invalid data /////////////////////////////////////////////
//        driver.navigate().to("https://www.demoblaze.com/");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("signin2")));
//        signup.click();
//        WebElement Username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign-username")));
//        Username.sendKeys("@");
//        WebElement Password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign-password")));
//        Password.sendKeys("1");
//        WebElement signUpButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Sign up')]")));
//        signUpButton.click();
        /// ////////////////////////////////////////////
        /// //////////////Login with valid data /////////////////////////////////////////////
//        driver.navigate().to("https://www.demoblaze.com/");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement Login = wait.until(ExpectedConditions.elementToBeClickable(By.id("login2")));
//        Login.click();
//        WebElement Username1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
//        Username1.sendKeys("Mahmoud22");
//        WebElement Password1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")));
//        Password1.sendKeys("01100138137");
//        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Log in')]")));
//        loginButton.click();
/// ////////////////////////////////////////////
/// //////////////Login with empaty fields /////////////////////////////////////////////
//        driver.navigate().to("https://www.demoblaze.com/");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement Login = wait.until(ExpectedConditions.elementToBeClickable(By.id("login2")));
//        Login.click();
//        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Log in')]")));
//        loginButton.click();
        /// ////////////////////////////////////////////
        /// //////////////Login with wrong user name /////////////////////////////////////////////
//        driver.navigate().to("https://www.demoblaze.com/");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement Login = wait.until(ExpectedConditions.elementToBeClickable(By.id("login2")));
//        Login.click();
//        WebElement Username1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
//        Username1.sendKeys("Mahmoud33333");
//        WebElement Password1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")));
//        Password1.sendKeys("01100138137");
//        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Log in')]")));
//        loginButton.click();
        /// ////////////////////////////////////////////
        /// //////////////Login with wrong Password /////////////////////////////////////////////
//        driver.navigate().to("https://www.demoblaze.com/");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement Login = wait.until(ExpectedConditions.elementToBeClickable(By.id("login2")));
//        Login.click();
//        WebElement Username1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
//        Username1.sendKeys("Mahmoud33333");
//        WebElement Password1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")));
//        Password1.sendKeys("2222222222");
//        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Log in')]")));
//        loginButton.click();
        /// ////////////////////////////////////////////
        /// //////////////Login Log out functionality fields /////////////////////////////////////////////
//        driver.navigate().to("https://www.demoblaze.com/");
//       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement Login = wait.until(ExpectedConditions.elementToBeClickable(By.id("login2")));
//        Login.click();
//        WebElement Username1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
//        Username1.sendKeys("Mahmoud22");
//        WebElement Password1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")));
//        Password1.sendKeys("01100138137");
//        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Log in')]")));
//        loginButton.click();
//        WebElement Logout = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout2")));
//        Logout.click();
        /// ///////////////////////header Navigate/////////////////////
//          driver.navigate().to("https://www.opencart.com/index.php?route=account/login");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        WebElement Features = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Features")));
        //        driver.manage().window().maximize();
//        Thread.sleep(2000);
//        Features.click();
//        WebElement DEMO = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Demo")));
//        Thread.sleep(2000);
//        DEMO.click();
//        WebElement Marketplace = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Marketplace")));
//        Thread.sleep(2000);
//        Marketplace.click();
//        WebElement Blog = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Blog')]")));
//        Thread.sleep(2000);
//        Blog.click();
//        WebElement resources = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Resources')]")));
//        Thread.sleep(2000);
//        resources.click();
//        WebElement Download = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Download")));
//        Thread.sleep(2000);
//        Download.click();
        //////////////// login with valid data /////////////////
//        driver.navigate().to("https://www.opencart.com/index.php?route=account/login");
//        driver.manage().addCookie(new Cookie("cf_clearance", "xMMENbSxGnXu7zDtlL7tv3qqC9zYAul2o97hccXr3T8-1743358002-1.2.1.1-cuyprlqeKHQR4g2GSXNjcT8IB2smd7pyTpD55H.ULVDUju3RHtH72xzIjRSTTPUAh81AuIexpxUFpBZP3x4h0S4JhOsdObKrNUMwSXOu6uYdrJUhICsXUfprXj12bc.1OK53Yan86ht.VRW86eokMr4E70OGm4tW.2BUcTMfWCruR7WUajqtZz7Eq1mVoFHB4ytRt4ioGgVih4wUygSQgDRCbR5Dd2hVCEwXX0qwwVHUZBXOzvm48IIvEu0cQgpWdiRNDXJAnX.LkJ138OtbBcql0TEfdfvULucYgOVYLLuAvBIF43q3Asek1jdiZSlWWZfZ2waAJ.y8fnECDTKu4EFRweZmC0F3Vejjopesb_eseTC_TSKQxa8gcXXBDdocru4SZju993wnTNUd4lOaGjhSbkv3sFGxV6w_G_wJIS4"));
//        driver.manage().addCookie(new Cookie("session", "abc12345"));
//        driver.navigate().refresh();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //        driver.manage().window().maximize();
//    WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email")));
//    email.sendKeys("ffgghh2228@gmail.com");
//        Thread.sleep(2000);
//    WebElement Password1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-password")));
//    Password1.sendKeys("01100138137");
// Password1.sendKeys(Keys.ENTER);
// WebElement PIN= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("pin")));
//       PIN.sendKeys("2213");
//        PIN.sendKeys(Keys.ENTER);
        //////////////// login LOGOUT FUNCTIONALITY /////////////////
//        driver.navigate().to("https://www.opencart.com/index.php?route=account/login");
//        driver.manage().addCookie(new Cookie("cf_clearance", "xMMENbSxGnXu7zDtlL7tv3qqC9zYAul2o97hccXr3T8-1743358002-1.2.1.1-cuyprlqeKHQR4g2GSXNjcT8IB2smd7pyTpD55H.ULVDUju3RHtH72xzIjRSTTPUAh81AuIexpxUFpBZP3x4h0S4JhOsdObKrNUMwSXOu6uYdrJUhICsXUfprXj12bc.1OK53Yan86ht.VRW86eokMr4E70OGm4tW.2BUcTMfWCruR7WUajqtZz7Eq1mVoFHB4ytRt4ioGgVih4wUygSQgDRCbR5Dd2hVCEwXX0qwwVHUZBXOzvm48IIvEu0cQgpWdiRNDXJAnX.LkJ138OtbBcql0TEfdfvULucYgOVYLLuAvBIF43q3Asek1jdiZSlWWZfZ2waAJ.y8fnECDTKu4EFRweZmC0F3Vejjopesb_eseTC_TSKQxa8gcXXBDdocru4SZju993wnTNUd4lOaGjhSbkv3sFGxV6w_G_wJIS4"));
//        driver.manage().addCookie(new Cookie("session", "abc12345"));
//        driver.navigate().refresh();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //        driver.manage().window().maximize();
//        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email")));
//        email.sendKeys("ffgghh2228@gmail.com");
//        Thread.sleep(2000);
//        WebElement Password1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-password")));
//        Password1.sendKeys("01100138137");
//        Password1.sendKeys(Keys.ENTER);
//        WebElement PIN = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("pin")));
//        PIN.sendKeys("2213");
//        PIN.sendKeys(Keys.ENTER);
//        Thread.sleep(2000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        WebElement logoutButton = driver.findElement(By.xpath("//a[contains(@href, 'route=account/logout')]"));
//        js.executeScript("arguments[0].click();", logoutButton);
////////////////// Invalid Login - Wrong Password /////////////////
//      driver.navigate().to("https://www.opencart.com/index.php?route=account/login");
//        driver.manage().addCookie(new Cookie("cf_clearance", "xMMENbSxGnXu7zDtlL7tv3qqC9zYAul2o97hccXr3T8-1743358002-1.2.1.1-cuyprlqeKHQR4g2GSXNjcT8IB2smd7pyTpD55H.ULVDUju3RHtH72xzIjRSTTPUAh81AuIexpxUFpBZP3x4h0S4JhOsdObKrNUMwSXOu6uYdrJUhICsXUfprXj12bc.1OK53Yan86ht.VRW86eokMr4E70OGm4tW.2BUcTMfWCruR7WUajqtZz7Eq1mVoFHB4ytRt4ioGgVih4wUygSQgDRCbR5Dd2hVCEwXX0qwwVHUZBXOzvm48IIvEu0cQgpWdiRNDXJAnX.LkJ138OtbBcql0TEfdfvULucYgOVYLLuAvBIF43q3Asek1jdiZSlWWZfZ2waAJ.y8fnECDTKu4EFRweZmC0F3Vejjopesb_eseTC_TSKQxa8gcXXBDdocru4SZju993wnTNUd4lOaGjhSbkv3sFGxV6w_G_wJIS4"));
//        driver.manage().addCookie(new Cookie("session", "abc12345"));
//        driver.navigate().refresh();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //        driver.manage().window().maximize();
//        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email")));
//        email.sendKeys("ffgghh2228@gmail.com");
//          Thread.sleep(2000);
//       WebElement Password1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-password")));
//         Password1.sendKeys("011000138137");
//          Password1.sendKeys(Keys.ENTER);
//////////////// Invalid Login - Wrong Email /////////////////
//        driver.navigate().to("https://www.opencart.com/index.php?route=account/login");
//        driver.manage().addCookie(new Cookie("cf_clearance", "xMMENbSxGnXu7zDtlL7tv3qqC9zYAul2o97hccXr3T8-1743358002-1.2.1.1-cuyprlqeKHQR4g2GSXNjcT8IB2smd7pyTpD55H.ULVDUju3RHtH72xzIjRSTTPUAh81AuIexpxUFpBZP3x4h0S4JhOsdObKrNUMwSXOu6uYdrJUhICsXUfprXj12bc.1OK53Yan86ht.VRW86eokMr4E70OGm4tW.2BUcTMfWCruR7WUajqtZz7Eq1mVoFHB4ytRt4ioGgVih4wUygSQgDRCbR5Dd2hVCEwXX0qwwVHUZBXOzvm48IIvEu0cQgpWdiRNDXJAnX.LkJ138OtbBcql0TEfdfvULucYgOVYLLuAvBIF43q3Asek1jdiZSlWWZfZ2waAJ.y8fnECDTKu4EFRweZmC0F3Vejjopesb_eseTC_TSKQxa8gcXXBDdocru4SZju993wnTNUd4lOaGjhSbkv3sFGxV6w_G_wJIS4"));
//        driver.manage().addCookie(new Cookie("session", "abc12345"));
//        driver.navigate().refresh();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //        driver.manage().window().maximize();
//        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email")));
//        email.sendKeys("ffh2228@gmail.com");
//        Thread.sleep(2000);
//        WebElement Password1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-password")));
//        Password1.sendKeys("01100138137");
//        Password1.sendKeys(Keys.ENTER);
        //////////////// Empty Fields Validation /////////////////
//        driver.navigate().to("https://www.opencart.com/index.php?route=account/login");
//        driver.manage().addCookie(new Cookie("cf_clearance", "xMMENbSxGnXu7zDtlL7tv3qqC9zYAul2o97hccXr3T8-1743358002-1.2.1.1-cuyprlqeKHQR4g2GSXNjcT8IB2smd7pyTpD55H.ULVDUju3RHtH72xzIjRSTTPUAh81AuIexpxUFpBZP3x4h0S4JhOsdObKrNUMwSXOu6uYdrJUhICsXUfprXj12bc.1OK53Yan86ht.VRW86eokMr4E70OGm4tW.2BUcTMfWCruR7WUajqtZz7Eq1mVoFHB4ytRt4ioGgVih4wUygSQgDRCbR5Dd2hVCEwXX0qwwVHUZBXOzvm48IIvEu0cQgpWdiRNDXJAnX.LkJ138OtbBcql0TEfdfvULucYgOVYLLuAvBIF43q3Asek1jdiZSlWWZfZ2waAJ.y8fnECDTKu4EFRweZmC0F3Vejjopesb_eseTC_TSKQxa8gcXXBDdocru4SZju993wnTNUd4lOaGjhSbkv3sFGxV6w_G_wJIS4"));
//        driver.manage().addCookie(new Cookie("session", "abc12345"));
//        driver.navigate().refresh();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //        driver.manage().window().maximize();
//        Thread.sleep(2000);
//        WebElement Password1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-password")));
//        Password1.sendKeys(Keys.ENTER);
//////////////// Login without verifying account /////////////////
//        driver.navigate().to("https://www.opencart.com/index.php?route=account/login");
//        driver.manage().addCookie(new Cookie("cf_clearance", "xMMENbSxGnXu7zDtlL7tv3qqC9zYAul2o97hccXr3T8-1743358002-1.2.1.1-cuyprlqeKHQR4g2GSXNjcT8IB2smd7pyTpD55H.ULVDUju3RHtH72xzIjRSTTPUAh81AuIexpxUFpBZP3x4h0S4JhOsdObKrNUMwSXOu6uYdrJUhICsXUfprXj12bc.1OK53Yan86ht.VRW86eokMr4E70OGm4tW.2BUcTMfWCruR7WUajqtZz7Eq1mVoFHB4ytRt4ioGgVih4wUygSQgDRCbR5Dd2hVCEwXX0qwwVHUZBXOzvm48IIvEu0cQgpWdiRNDXJAnX.LkJ138OtbBcql0TEfdfvULucYgOVYLLuAvBIF43q3Asek1jdiZSlWWZfZ2waAJ.y8fnECDTKu4EFRweZmC0F3Vejjopesb_eseTC_TSKQxa8gcXXBDdocru4SZju993wnTNUd4lOaGjhSbkv3sFGxV6w_G_wJIS4"));
//        driver.manage().addCookie(new Cookie("session", "abc12345"));
//        driver.navigate().refresh();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //        driver.manage().window().maximize();
//    WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email")));
//    email.sendKeys("foush514@gmail.com");
//        Thread.sleep(2000);
//    WebElement Password1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-password")));
//    Password1.sendKeys("01100138137");
// Password1.sendKeys(Keys.ENTER);
       ////////////////////Forgot Password Functionality///////////////////////
//        driver.navigate().to("https://www.opencart.com/index.php?route=account/login");
//        driver.manage().addCookie(new Cookie("cf_clearance", "xMMENbSxGnXu7zDtlL7tv3qqC9zYAul2o97hccXr3T8-1743358002-1.2.1.1-cuyprlqeKHQR4g2GSXNjcT8IB2smd7pyTpD55H.ULVDUju3RHtH72xzIjRSTTPUAh81AuIexpxUFpBZP3x4h0S4JhOsdObKrNUMwSXOu6uYdrJUhICsXUfprXj12bc.1OK53Yan86ht.VRW86eokMr4E70OGm4tW.2BUcTMfWCruR7WUajqtZz7Eq1mVoFHB4ytRt4ioGgVih4wUygSQgDRCbR5Dd2hVCEwXX0qwwVHUZBXOzvm48IIvEu0cQgpWdiRNDXJAnX.LkJ138OtbBcql0TEfdfvULucYgOVYLLuAvBIF43q3Asek1jdiZSlWWZfZ2waAJ.y8fnECDTKu4EFRweZmC0F3Vejjopesb_eseTC_TSKQxa8gcXXBDdocru4SZju993wnTNUd4lOaGjhSbkv3sFGxV6w_G_wJIS4"));
//        driver.manage().addCookie(new Cookie("session", "abc12345"));
//        driver.navigate().refresh();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //        driver.manage().window().maximize();
//    WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email")));
//    email.sendKeys("ffgghh2228@gmail.com");
//        Thread.sleep(2000);
//    WebElement forgotPassword1 = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Forgot your password?")));
//    forgotPassword1.click();
//        Thread.sleep(2000);
//        WebElement email1= wait.until(ExpectedConditions.elementToBeClickable(By.name("email")));
//email1.sendKeys("ffgghh2228@gmail.com");
//email1.sendKeys(Keys.ENTER);
        ////////////////////Login with Unregistered Email///////////////////////
//        driver.navigate().to("https://www.opencart.com/index.php?route=account/login");
//        driver.manage().addCookie(new Cookie("cf_clearance", "xMMENbSxGnXu7zDtlL7tv3qqC9zYAul2o97hccXr3T8-1743358002-1.2.1.1-cuyprlqeKHQR4g2GSXNjcT8IB2smd7pyTpD55H.ULVDUju3RHtH72xzIjRSTTPUAh81AuIexpxUFpBZP3x4h0S4JhOsdObKrNUMwSXOu6uYdrJUhICsXUfprXj12bc.1OK53Yan86ht.VRW86eokMr4E70OGm4tW.2BUcTMfWCruR7WUajqtZz7Eq1mVoFHB4ytRt4ioGgVih4wUygSQgDRCbR5Dd2hVCEwXX0qwwVHUZBXOzvm48IIvEu0cQgpWdiRNDXJAnX.LkJ138OtbBcql0TEfdfvULucYgOVYLLuAvBIF43q3Asek1jdiZSlWWZfZ2waAJ.y8fnECDTKu4EFRweZmC0F3Vejjopesb_eseTC_TSKQxa8gcXXBDdocru4SZju993wnTNUd4lOaGjhSbkv3sFGxV6w_G_wJIS4"));
//        driver.manage().addCookie(new Cookie("session", "abc12345"));
//        driver.navigate().refresh();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //        driver.manage().window().maximize();
//        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email")));
//        email.sendKeys("mm2254@gmail.com");
//        Thread.sleep(2000);
//        WebElement Password1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-password")));
//  Password1.sendKeys("123456789");
//Password1.sendKeys(Keys.ENTER);
//        /// /////////////////////SEARCH WITH VALID MARKET PLACE ITEMS/////////////////////
//        driver.get("https://www.opencart.com/index.php?route=marketplace/extension&member_token=f07c731065b44b7068f78120f396f3e6");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //        driver.manage().window().maximize();
//        WebElement search= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("filter_search")));
//        Thread.sleep(2000);
//        search.sendKeys("Paypal");
//        Thread.sleep(2000);
//       search.sendKeys(Keys.ENTER);
//        Thread.sleep(3000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        for (int i = 0; i < 5; i++) {
//            js.executeScript("window.scrollBy(0, 300);");
//            Thread.sleep(1000);
        /// /////////////////////SEARCH WITH INVALID MARKETPLACE ITEMS/////////////////////

//        driver.get("https://www.opencart.com/index.php?route=marketplace/extension&member_token=f07c731065b44b7068f78120f396f3e6");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//        WebElement search= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("filter_search")));
//        Thread.sleep(2000);
//        search.sendKeys("///////");
//        Thread.sleep(2000);
//        search.sendKeys(Keys.ENTER);
//        Thread.sleep(3000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        for (int i = 0; i < 5; i++) {
//            js.executeScript("window.scrollBy(0, 300);");
//            Thread.sleep(1000);
        /// ////////////////////////////////sort by feature////////////////////////////////////////////
//        driver.get("https://www.opencart.com/index.php?route=marketplace/extension&member_token=f07c731065b44b7068f78120f396f3e6");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//        WebElement commercialButton = driver.findElement(By.xpath("//a[contains(text(), 'Commercial')]"));
//        Thread.sleep(1000);
//        commercialButton.click();
//        WebElement SORTdropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-sort")));
//        Thread.sleep(1000);
//        Select dropdown = new Select(SORTdropdownElement);
//        dropdown.selectByVisibleText("Rating");
//        Thread.sleep(1000);
//        WebElement categoryButton = driver.findElement(By.xpath("//a[contains(text(), 'Marketplaces')]"));
//        categoryButton.click();
//        Thread.sleep(1000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        for (int i = 0; i < 5; i++) {
//            js.executeScript("window.scrollBy(0, 300);");
//            Thread.sleep(1000);
//        }
//        /// ///////////////////Verify Registration with Valid Data//////////////////////////// but manually capatcha choosen
//        driver.get("https://www.opencart.com/index.php?route=account/register");
//        driver.manage().addCookie(new Cookie("cf_clearance", "xMMENbSxGnXu7zDtlL7tv3qqC9zYAul2o97hccXr3T8-1743358002-1.2.1.1-cuyprlqeKHQR4g2GSXNjcT8IB2smd7pyTpD55H.ULVDUju3RHtH72xzIjRSTTPUAh81AuIexpxUFpBZP3x4h0S4JhOsdObKrNUMwSXOu6uYdrJUhICsXUfprXj12bc.1OK53Yan86ht.VRW86eokMr4E70OGm4tW.2BUcTMfWCruR7WUajqtZz7Eq1mVoFHB4ytRt4ioGgVih4wUygSQgDRCbR5Dd2hVCEwXX0qwwVHUZBXOzvm48IIvEu0cQgpWdiRNDXJAnX.LkJ138OtbBcql0TEfdfvULucYgOVYLLuAvBIF43q3Asek1jdiZSlWWZfZ2waAJ.y8fnECDTKu4EFRweZmC0F3Vejjopesb_eseTC_TSKQxa8gcXXBDdocru4SZju993wnTNUd4lOaGjhSbkv3sFGxV6w_G_wJIS4"));
//        driver.manage().addCookie(new Cookie("session", "abc12345"));
//        driver.navigate().refresh();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//        WebElement username= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-username")));
//        username.sendKeys("Mahmoud2222");
//        Thread.sleep(1000);
//        WebElement firstname= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-firstname")));
//        firstname.sendKeys("Mahmoud");
//        Thread.sleep(1000);
//        WebElement lastname= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-lastname")));
//        lastname.sendKeys("Fouad");
//        Thread.sleep(1000);
//        WebElement email= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email")));
//        email.sendKeys("mahmoud22@gmail.com");
//        Thread.sleep(1000);
//        WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-country")));
//        Select dropdown = new Select(dropdownElement);
//        dropdown.selectByVisibleText("Egypt");
//        Thread.sleep(1000);
//        WebElement Password1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-password")));
//       Password1.sendKeys("01100138137");
//        Thread.sleep(1000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        for (int i = 0; i < 2; i++) {
//            js.executeScript("window.scrollBy(0, 300);");
//            Thread.sleep(1000);
//        }
//        Thread.sleep(6000);
//        WebElement registerButton = driver.findElement(By.xpath("//button[@type='submit' and contains(@class, 'btn-primary')]"));
//        registerButton.click();
        /// ///////////////////Verify Registration with Valid Data//////////////////////////// but manually capatcha choosen
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







