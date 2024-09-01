package TestActitime;

import actitimeautomation1.Pages.CustomerPage;
import actitimeautomation1.Pages.ProjectPage;
import actitimeautomation1.common.BaseClass;
import actitimeautomation1.common.LoginSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectTest1 extends BaseClass {
    static WebDriver driver;
    static ProjectPage projectPage;
    public ProjectTest1(){
        launchBrowser("chrome");
        driver=super.driver;
    }
    @BeforeClass
    public void setup()throws InterruptedException{
        ProjectTest1 projectTest= new ProjectTest1();
        LoginSetup loginSetup= new LoginSetup(driver);
        LoginSetup.login("Morajkar","123456789");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        projectPage = new ProjectPage(driver);


    }
    @Test
    public void verifyProject () throws InterruptedException{
        CustomerPage customerPage=new CustomerPage(driver);
        customerPage.createCustomer("Ketan123");
        projectPage.createProject("ABM Automation");

    }
    @Test
    public void verifyTask() throws InterruptedException {
        projectPage. createTask("ketans task");

    }
}
