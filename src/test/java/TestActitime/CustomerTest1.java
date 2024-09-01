package TestActitime;

import actitimeautomation1.Pages.CustomerPage;
import actitimeautomation1.common.BaseClass;
import actitimeautomation1.common.LoginSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomerTest1 extends BaseClass {
    static WebDriver driver;
    static CustomerPage customerPage;
    public CustomerTest1()
    {   launchBrowser("chrome");
        driver=super.driver;
    }
    @BeforeClass
    public void setup()throws InterruptedException {
        CustomerTest1 customerTest = new CustomerTest1();
        LoginSetup loginSetup = new LoginSetup(driver);
        loginSetup.login("Morajkar", "123456789");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        customerPage = new CustomerPage(driver);
    }
    @Test
    public void verifyCustomer() throws InterruptedException {
        customerPage.createCustomer("ketan");
    }
}