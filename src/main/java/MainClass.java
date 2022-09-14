import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MainClass {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "c:\\Users\\usr\\IdeaProjects\\test-selen\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //задержка для ожидания элемента

        driver.manage().window().maximize();

        //part1
        /*

        //driver.manage().window().setSize(new Dimension(900, 500));
        driver.manage().window().setSize(new Dimension(900, 500));
        driver.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
//        driver.navigate().to("https://google.com");
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        // поиск элементов на странице
        //возвращает 1й найденнный элемент

        WebElement link = driver.findElement(By.linkText("Войти"));
        WebElement link2 = driver.findElement(By.partialLinkText("Венецианского"));
        WebElement searchField = driver.findElement(new By.ByName("search"));
        WebElement searchBtn = driver.findElement(new By.ByClassName("searchButton"));
        WebElement li = driver.findElement(new By.ById("ca-viewsource"));
        WebElement input = driver.findElement(By.tagName("input"));

        WebElement element = driver.findElement(By.cssSelector("div#simpleSearch input#searchButton"));
        //  css-локаторы
//          div#simpleSearch - div с id = "simpleSearch"
//          div#simpleSearch input#searchButton  - input с id = "searchButton" где-то внутри div
//          div#simpleSearch > input  - input на след уровне внутри div
//          div.vectorTabs - div с классом vectorTabs

        // xPath
        WebElement logo = driver.findElement(By.xpath("//a[@class='mw-wiki-logo']"));

        driver.findElement(By.xpath("//input[@id='searchButton']")).click();
*/




        //driver.quit();







        // part2
/*
        driver.get("https://github.com/");
        driver.findElement(By.xpath("//a[contains(@class,'HeaderMenu-link--sign-up')]")).click();
        WebElement button = driver.findElement(By.xpath("//form[contains(@class,'js-signup-form')]//button"));
        System.out.println("Button text is: " + button.getText());
        if (button.getText().equals("Sign up for GitHub")){
            System.out.println("Success!!!");
        }
        button.submit();
        */



        //part3

        driver.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
        driver.findElement(By.xpath("//input[@class='vector-search-box-input']")).sendKeys("Selenium webdriver");
        driver.findElement(By.xpath("//input[@id='searchButton']")).click();


        driver.findElement(By.xpath("//div[@id=\"searchText\"]/input")).clear();
//lesson 44 (5.30)

//        driver.quit();



    }
}
