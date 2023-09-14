
package com.eurotech.Pages;

import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage {



    @FindBy(css = "#dashboard-p1")
    public WebElement welcomeMessage;

    @FindBy(css = ".nav__menu-item")
    public List<WebElement> menuList;

    @FindBy(xpath = "//a[@class='btn btn-light']")
    public List<WebElement> dashboardList;

    @FindBy(linkText = "All Posts")
    public WebElement allPost;

    @FindBy(linkText = "Developers")
    public WebElement developers;

    @FindBy(xpath = "//span[text()='My Account']")
    public WebElement myAccount;

    ////tbody/tr[2]/td[2]
    @FindBy(xpath = "//*[text()='Apple']/../td[2]")
    public WebElement jobTitle;

    public void navigateMenu(String menuName){

        Driver.get().findElement(By.xpath("//*[text()='"+menuName+"']")).click();

    }
    public void navigateSubMenu(String subMenuName){

        BrowserUtils.hover(myAccount);
        Driver.get().findElement(By.xpath("//span[text()='"+subMenuName+"']")).click();
    }

    public String getHeader(String headerName){
        return Driver.get().findElement(By.xpath("//h1[text()='"+headerName+"']")).getText();
    }


}

