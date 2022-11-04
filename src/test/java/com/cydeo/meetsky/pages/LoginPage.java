package com.cydeo.meetsky.pages;

import com.cydeo.meetsky.utilities.ConfigurationReader;
import com.cydeo.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(id= "user")
    public WebElement inputUsername;

    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@id=\"submit-form\"]")
    public WebElement loginButton;

    public void loginWithConfig(){
        inputUsername.sendKeys(ConfigurationReader.getProperty("username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }



}


