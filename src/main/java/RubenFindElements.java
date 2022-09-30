import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RubenFindElements {
    WebDriver driver = RubenMainClass.driver;


    public static void findCheckBoxes(WebDriver driver) {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.get("https://market.yandex.by/catalog--smartfony/26893750/list");
            Thread.sleep(100);

            // Кликаем по одному эл-ту, а проверяем по другому!
            List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//div[@data-grabber='SearchFilters']/div[3]//input/.."));
            List<WebElement> allInputCheckBoxes = driver.findElements(By.xpath("//div[@data-grabber='SearchFilters']/div[3]//input"));
            System.out.println(allCheckBoxes.size());

            int i = 0;

            // Проверяем чекбоксы
            for (WebElement checkBox : allCheckBoxes) {
                System.out.println("Element INPUT " + (i + 1) + " is checked: " + allInputCheckBoxes.get(i).getAttribute("checked"));
                i++;
            }

            System.out.println("------------- | -------------");

            i = 0;
            // Кликаем по эл-там
            for (WebElement checkBox : allCheckBoxes) {
                allCheckBoxes.get(i).click();
                i++;
                System.out.println("CheckBox № " + i + " is clicked!");
            }

            // Снимем галочку с 3 элемента
            allCheckBoxes.get(2).click();

            // Проверка
            System.out.println("------------- CHECKING... -------------");
            i = 0;
            for (WebElement checkBox : allCheckBoxes) {
                String s = allInputCheckBoxes.get(i).getAttribute("checked");
                if (allInputCheckBoxes.get(i).getAttribute("checked") == null) {
                    System.out.println("ERROR!");
                }
                System.out.println("Element INPUT " + (i + 1) + " is checked: " + allInputCheckBoxes.get(i).getAttribute("checked"));
                i++;
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
        }
    }
}
