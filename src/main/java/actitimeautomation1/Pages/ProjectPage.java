package actitimeautomation1.Pages;

import actitimeautomation1.common.BaseClass;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectPage extends BaseClass {
      WebDriver driver;
      public ProjectPage (WebDriver driver){
          this.driver=driver;
      }
      public By taskModule=By.xpath("//div[text()='Tasks']");
      public By addNewButton=By.xpath("//div[text()='Add New']");
      public By addProject=By.xpath("//div[@class='item createNewProject']");
      public By projectTextField=By.xpath("//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']");
      public By dropDown=By.xpath("//div[text()='-- Please Select Customer to Add Project for  --']/following::div[5]");
      public By selectName= By.xpath("//div[text()='-- New Customer --']/following::div[3]");
      public By createProject=By.xpath("//div[text()='Create Project']");
// sendkeys task
      public By taskTextField=By.xpath("//thead[@class='createTasksTableHead']/following::input[1]");

      public void createProject(String projectName)throws InterruptedException{
          driver.findElement(taskModule).click();
          Thread.sleep(5000);
          driver.findElement(addNewButton).click();
          Thread.sleep(5000);
          driver.findElement(addProject).click();
          Thread.sleep(5000);
          driver.findElement(projectTextField).sendKeys(projectName);
          Thread.sleep(5000);
          driver.findElement(dropDown).click();
          Thread.sleep(5000);
          driver.findElement(selectName).click();

      }
          public void createTask(String taskName) throws InterruptedException {

              driver.findElement(taskTextField).sendKeys(taskName);
              Thread.sleep(5000);
              driver.findElement(createProject).click();
    }



}
