import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RubenMainClass {
    public static WebDriver driver;
    public static WebDriver driverG;


    public static void main(String[] args) {



/*

        System.setProperty("webdriver.gecko.driver", "c:\\Users\\usr\\IdeaProjects\\test-selen\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
*/

        System.setProperty("webdriver.chrome.driver", "c:\\Users\\usr\\IdeaProjects\\test-selen\\drivers\\105\\chromedriver.exe");
        driverG = new ChromeDriver();
        //задержка для ожидания элемента
        driverG.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driverG.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driverG, Duration.ofSeconds(5));


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
/*

        driver.get("https://www.w3schools.com/html/html_tables.asp");
        WebElement tableElement = driver.findElement(By.xpath("//table[@class='ws-table-all']"));
        RubenTables49 table = new RubenTables49(tableElement, driver);
        System.out.println("Rows numbers is: " + table.getRows().size());
        System.out.println("Headings numbers is: " + table.getHeadings().size());

        System.out.println("---------- by Row and Column Number:");
        System.out.println("Rows is 2, column is 3 value: " + table.getValueFromCell(2,3));
        System.out.println("Rows is 4, column is 1 value: " + table.getValueFromCell(4,1));
        System.out.println("---------- by Header:");
        System.out.println("Rows is 3, column's header is \"Contact\": " + table.getValueFromCell(3,"Contact"));
        System.out.println("Rows is 5, column's header is \"Country\": " + table.getValueFromCell(5,"Country"));

        driver.quit();
*/


        // ------------ Class ACTIONS - Сложные действия - 51 - into RubenMainClass ---------------
/*

        driverG.get("https://www.ebay.com/");
        WebElement linkFashion = driverG.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']//a[text()='Мода']"));
        WebElement linkElectronics = driverG.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']//a[text()='Электроника']"));
        WebElement searchField = driverG.findElement(By.xpath("//input[@id='gh-ac']"));
        Actions actions = new Actions(driverG);

        actions.moveToElement(linkFashion).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[@aria-label='Самые популярные категории']//*[text()='Обувь']")));
        actions.moveToElement(linkElectronics).build().perform();
//        actions.dragAndDrop(linkElectronics, searchField).build().perform();
        actions.clickAndHold(linkElectronics).moveToElement(searchField).release().build().perform();

        actions.doubleClick(linkFashion);
        actions.contextClick(linkFashion);

        // "Action"! Not "Actions"!
        Action act = actions.clickAndHold(linkElectronics).moveToElement(searchField).release().build();
        act.perform();
        actions.moveToElement(searchField).click().sendKeys("Мокасины").build().perform();
*/


        // ------------ JavaScript and Alerts - switchTo - 52-53 - into RubenMainClass ---------------
/*

        driverG.get("https://google.com/");
        JavascriptExecutor js = (JavascriptExecutor) driverG;
        js.executeScript("confirm('Are you sure?');");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driverG.switchTo().alert().accept();
//        driverG.switchTo().alert().dismiss();
//        driverG.switchTo().alert().sendKeys("test text");
*/


        // ------------ Switching between multiple windows - 54 - into RubenMainClass ---------------
/*

        driverG.get("https://www.oracle.com/java/technologies/javase/early-access-downloads.html");
        //Запоминаем сразу текущее окно в переменную
        String windowHandle1 = driverG.getWindowHandle();

        driverG.findElement(By.xpath("//a[text()='OpenJDK Wiki for Project Loom']")).click();

        // If the link opens in a new window, then you need to switch to it
        // Looking for the last window
        for (String windowHandle : driverG.getWindowHandles()){
            driverG.switchTo().window(windowHandle);
        }
        // Works with a new window
        driverG.findElement(By.xpath("//span[@class='confluence-embedded-file-wrapper']")).click();
        String windowHandle2 = driverG.getWindowHandle();
        // Switch to the first window
        driverG.switchTo().window(windowHandle1);
        driverG.findElement(By.xpath("//a[text()='Project Jextract']")).click();
*/


        // ------------ Check if the element exists - 57 - into RubenMainClass ---------------

        // Get the List of elements and check it's size
//        if (driverG.findElements(By.xpath("//a[@class='Log in']")).size() > 0) System.out.println("Element is exist!");



        // ------------ Class KEYS - 58 - into RubenMainClass ---------------

        driverG.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
        WebElement elSearch = driverG.findElement(By.xpath("//input[@class='vector-search-box-input']"));
        elSearch.sendKeys("Text for ");
        elSearch.sendKeys(Keys.chord(Keys.SHIFT,"test"));
        elSearch.sendKeys(Keys.ENTER);
        WebElement elSearchPage2 = driverG.findElement(By.xpath("//div[@id='searchText']//input[@type='search']"));
        String selectAll = Keys.chord(Keys.CONTROL,"a");
        String cut = Keys.chord(Keys.CONTROL,"x");
        String paste = Keys.chord(Keys.CONTROL,"v");
        elSearchPage2.sendKeys(selectAll);
        elSearchPage2.sendKeys(cut);
        elSearchPage2.sendKeys(paste);
        elSearchPage2.sendKeys(paste);









    }
}
