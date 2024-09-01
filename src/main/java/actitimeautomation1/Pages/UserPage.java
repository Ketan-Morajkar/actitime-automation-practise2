package actitimeautomation1.Pages;

import actitimeautomation1.common.BaseClass;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import static actitimeautomation1.common.LoginSetup.driver;

public class UserPage extends BaseClass {
    public Object createFirstName1;
    WebDriver driver;

    public UserPage(WebDriver driver) {
        this.driver = driver;
    }

    public By userModule = By.xpath("//div[@id='container_users']/following::div[1]");
    public By newUserButton = By.xpath("//div[text()='New User']");
    public By firstTextField = By.xpath("//input[@id='createUserPanel_firstNameField']");
    public By middleTextField = By.xpath("//input[@id='createUserPanel_lastNameField']");
    public By mailTextField = By.xpath("//input[@id='createUserPanel_emailField']");
    public By dropDown = By.xpath("//div[@id='createUserPanel_accessSelectorPlaceholder']/following::div[13]");
    public By selectDepartment = By.xpath("//div[@class='itemsContainer']/descendant::div[5]");
    public By saveAndSendButton = By.xpath("//div[text()='Save & Send Invitation']");
    public By closeButton=By.xpath("(//span[text()='Close'])[1]");

    public void creatFirstName(String first) throws InterruptedException {
        driver.findElement(userModule).click();
        Thread.sleep(5000);
        driver.findElement(newUserButton).click();
        Thread.sleep(5000);
        driver.findElement(firstTextField).sendKeys(first);
        Thread.sleep(5000);
    }
        public void createLastName(String last) throws InterruptedException {
           driver.findElement(middleTextField).sendKeys(last);
        }
        public void createMail(String mail) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(mailTextField).sendKeys(mail);
            Thread.sleep(5000);
            driver.findElement(dropDown).click();
            Thread.sleep(3000);
            driver.findElement(selectDepartment).click();
            Thread.sleep(3000);
            driver.findElement(saveAndSendButton).click();
            Thread.sleep(3000);
            driver.findElement(closeButton).click();
            Thread.sleep(2000);
    }
   // public By UserModule=By.id("//div[@id='container_users']/following::div[1]");
    public By bulkInvitation=By.xpath("//div[@class='components_button addSeveralUsersButton dropdown']/descendant::div[1]");
    public By inviteSeveralUser=By.xpath("//div[text()='  Invite Several Users']");
    public By firstNameField=By.xpath("(//input[@placeholder='First Name'])[4]");
    public By lastNameField=By.xpath("(//input[@placeholder='Last Name'])[4]");
    public By emailField=By.xpath("(//input[@placeholder='Email'])[4]");
    public By sendInvitationsButton=By.xpath("//span[text()='Send Invitations']");

    public void bulkInvitation(String first1,String last1, String mail1) throws InterruptedException {
        driver.findElement(userModule).click();
        Thread.sleep(2000);
        driver.findElement(bulkInvitation).click();
        Thread.sleep(3000);
        driver.findElement(inviteSeveralUser).click();
        Thread.sleep(3000);
        driver.findElement(firstNameField).sendKeys(first1);
        Thread.sleep(3000);
        driver.findElement(lastNameField).sendKeys(last1);
        Thread.sleep(3000);
        driver.findElement(emailField).sendKeys(mail1);
        Thread.sleep(3000);
        driver.findElement(sendInvitationsButton).click();

    }
}

