package TestActitime;

import actitimeautomation1.Pages.CustomerPage;
import actitimeautomation1.Pages.UserPage;
import actitimeautomation1.common.BaseClass;
import actitimeautomation1.common.LoginSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserTest1 extends BaseClass {
    static WebDriver driver;
    static UserPage userPage;

    @BeforeClass
    public void setup() throws InterruptedException {
        launchBrowser("chrome");
        driver=super.driver;
        userPage=new UserPage(driver);
        LoginSetup loginSetup = new LoginSetup(driver);
        loginSetup.login("Morajkar", "123456789");
        Thread.sleep(5000);
    }

    @DataProvider
    public Object [][] getTestData() {

        Object[][] obj = new Object[][]{
                {"mumbai9","pune9","ketan@123456789010gmai.com"},{"Delhi9","Indore9","Km@9897510110gmail.com"}
        };
        return obj;
    }
    @Test(priority = 1,dataProvider = "getTestData")
    public void createUser(Object first,Object last,Object mail) throws InterruptedException {
        UserPage userPage = new UserPage(driver);
        userPage.creatFirstName(first.toString());
        userPage.createLastName(last.toString());
        userPage.createMail(mail.toString());
        Thread.sleep(5000);

    }
    @Test(priority = 2)
    public void bulkInvitationMethod() throws InterruptedException {
        UserPage userPage=new UserPage(driver);
        userPage.bulkInvitation("Ketan2","morajkar2","ketanmorajkar1234@gmail.com");
        Thread.sleep(2000);

    }

}
