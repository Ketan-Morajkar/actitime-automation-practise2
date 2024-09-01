package actitimeautomation1.Pages;

import actitimeautomation1.common.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerPage extends BaseClass {
    WebDriver driver;
    public CustomerPage(WebDriver driver){
    this.driver=driver;
    }
    //click on task module
    public By taskModule=By.xpath("//div[text()='Tasks']");
    //click on add new button
    public By addNewButton=By.xpath("//div[text()='Add New']");
    //click on customer
    public By addCustomer=By.xpath("//div[@class='item createNewCustomer']");
    //customer text feild....sendkeys
    public By custTextField=By.xpath("//div[@id='customerLightBox_content']/descendant::input[1]");
    //click on create customer
    public By createCustomer=By.xpath("//div[text()='Create Customer']");

    public void createCustomer(String custName) throws InterruptedException {
        driver.findElement(taskModule).click();
        Thread.sleep(5000);
        driver.findElement(addNewButton).click();
        Thread.sleep(5000);
        driver.findElement(addCustomer).click();
        Thread.sleep(5000);
        driver.findElement(custTextField).sendKeys(custName);
        Thread.sleep(5000);
        driver.findElement(createCustomer).click();
    }

    }