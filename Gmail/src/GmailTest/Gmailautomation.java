package GmailTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Gmailautomation

{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","E:\\New folder\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new ChromeDriver();

        driver.get("http://www.gmail.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("tselenium753@gmail.com");
        driver.findElement(By.className("CwaK9")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("Java2079");
        driver.findElement(By.className("CwaK9")).click();

        Thread.sleep(2000);
        driver.findElement(By.className("aic")).click();
        Thread.sleep(2000);

        driver.findElement(By.className("vO")).sendKeys("testj123s@gmail.com");
        driver.findElement(By.className("aoT")).sendKeys("Test case");



        driver.findElement(By.className("Am")).sendKeys("This is an autogenerated email");


        driver.findElement(By.className("aoO")).click();



        Thread.sleep(5000);

        driver.findElement(By.className("gbii")).click();

        driver.findElement(By.id("gb_71")).click();

        Thread.sleep(2000);
        driver.quit();

    }


}
