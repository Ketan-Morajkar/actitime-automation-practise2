package actitimeautomation1.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSetup {
    public static WebDriver driver;

    public LoginSetup(WebDriver driver){
        this.driver=driver;
    }
    public static void login(String userName, String password) throws InterruptedException {
        driver.navigate().to("https://online.actitime.com/abm1/login.do");
        Thread.sleep(4000);
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        driver.findElement(By.xpath("//div[text()='Login ']")).click();


    }
}
