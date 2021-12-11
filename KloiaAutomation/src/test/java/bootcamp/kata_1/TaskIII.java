package bootcamp.kata_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskIII {
    public static void main(String[] args) {
        DemoThree();
    }

    @Test
    public void test(){
        DemoThree();
    }

    public static void DemoThree(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        String header = driver.findElement(By.className("heading")).getText();
        System.out.println(header);
        driver.quit();
    }
}
