import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HiddenInputs {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","c:\\Users\\usr\\IdeaProjects\\test-selen\\drivers\\103\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // Неявное ожидание (Implicit Wait)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        try {
            driver.get("https://courses.letskodeit.com/practice");
            Thread.sleep(2000);
            WebElement elToHide = driver.findElement(By.id("hide-textbox"));
            elToHide.click();
            Thread.sleep(3000);

            WebElement elText = driver.findElement(By.id("displayed-text"));

            //  If the selector is hidden, you can change Selector attributes and then click to it
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].setAttribute('style', 'display: block; width: 350px; height: 150px; background: blue; border: 2px solid red; color: red;');",elText);

            Thread.sleep(2000);

            elText.sendKeys("Some text is here...");

            Thread.sleep(2000);



        //  You can change Selector attributes and then click to it
        //    js.executeScript("document.querySelector('input[type='file']').setAttribute('style', 'opasity:1')")
        // Js.executeScript(“arguments[0].setAttribute(‘style’, ’background: blue; border: 2px solid red;’);”,ele); // Пример



//            Thread.sleep(8000);


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            driver.quit();
        }


    }
}
