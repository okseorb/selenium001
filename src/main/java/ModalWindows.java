import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class ModalWindows {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","c:\\Users\\usr\\IdeaProjects\\test-selen\\drivers\\103\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Неявное ожидание
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));

        try {

            driver.get("http://127.0.0.1:5500/index.html");
            Thread.sleep(5000);


            WebElement elem = driver.findElement(By.id("a"));
            WebElement elem2 = driver.findElement(By.id("b"));
            WebElement elem3 = driver.findElement(By.id("c"));

            elem.click();

            Alert alert = wait.until(alertIsPresent());
            alert.accept();

            elem2.click();
            Alert promt = wait.until(alertIsPresent());
            promt.sendKeys("I wrote it!");
            promt.accept();

            Alert alert2 = wait.until(alertIsPresent());
            Thread.sleep(2000);
            alert2.accept();

            elem3.click();
            Alert alert3 = wait.until(alertIsPresent());
            alert3.dismiss();




        } catch (InterruptedException e)
        {

            e.printStackTrace();

        } finally {
            driver.quit();
        }


























    }
}
