package demoguru99.testcases;

import demoguru99.pageobjects.LoginPage;
import demoguru99.pageobjects.NewCustomerPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class CreateCustomerSuccessful {


    public static void main(String args[]){
        try {

            WebDriver driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://demo.guru99.com/v4/");

            LoginPage objLogin = new LoginPage(driver);
            NewCustomerPage objNewCus = new NewCustomerPage(driver);

            objLogin.login("mngr110390", "mUbEvYq");

            //navigate to new customer page
            driver.get("http://demo.guru99.com/v4/manager/addcustomerpage.php");
            //driver.wait(5000);

            System.out.println("Current page is " + driver.getCurrentUrl());


            //click Submit button
            //driver.wait(3000);
            objNewCus.setCusName("abc");
            objNewCus.selectGender(false);
            objNewCus.clickSubmit();
            System.out.println("Test completed!!!");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }


}
