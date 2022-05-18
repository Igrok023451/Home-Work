package advance.hw10_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {

    @Test
    public void firstTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
//        driver.findElement(By.xpath("//div[@class = 'home-banner']")).click();
//        Timeout.ofSeconds(11);
//        driver.navigate().refresh();
//        Timeout.ofSeconds(11);
//        driver.findElement(By.xpath("//a[text() = 'Go To Registration ']")).click();
//        driver.findElement(By.xpath("//label[@for = 'first-name']")).sendKeys("Anton");
//        driver.findElement(By.xpath("//label[@for = 'last-name']")).sendKeys("Khramau");
        driver.findElement(By.xpath("//div[@class = 'card-body']/h5[text() = 'Elements']")).click();
        driver.findElement(By.xpath("//li[@id = 'item-0']/span[text() = 'Text Box']")).click();
        driver.findElement(By.xpath("//input[@id = 'userName']")).sendKeys("231");

    }
}
