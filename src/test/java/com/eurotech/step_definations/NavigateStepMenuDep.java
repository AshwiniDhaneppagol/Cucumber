package com.eurotech.step_definations;

import com.eurotech.Pages.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class NavigateStepMenuDep {

    DashboardPage dashboardPage= new DashboardPage();
    @Given("The user Logged in as Teacher")
    public void the_user_logged_in_as_teacher() {
        System.out.println("User Login as Teacher");
    }

    @Then("The user get the text of welcome")
    public void theUserAtFirstGetTheTextOfWelcome() {
        System.out.println("User should be able to get the Welcome Text");
    }

    @When("user go to Developers Menu")
    public void userGoToDevelopersMenu() {
        System.out.println("User go to the Developer Menu");
    }

    @Then("The user should be able get the text of Developers")
    public void the_user_should_be_able_get_the_text_of_developers() {
        System.out.println("User should be able to get the text of Developers");
    }


    @When("The user go to All Posts menu")
    public void theUserGoToAllPostsMenu() {
        System.out.println("User go to All posts Menu");
    }

    @Then("The user get the text of Posts")
    public void theUserGetTheTextOfPosts() {
        System.out.println("User should be able to get text of Posts");
    }

    @When("The user go to My Account menu")
    public void theUserGoToMyAccountMenu() {
        System.out.println("User go to My Account Menu");
    }

    @Then("The user get the text of Dashboard")
    public void theUserGetTheTextOfDashboard() {
        System.out.println("User should be able to get text of Dashboard");
    }

    @And("The user navigates to {string} menu")
    public void theUserNavigatesToMenu(String menuName) {

        dashboardPage.navigateMenu(menuName);


    }

    @Then("The should be able to see header as {string}")
    public void theShouldBeAbleToSeeHeaderAs(String expectedHeader) {

        String actualHeader= dashboardPage.getHeader(expectedHeader);
        Assert.assertEquals(expectedHeader,actualHeader);
    }
}
