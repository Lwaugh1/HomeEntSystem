package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://34.249.136.71:8080/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Jukebox Contents")).click();
        if (driver.getCurrentUrl().equals("http://34.249.136.71:8080/contents")) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        Thread.sleep(3000);
        driver.navigate().back();

        driver.findElement(By.id("songTitle")).sendKeys("Bohemian Rhapsody");
        driver.findElement(By.xpath("//button[contains(text(), 'Search')]")).click();
        if (driver.getCurrentUrl().equals("http://34.249.136.71:8080/titleSearch?songTitle=Bohemian+Rhapsody")) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}
