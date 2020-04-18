package konga;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Order {

    public void setUp() throws InterruptedException
    { System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.konga.com/");

        Thread.sleep(5000);
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("email")).sendKeys("funmi887@gmail.com");

        driver.findElement(By.id("pass")).sendKeys("fop4com8");
        driver.findElement(By.id("login")).click(); }

    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();
    }





}
