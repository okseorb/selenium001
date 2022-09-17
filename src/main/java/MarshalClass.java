import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MarshalClass {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","c:\\Users\\usr\\IdeaProjects\\test-selen\\drivers\\103\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
//        driver.get("https://google.com");


        // Неявное ожидание
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // Явное ожидание - ждем 10 сек до выполнения какого-либо метода класса ExpectedConditions - например, появления элемента (presenceOfElementLocated) по локатору (например  по id)

//        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.id("123"))));


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//      ...
        wait.until(ExpectedConditions.stalenessOf(elements.get(5)));



        // Методы класса ExpectedConditions:
//        wait.until(ExpectedConditions
//                        .attributeContains() - поиск по части названия атрибута
//                        .attributeToBe() - по конкретному атрибуту
//                        .attributeToBeNotEmpty()


//                        .elementToBeSelected() - не всегда работает
//                        .elementToBeClickable() - не всегда работает

//                        .invisibilityOf() - элемент не видим
//                        .invisibilityOfAllElements() - все элементы из списка не видимы
//                        .invisibilityOfElementLocated() - элемент не видим или отсутствует в доме
//                        .invisibilityOfElementWithText() - элемент не видим или отсутствует в доме по какому-то тексту

//                        .visibilityOf() - для видимости то же самое

//                        .not(ExpectedConditions.<conditions>) - not для обратного эффекта

//                        .numberOfElementsToBe() - ожидаем, пока не будет на странице необходимое кол-во эл-тов с заданным локатором
//                        .numberOfElementsToBeLessThan()
//                        .numberOfElementsToBeMoreThan()

//                        .presenceOfAllElementsLocatedBy() - ожидает появления эл-та на странице
//                        .presenceOfElementLocated() - ожидает появления эл-та в DOMе

//                        .stalenessOf() - ожидание исчезновения элемента

//                        .textToBe() - проверка на содержание заданного текста в веб-элементе с заданным локатором
//                        .textToBePresentInElement() - ожидаем появления эл-та, в котором присутствует заданный текст
//                        .textToBePresentInElementValue() - ожидаем появления эл-та, у которого в атрибуте Value будет содержаться заданный текст


//                        .titleContains() - аналогично
//                        .titleIs()

//                        .urlContains() - содержится заданная часть URL
//                        .urlMatches() - точно совпадает с  заданным URL








        // Attribute properties
/*

        driver.get("https://avito.ru");
        System.out.println("Open link");
        WebElement link1 = driver.findElement(By.xpath("//div[@class='category-with-counters-item-HDr9u']//a[text()='Личные вещи']"));
        String par = link1.getAttribute("offsetWidth");
        System.out.println(par);
        System.out.println(link1.getAttribute("href"));
*/




        //getText
 /*
        driver.get("https://www.avito.ru/rossiya/transport");

        System.out.println(driver.findElement(By.xpath("//div[@class='popular-rubricator-links-eSjcl']//a[text()='Audi']/../span[@class='popular-rubricator-count-CX8Mx']")).getText());
*/


        //getCssValue
/*

        driver.get("https://devby.io/");

        System.out.println(driver.findElement(By.xpath("//a[@class='navbar__nav-item' and text()='Вход']")).getCssValue("display"));
        System.out.println(driver.findElement(By.xpath("//a[@class='navbar__nav-item' and text()='Вход']")).getCssValue("color"));
        System.out.println(driver.findElement(By.xpath("//a[@class='navbar__nav-item' and text()='Вход']")).getCssValue("font-weight"));
        System.out.println(driver.findElement(By.xpath("//a[@class='navbar__nav-item' and text()='Вход']")).getCssValue("transition"));
*/




       // click, sendKeys
/*
        driver.get("https://catalog.onliner.by/");

        WebElement linkSearch = driver.findElement(By.xpath("//input[@class='fast-search__input']"));
        linkSearch.sendKeys("Холодильник");
        linkSearch.clear();
        linkSearch.sendKeys("Телевизор", Keys.ENTER);
*/





        // Actions


 /*
 Методы для класса Actions:
        actions
                .moveToElement()
                .keyDown()
                .keyUp()
                .clickAndHold()
                .release()

                .build()
                .perform();
*/


/*

        try {
            driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");

            Thread.sleep(2000);

            WebElement dragElement = driver.findElement(By.xpath("//div[@id='draggable']"));
            WebElement dropElement = driver.findElement(By.xpath("//div[@id='droppable']"));

            Actions actions = new Actions(driver);
            actions.moveToElement(dragElement).clickAndHold(dragElement).moveToElement(dropElement).pause(1000).release(dragElement).build().perform();


        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("catch: " + e);
        }finally {
            Thread.sleep(5000);
            driver.quit();
        }
*/



    }
}
