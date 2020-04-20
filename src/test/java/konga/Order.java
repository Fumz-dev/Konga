package konga;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Order {

    public void setUp() throws InterruptedException
    { System.setProperty("webdriver.chrome.driver","Konga_order/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.konga.com/");

        Thread.sleep(5000);
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

// login to Konga with the following details:
        driver.findElement(By.linkText("Login / Signup")).click();

        driver.findElement(By.id("username")).sendKeys("funmi887@gmail.com");
        driver.findElement(By.id("password")).sendKeys("fop4com8");

        driver.findElement(By.xpath("//button[text()='Login']")).click();

// Selecting a category:
    driver.findElement(By.xpath("(//div[@class='_0d327_3ftRW']//a)[2]")).click();
    //driver.findElement(By.className("Computing Accessories")).click();






    }

    public static void main(String args[]) throws InterruptedException {
        Order test = new Order();
        test.setUp();
    }

}
