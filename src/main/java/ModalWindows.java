import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class ModalWindows {


    public static void main(String[] args) throws InterruptedException {
/*
        System.setProperty("webdriver.chrome.driver","c:\\Users\\usr\\IdeaProjects\\test-selen\\drivers\\103\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Неявное ожидание (Implicit Wait)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Явное ожидание (Explicit Wait)
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));

        JavascriptExecutor js = (JavascriptExecutor)driver;

        try {

            driver.get("http://127.0.0.1:5500/index.html");
            Thread.sleep(5000);

            //идентификатор текущего окна
            String window1 = driver.getWindowHandle();

            js.executeScript("window.open()");

            String window2 = null;

            Set<String> currentSetWindows = driver.getWindowHandles();

            Integer i = 0;
            for(String window : currentSetWindows){
                i++;
                if(!window.equals(window1)){
                    window2 = window;
                    break;
                }
            }

            System.out.println("Через сколько окон нашли новое: " + i);

            driver.switchTo().window(window2);
            Thread.sleep(2000);
            driver.get("https://onliner.by");
            Thread.sleep(2000);

            driver.switchTo().window(window1);
            Thread.sleep(1000);

            driver.switchTo().window(window2);
            Thread.sleep(1000);
            driver.close();
            driver.switchTo().window(window1);




        } catch (InterruptedException e)
        {

            e.printStackTrace();

        } finally {
            Thread.sleep(2000);
            driver.quit();
        }



*/























    }
}
