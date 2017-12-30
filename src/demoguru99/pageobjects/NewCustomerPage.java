package demoguru99.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class NewCustomerPage {
    WebDriver driver;
    By txtCusName = By.xpath("//input[@name='name']");
    By radMale = By.xpath("//input[@name='rad1' and @value='m']");
    By radFemale = By.xpath("//input[@name='rad1' and @value='f']");
    By dob = By.xpath("//input[@name='dob']");
    By txtAddress = By.xpath("//textarea[@name='addr']");
    By txtCity = By.xpath("//input[@name='city']");
    By txtState = By.xpath("//input[@name='state']");
    By txtPin = By.xpath("//input[@name='pinno']");
    By txtMobile = By.xpath("//input[@name='telephoneno']");
    By txtEmail = By.xpath("//input[@name='emailid']");
    By txtPassword = By.xpath("//input[@name='password']");
    By btnSubmit = By.xpath("//input[@name='sub']");

    //constructor - input param is the working browser (WebDriver)
    public NewCustomerPage(WebDriver d){
        this.driver = d;
    }

    //enter customer name
    public void setCusName(String un){
        this.driver.findElement(txtCusName).sendKeys(un);
    }

    //select gender: true for male | false for female
    public void selectGender(boolean gender){
        if (gender){
            this.driver.findElement(radMale).click();
        }
        else {
            this.driver.findElement(radFemale).click();
        }
    }

    //enter birthday - input parameter is a string, and must follow this pattern: 'dd/mm/yyyy'
    public void setDob(String bd){
        this.driver.findElement(dob).sendKeys(bd);
    }

    //enter address
    public void setAddress(String addr){
        this.driver.findElement(txtAddress).sendKeys(addr);
    }

    //enter city
    public void setCity(String city){
        this.driver.findElement(txtCity).sendKeys(city);
    }

    //enter state
    public void setState(String state){
        this.driver.findElement(txtState).sendKeys(state);
    }

    //enter PIN
    public void setTxtPin(String pin){
        this.driver.findElement(txtPin).sendKeys(pin);
    }

    //click Submit button
    public void clickSubmit(){
        this.driver.findElement(btnSubmit).click();
    }

    //method to verify if the Add new customer page is displayed yet
    public boolean isDisplayed(){
        return (this.driver.getTitle().trim() == "Guru99 Bank New Customer Entry Page");
    }
}
