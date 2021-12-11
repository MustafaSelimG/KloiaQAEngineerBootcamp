package bootcamp.kata_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskI {
    public static void main(String[] args) {
        DemoOne();
    }

    @Test
    public void test(){
        DemoOne();
    }

    private static void DemoOne() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.get("https://kloia.com");
        driver.navigate().back();
        driver.quit();
    }

}
