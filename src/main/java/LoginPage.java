import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginPage {

 //   WebDriver driver = new ChromeDriver();


    /*

    WebElement userName = driver.findElement(By.id("user"));
    WebElement userPassword = driver.findElement(By.id("password"));
    WebElement buttonEnter = driver.findElement(By.id("enter"));
*/

//    WebElement intro = drv.findElement(By.cssSelector(".excursus"));
//    WebElement testName = drv.findElement(By.xpath("//form[@name='userRegForm']//*[@id='login']"));
//    WebElement testPassword = drv.findElement(By.xpath("//form[@name='userRegForm']//*[@id='email']"));
//    WebElement testEnter = drv.findElement(By.xpath("//form[@name='userRegForm']//*[@id='btn-reser']"));

/*


    public void login(String name, String password){
        userName.sendKeys(name);
        userPassword.sendKeys(password);
        buttonEnter.click();
    }
*/

    public void testLogin(String name, String password, String url) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        Thread.sleep(2000);

        WebElement testName = driver.findElement(By.xpath("//form[@name='userRegForm']//*[@id='login']"));
        WebElement testPassword = driver.findElement(By.xpath("//form[@name='userRegForm']//*[@id='email']"));
        WebElement testEnter = driver.findElement(By.xpath("//form[@name='userRegForm']//*[@id='btn-reser']"));

        testName.sendKeys(name);
        testPassword.sendKeys(password);
        Thread.sleep(2000);
        testEnter.click();
        Thread.sleep(500);
        driver.quit();
    }
}
