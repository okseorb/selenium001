import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class RubenMainClass {
    public static WebDriver driver;

    public static void main(String[] args) {




        System.setProperty("webdriver.gecko.driver", "c:\\Users\\usr\\IdeaProjects\\test-selen\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();

        //задержка для ожидания элемента
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();



        // ------------ ComboBoxes - 47 - into RubenComboBox Class ---------------

//        RubenComboBox.TestComboOneClick(driver);
//        RubenComboBox.TestComboTwoClick(driver);

/*
        RubenComboBox.TestComboBoxStart(driver);

        RubenComboBox.TestComboThreeClick(driver, "Ширина профиля", "100");
        RubenComboBox.TestComboThreeClick(driver, "Диаметр, дюйм", "8");
        RubenComboBox.TestComboThreeClick(driver, "Ось", "Передняя");
        RubenComboBox.TestComboThreeClick(driver, "Диаметр, дюйм", "14");
        RubenComboBox.TestComboThreeClick(driver, "Ось", "Любая");
*/


        // ------------ FindElements - 48 - into RubenFindElements Class ---------------
//        RubenFindElements.findCheckBoxes(driver);


        // ------------ TABLES - 49 - into RubenTables49 Class ---------------
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        WebElement tableElement = driver.findElement(By.xpath("//table[@class='ws-table-all']"));
        RubenTables49 table = new RubenTables49(tableElement, driver);
        System.out.println("Rows numbers is: " + table.getRows().size());
        System.out.println("Rows is 2, column is 3 value: " + table.getValueFromCell(2,3));

        driver.quit();







    }
}
