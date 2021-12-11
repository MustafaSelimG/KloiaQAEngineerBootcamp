package bootcamp.kata_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskIV {
    public static void main(String[] args) {
        DemoFour();
    }

    @Test
    public void test(){
        DemoFour();
    }

    public static void DemoFour(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.linkText("A/B Testing")).click();
        driver.navigate().back();
        driver.findElement(By.linkText("Add/Remove Elements")).click();
        driver.quit();
    }
}
