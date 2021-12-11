package bootcamp.utils;

import org.openqa.selenium.By;

import java.util.Set;

public class Helper {
    public static void waitFor(int seconds){
        try {
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    public static void clickWithLinkText(String linktext){
        Driver.get().findElement(By.linkText(linktext)).click();
    }

    public static void switchLastTab(){
        String originTab = Driver.get().getWindowHandle();
        Set<String> allTabs = Driver.get().getWindowHandles();

        for (String tab : allTabs) {
            if (!originTab.equals(tab)){
                Driver.get().switchTo().window(tab);
            }
        }
    }
}
