package demoguru99.testBDD;

import demoguru99.pageobjects.LoginPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class CreateCustomerSuccessful extends Steps{

    WebDriver driver;
    LoginPage objLoginPage;

    @Given("demo guru99 login page")
    public void setup(){
        try {
            this.driver = new FirefoxDriver();
            this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            this.driver.get("http://demo.guru99.com.v4/");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @When("I enter valid username and password of a manager account")
    public void performLogin(){
        try {
            this.objLoginPage = new LoginPage(this.driver);
            this.objLoginPage.login("mngr110390", "mUbEvYq");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Then("I can login successfully")   //verify that the Manager homepage is displayed
    public void verifyManagerHomepage(){
        try {
            WebElement e = this.driver.findElement(By.xpath("//marquee[class='heading3']"));
            Assert.assertTrue(e.isDisplayed());

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
