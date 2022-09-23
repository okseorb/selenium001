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

        // Assert (проверки) - (англ. "утверждение") -  e.g.: check the title for identity to text "Practice Page"
        //testAsserts();

        // Паттерн проектирования Page Object Структура классов и методов (теория) |23.09.2022
/*

        // Создаем экземпляр класса LoginPage
        LoginPage lp = new LoginPage();

        // Вызываем метод login класса LoginPage
        lp.login("admin", "12345678");
*/


        // Паттерн проектирования Page Object Структура классов и методов (практика) |23.09.2022
        doLogin();


    }

    private static void doLogin() {

        try {
            // Создаем экземпляр класса LoginPage
            LoginPage testLp = new LoginPage();

            // Вызываем метод testLogin класса LoginPage
            testLp.testLogin("administrator", "1234567890-QWERTY", "https://www.lezhenkin.ru/examples/php/oop-php/sozdanie-formy-registraczii-i-avtorizaczii-na-php/");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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

            // Assert (проверки) - (англ. "утверждение") -  check the title for identity to text "Practice Page"
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
