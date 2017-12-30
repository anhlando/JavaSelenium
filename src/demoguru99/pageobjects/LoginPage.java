package demoguru99.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//this is the page object class for the login page of demo guru99: http://demo.guru99.com/v4/
//use this account to login as manager:
//   - username: mngr110390
//   - password: mUbEvYq
public class LoginPage {

    WebDriver driver;   //this is the WebDriver object, used to contain the working browser
    By txtUsername = By.xpath("//input[@name='uid']");
    By txtPassword = By.xpath("//input[@name='password']");
    By btnLogin = By.xpath("//input[@name='btnLogin']");

    //constructor, input parameter is the working browser
    public LoginPage(WebDriver d){
        this.driver = d;
    }

    //method to input username
    public void setUsername(String un){
        this.driver.findElement(txtUsername).sendKeys(un);

    }

    //method to input password
    public void setPassword(String pw){
        this.driver.findElement(txtPassword).sendKeys(pw);

    }


    //method to click Login button
    public void clickLogin(){
        this.driver.findElement(btnLogin).click();

    }

    //method to perform login action with username and password as parameters
    public void login(String un, String pw){
        this.setUsername(un);
        this.setPassword(pw);
        this.clickLogin();
    }

}
