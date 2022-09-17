import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import sun.security.mscapi.CPublicKey;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MainClass {

    static WebDriver driver;


    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "c:\\Users\\usr\\IdeaProjects\\test-selen\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();

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

/*
        driver.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
        driver.findElement(By.xpath("//input[@class='vector-search-box-input']")).sendKeys("Selenium webdriver");
        driver.findElement(By.xpath("//input[@id='searchButton']")).click();


        driver.findElement(By.xpath("//div[@id=\"searchText\"]/input")).getAttribute("value");
        System.out.println(driver.findElement(By.xpath("//div[@id=\"searchText\"]/input")).getAttribute("value"));
        driver.findElement(By.xpath("//div[@id=\"searchText\"]/input")).clear();
//lesson 44 (5.30)
*/


        //part4

/*        driver.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0%22)");
        WebElement link = driver.findElement(By.xpath("//*[text()='найти упоминания']/../a"));
        WebElement link2 = driver.findElement(By.xpath("//*[@id='n-currentevents']/a"));
        System.out.println(link.getText());
        System.out.println(link2.getText());
        link.click();
        */



        //part5 checkboxes and radio buttons / lesson 46

//        driver.get("https://market.yandex.ru");
//        driver.findElement(By.xpath("//span[@class='_3z8Gf' and text()='Бытовая техника']/..")).click();
//        driver.findElement(By.xpath("//*[text()='Стиральные и сушильные машины']")).click();
//        driver.findElement(By.xpath("//div[@class='q9WpB']//a[text()='Стиральные машины']")).click();


        driver.get("https://catalog.onliner.by/");
//        driver.get("https://catalog.onliner.by/mobile");
        driver.findElement(By.xpath("//span[@class='catalog-navigation-classifier__item-title-wrapper' and text()='Электроника']")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Мобильные телефоны и')]")).click();
        driver.findElement(By.xpath("//div[@class='catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//div[@class='catalog-navigation-list__dropdown']//div[@class='catalog-navigation-list__dropdown-list']//a[@class='catalog-navigation-list__dropdown-item']//span[@class='catalog-navigation-list__dropdown-data']//span[@class='catalog-navigation-list__dropdown-title'][contains(text(),'Смартфоны')]")).click();

//        driver.findElement(By.xpath("//*[text()='кнопочный телефон']")).click();
//        driver.findElement(By.xpath("//ul[@class='schema-filter__list']//label[@class='schema-filter__checkbox-item']/span[text()='Xiaomi']/../span[@class='i-checkbox']")).click();
//        driver.findElement(By.xpath("//ul[@class='schema-filter__list']//label[@class='schema-filter__checkbox-item']/span[text()='Apple']/..")).click();
//        driver.findElement(By.xpath("//ul[@class='schema-filter__list']//label[@class='schema-filter__checkbox-item']/span[text()='Samsung']")).click();

//        driver.findElement(By.xpath("//ul[@class='schema-filter__list']//label[@class='schema-filter__checkbox-item']/span[text()='HONOR']/../span/span")).click();

//        String sPath ="//ul[@class='schema-filter__list']//label[@class='schema-filter__checkbox-item']/span[text()='HONOR']/../span/span";
//        String sPath ="//ul[@class='schema-filter__list']//label[@class='schema-filter__checkbox-item']/span[text()='HONOR']/../span/input"; //invisible
        String sPath ="//ul[@class='schema-filter__list']//label[@class='schema-filter__checkbox-item']/span[text()='Realme']/../span/input"; //invisible
//        String sPath ="//ul[@class='schema-filter__list']//label[@class='schema-filter__checkbox-item']/span[text()='HONOR']/../span";
//        String sPath ="//ul[@class='schema-filter__list']//label[@class='schema-filter__checkbox-item']/span[text()='HONOR']/..";
//        String sPath ="//ul[@class='schema-filter__list']//label[@class='schema-filter__checkbox-item']/span[text()='HONOR']/../..";

//To check Element Present:
        if(driver.findElement(By.xpath(sPath))!= null){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Absent");
        }

//To check Visible:
        if( driver.findElement(By.xpath(sPath)).isDisplayed()){
            System.out.println("Element is Visible (is Displayed)");
        }else{
            System.out.println("Element is InVisible");
        }
//To check Enable:
        if( driver.findElement(By.xpath(sPath)).isEnabled()){
            System.out.println("Element is Enable");
        }else{
            System.out.println("Element is Disabled");
        }

       WebElement linkxi = driver.findElement(By.xpath(sPath));
        /* Actions actions = new Actions(driver);

        actions.moveToElement(linkxi).click().perform();
        */


        if(linkxi.isSelected()){
            System.out.println("Element is Selected!!!");
        }else System.out.println("Element is not selected.");

        System.out.println("sPath = " + sPath);
        //Creating the JavascriptExecutor interface object by Type casting
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].click();", linkxi);

        javaClicker(sPath);


        selectCheckBox("Apple");
        selectCheckBox("Xiaomi");
        selectCheckBox("HONOR");


/*

        // Click using JavascriptExecutor
        js.executeScript("arguments[0].click();", linkxi);

        if(linkxi.isSelected()){
            System.out.println("Element is Selected!!!");
        }else System.out.println("Element is not selected.");
*/



//





/*

        driver.get("https://market.yandex.by/catalog--stiralnye-mashiny/18031204/list?hid=90566&local-offers-first=0");
        driver.findElement(By.xpath("//div[@class='PndfQ']//*[text()='Показать всё']")).click();
        driver.findElement(By.xpath("//*[@class='_1ZDAA' and text()='LG']")).click();
        //проверяем выделен или нет
        System.out.println(driver.findElement(By.xpath("//*[@class='_1ZDAA' and text()='LG']/../../input")).isSelected());

        public static void selectRadioButton(String Object name;){
            String rbXpath = "//*[@class='_1ZDAA' and text()='LG']/../../input";
            if (!(driver.findElement(By.xpath("//*[@class='_1ZDAA' and text()='LG']/../../input")).isSelected())) {

                driver.findElement(By.xpath("//*[@class='_1ZDAA' and text()='LG']")).click();
            }
        }
*/


//        driver.quit();



    }


    public static void javaClicker(String localXpath){
        WebElement element = driver.findElement(By.xpath(localXpath));
        //Creating the JavascriptExecutor interface object by Type casting
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element);
    }

    public static void selectCheckBox(String name){
        String rbXpath = "//ul[@class='schema-filter__list']//label[@class='schema-filter__checkbox-item']/span[text()='%s']/../span/input";
        String localXpath;
        localXpath = String.format(rbXpath, name);
        if(!(driver.findElement(By.xpath(localXpath)).isSelected())){
            System.out.println("Element " + name + " is not Selected. We will select it!");
            System.out.println(localXpath);

            javaClicker(localXpath);

        }else System.out.println("Element " + name + " is selected!!!");
    }
}
