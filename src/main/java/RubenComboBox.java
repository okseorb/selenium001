import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.log.TextFormatter;

import java.time.Duration;

public class RubenComboBox {
    WebDriver driver = RubenMainClass.driver;
    /*
    this.driver = driver;

    System.setProperty("webdriver.gecko.driver", "c:\\Users\\usr\\IdeaProjects\\test-selen\\drivers\\geckodriver.exe");
    driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //задержка для ожидания элемента

        driver.manage().window().maximize();
        */



    public static void TestComboBoxStart(WebDriver driver){
        driver = driver;

        driver.get("https://www.avito.ru/all/zapchasti_i_aksessuary/shiny_diski_i_kolesa/motoshiny-ASgBAgICAkQKJooL_pwB");
    }


    public static void TestComboOneClick(WebDriver driver){
        driver = driver;


        System.out.println("1");
        driver.findElement(By.xpath("//form//label//span[text()='Диаметр, дюйм']/../../..//select")).click();

        driver.findElement(By.xpath("//form//label//span[text()='Диаметр, дюйм']/../../..//select/*[text()='7']")).click();
    }

    public static void TestComboTwoClick(WebDriver driver){
        driver = driver;


        System.out.println("2");
//        driver.findElement(By.xpath("//form//label//span[text()='Диаметр, дюйм']/../../..//select")).click();

        driver.findElement(By.xpath("//form//label//span[text()='Диаметр, дюйм']/../../..//select/*[text()='7']")).click();
    }

    public static void TestComboThreeClick(WebDriver driver, String name, String value){
        driver = driver;

        String filterName = String.format("//form//label//span[text()='%s']/../../..//select", name);
        String filterValue = String.format("//form//label//span[text()='%s']/../../..//select/*[text()='%s']", name, value);

        // Скролим страницу до нужного элемента (иначе может не кликнуть)
        WebElement element = driver.findElement(By.xpath(filterName));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);


        System.out.println("filterName: " + filterName);
        System.out.println("filterValue: " + filterValue);

        driver.findElement(By.xpath(filterName)).click();
        driver.findElement(By.xpath(filterValue)).click();
    }
}
