package com.eurotech.step_definations;

import com.eurotech.Pages.DashboardPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class DashboardMenuStepDef {

    DashboardPage dashboardPage= new DashboardPage();

    @Then("The user should be able to see following menu")
    public void the_user_should_be_able_to_see_following_menu(List<String> expectedList) {
        System.out.println("Menu options size: " + expectedList.size());
        System.out.println("Menu options: " + expectedList);

        List<String> actualList = BrowserUtils.getElementsText(dashboardPage.menuList);
        Assert.assertEquals(expectedList, actualList);
    }

}
