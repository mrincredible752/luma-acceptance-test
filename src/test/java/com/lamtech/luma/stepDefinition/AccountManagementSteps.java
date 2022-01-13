package com.lamtech.luma.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountManagementSteps {
    WebDriver driver;
    @Given("I am on create an account page")
    public void iAmOnCreateAnAccountPage() {
        //Define Browser
        WebDriverManager.chromedriver().setup();
        //Open Browser
        driver = new ChromeDriver();
        //Maximize Browser Window
        driver.manage().window().maximize();
        //Launch Application
        driver.get("https://magento2-demo.magebit.com/");
        //Click on Create Account link
        driver.findElement(By.linkText("Create an Account")).click();
    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String FirstName, String LastName, String Email, String Password, String ConfirmPassword) {
        driver.findElement(By.name("firstname")).sendKeys(FirstName);
        driver.findElement(By.name("lastname")).sendKeys(LastName);
        driver.findElement(By.name("email")).sendKeys(Email);
        driver.findElement(By.name("password")).sendKeys(Password);
        driver.findElement(By.name("password_confirmation")).sendKeys(ConfirmPassword);


    }

    @And("I click on create an account")
    public void iClickOnCreateAnAccount(){
        driver.findElement(By.cssSelector("#form-validate > div > div.primary > button > span")).click();

    }

    @Then("my account page is displayed")
    public void myAccountPageIsDisplayed() {
    }

    @Given("I am on Account login page")
    public void iAmOnAccountLoginPage() {
        //Define Browser
        WebDriverManager.chromedriver().setup();
        //Open Browser
        driver = new ChromeDriver();
        //Maximize Browser Window
        driver.manage().window().maximize();
        //Launch Application
        driver.get("https://magento2-demo.magebit.com/");
        //Click on Sign in Link
        driver.findElement(By.linkText("Sign In")).click();
    }

    @When("I enter {string} {string}")
    public void iEnter(String Email, String Password) {
        driver.findElement(By.id("email")).sendKeys(Email);
        driver.findElement(By.name("login[password]")).sendKeys(Password);
    }

    @And("I click on Sign In")
    public void iClickOnSignIn() {
        driver.findElement(By.cssSelector("#send2 > span")).click();
    }

    @Then("account page is displayed")
    public void accountPageIsDisplayed() {
    }


    @Then("error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
    }

    @Then("error message should be displayed that email already exist")
    public void errorMessageShouldBeDisplayedThatEmailAlreadyExist() {
    }
}
