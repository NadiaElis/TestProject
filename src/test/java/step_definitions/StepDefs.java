package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebElement;


public class StepDefs{
    public WebDriver driver;

    public StepDefs()
    {
        driver = Hooks.driver;
    }

        @Given("^navigate to gmail page$")
        public void navigate_to_gmail_page () throws Throwable {
            driver.get("https://www.delta.com/custlogin/loginPage.action");

        }

        @When("^user logged with username as userA and password as password$")
        public void user_logged_with_username_as_userA_and_password_as_password() throws Throwable {
            WebElement userName = driver.findElement(By.id("usernm"));
            userName.sendKeys("1234567");
            WebElement password = driver.findElement(By.id("pwd"));
            password.sendKeys("Mypwd1234567");
            driver.findElement(By.id("submit1")).click();
        }

    @Then("^account page should be displayed$")
    public void account_page_should_be_displayed() throws Throwable {
            String expectedMessage = "My Account";
            String actualMessage = driver.findElement(By.id("smNumberLabel")).getText();
            System.out.println(actualMessage);
            Assert.assertTrue("Login not successful",expectedMessage.equals(actualMessage));
        }
    }