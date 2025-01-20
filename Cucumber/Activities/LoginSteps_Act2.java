package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps_Act2 {
	    WebDriver driver= Hooks.getDriver();
	    WebDriverWait wait= Hooks.getWait();
	    
	    @Given("User is on launch Login page")
	    public void launchLoginPage() {
	        driver.get("https://training-support.net/webelements/login-form");
	    }
	    
	    @When("User enters the username and password")
	    public void enterCredentials() {
	        driver.findElement(By.id("username")).sendKeys("admin");
	        driver.findElement(By.id("password")).sendKeys("password");
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();
	    }
	    
	    @Then("Read the page title and confirmation message")
	    public void readTitleAndHeading() {
	        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("h1.text-center")));
	        String pageTitle = driver.getTitle();
	        String confirmMessage = driver.findElement(By.cssSelector("h1.text-center")).getText();
	        System.out.println("Page title is: " + pageTitle);
	        System.out.println("Login message is: " + confirmMessage);
	    }
	   
	}

