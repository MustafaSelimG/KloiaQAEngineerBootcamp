package bootcamp.kata_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SimpleTests {
    private static WebDriver driver;


    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
    }

    @After
    public void teardown(){
        driver.quit();
    }

    @Test
    public void firstTest(){
        driver.findElement(By.linkText("A/B Testing")).click();
        String header = driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals("A/B Test Control",header);
    }

    @Test
    public void secondTest(){
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        String verify = driver.findElement(By.className("subheader")).getText();
        Assert.assertEquals("Welcome to the Secure Area. When you are done click logout below.",verify);
    }

    @Test
    public void thirdTest() throws InterruptedException {
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
        driver.findElement(By.cssSelector("#start button")).click();
        //        impicility wait sayfada aranan özelliği verilen süre boyunca bulana kadar bekliyor.
        //        thread tercih edilmiyor.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String title = driver.findElement(By.cssSelector("#finish>h4")).getText();
        Assert.assertEquals("Hello World!",title);
    }

    @Test
    public void fourthTest(){
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
        driver.findElement(By.cssSelector("#start button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Hello World gizli olarak html'de bulunduğu ancak gözükmediği için önceki metoddan farklı yazmamız gerekti.
        // loading geçene kadar beklememiz ardından Hello World'u aramamız gerekti.
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loading = driver.findElement(By.id("loading"));
//        wait.until(ExpectedConditions.invisibilityOf(loading));
        waitForElement(loading);
        String title = driver.findElement(By.cssSelector("#finish>h4")).getText();
        Assert.assertEquals("Hello World!",title);

    }

    public static void waitForElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
}
