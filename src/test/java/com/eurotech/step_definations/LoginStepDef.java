package com.eurotech.step_definations;

import com.eurotech.Pages.DashboardPage;
import com.eurotech.Pages.LoginPage;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.get().get(ConfigurationReader.get("url"));

    }
    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {

        loginPage.loginWithTeacher();

    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {

        Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains("Welcome"));
    }

    @When("The user enters student credentials")
    public void theUserEntersStudentCredentials() {

        loginPage.loginWithStudent();

    }
    @When("The user enters developer credentials")
    public void the_user_enters_developer_credentials() {
        System.out.println("I enter developer username and password and click login button");
        loginPage.loginWithDeveloper();
    }

    @When("The user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {

        System.out.println("username = " + username);
        System.out.println("password = " + password);
        loginPage.login(username, password);


    }

    @Then("The welcome message contains {string}")
    public void theWelcomeMessageContains(String welcomeMessage) {
        // Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains(welcomeMessage));
        Assert.assertEquals(welcomeMessage,dashboardPage.welcomeMessage.getText());
    }

    @When("The user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String, String> userCredentials) {
        System.out.println("User Credentials: " + userCredentials);

        String username = userCredentials.get("username");
        String password = userCredentials.get("password");

        loginPage.login(username, password);
    }


    @Then("The warning message contains {string}")
    public void theWarningMessageContains(String expectedErrorMessage) {
        String actualWarningMessage = loginPage.getWarningMessage(expectedErrorMessage);
        System.out.println("actualWarningMessage = " + actualWarningMessage);
        Assert.assertEquals(expectedErrorMessage,actualWarningMessage);
    }
}


