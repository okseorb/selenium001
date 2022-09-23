import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HiddenInputs {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","c:\\Users\\usr\\IdeaProjects\\test-selen\\drivers\\103\\chromedriver.exe");

        // If the selector is hidden and you can't click it, than you need to change Selector attributes and then click to it
        //showHidden();


        testAsserts();



    }

    private static void testAsserts() {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // Неявное ожидание (Implicit Wait)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {

            driver.get("https://courses.letskodeit.com/practice");
            Thread.sleep(2000);

            String title = driver.getTitle();

            // Assert (проверки) - (англ. "утверждение") - check the title for identity to text "Practice Page"
            Assert.assertEquals(title, "Practice Page");
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            driver.quit();
        }
    }

    // If the selector is hidden and you can't click it, than you need to change Selector attributes and then click to it
    public static void showHidden(){

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

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            driver.quit();
        }
    }
}
