import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class WaitingToDisappear {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","c:\\Users\\usr\\IdeaProjects\\test-selen\\drivers\\103\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // Неявное ожидание (Implicit Wait)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


        try {
            driver.get("https://pagination.js.org/");
            Thread.sleep(3000);

            List<WebElement> elements = driver.findElements(By.xpath("//div[@id='demo1']//div[@class='data-container']//li"));
            List<WebElement> pages = driver.findElements(By.xpath("//div[@id='demo1']//div[@class='paginationjs-pages']//li"));

            String text = elements.get(5).getText();
            System.out.println("Element on first page is: " + text);

            pages.get(2).click();
            // Ожидаем, когда пропадет элемент под индексом 5 из списка List
            wait.until(ExpectedConditions.stalenessOf(elements.get(5)));

            Thread.sleep(3000);

            // Обновляем список эл-тов на след. странице
            elements = driver.findElements(By.xpath("//div[@id='demo1']//div[@class='data-container']//li"));

            text = elements.get(5).getText();
            System.out.println("Element on second page is: " + text);





        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            driver.quit();
        }


    }
}
