package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageobject.Login;


import static org.junit.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class LoginStepDefs {

 //   WebDriver driver;
      Login login = new Login();


    public LoginStepDefs()
    {
        PageFactory.initElements(Hook.driver, login);
    }


    @Given("^I navigate to the site$")
    public void iNavigateToTheSite() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        Hook.driver.get("https://www.dev.giftrt.com");
    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        Hook.driver.findElement(By.xpath("/html/body/div[2]/nav[1]/div/div/div[2]/ul/li[4]/a")).click();
    }

    @And("^I enter the email address$")
    public void iEnterTheEmailAddress() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        //Hook.driver.findElement(By.id("email")).sendKeys("oyindamola_oluwaseun@yahoo.com");

        login.enterEmail();
    }

    @And("^I enter the password$")
    public void iEnterThePassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        //Hook.driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("adebola1");

        login.enterPassword();
    }

    @And("^I click on secure login$")
    public void iClickOnSecureLogin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        Hook.driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div[2]/section/form/div[4]/button")).click();
    }

    @Then("^I am logged in$")
    public void iAmLoggedIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        assertEquals("https://www.dev.giftrt.com/", Hook.driver.getCurrentUrl());
    }

    @And("^I enter the invalid password$")
    public void iEnterTheInvalidPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        Hook.driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("adebola2");
    }

    @Then("^I should not be able to login$")
    public void iShouldNotBeAbleToLogin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(Hook.driver.findElement(By.cssSelector(".alert")).isDisplayed());
    }
}
