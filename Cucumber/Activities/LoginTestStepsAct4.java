package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestStepsAct4 {
    WebDriver driver=Hooks.getDriver();
    WebDriverWait wait=Hooks.getWait();
    
    @Given("User is on the Login page")
    public void LoginPage() {
        driver.get("https://training-support.net/webelements/login-form");
    }
    
    @When("User enters his {string} and {string}")
    public void user_enters_and(String username, String password){
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
    }
    
    @Then("Read current page title and confirmation message")
    public void readTitleAndHeading() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("h2.mt-5")));
        String pageTitle = driver.getTitle();
        String confirmMessage = driver.findElement(By.cssSelector("h2.mt-5")).getText();
        System.out.println("Page title is: " + pageTitle);
        System.out.println("Login message is: " + confirmMessage);
        Assert.assertEquals(confirmMessage, "Welcome Back, Admin!");
    }

}
