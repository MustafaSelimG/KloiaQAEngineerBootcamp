package bootcamp.kata_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskII {
    public static void main(String[] args) {
        DemoTwo();
    }

    @Test
    public void test(){
        DemoTwo();
    }

    private static void DemoTwo() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/forgot_password");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("abc@gmail.com");
        WebElement button = driver.findElement(By.id("form_submit"));
        button.click();
        String title = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Internal Server Error",title);
        driver.quit();
    }
}
