package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestStepsAct5 {
	    WebDriver driver=Hooks.getDriver();
	    WebDriverWait wait=Hooks.getWait();
	    
	    @Given("User is on Login page")
	    public void launchUrl() {
	        driver.get("https://training-support.net/webelements/login-form");
	    }

	    @When("User enters {string} and {string}")
	    public void user_enters_and(String username, String password) throws Throwable {
	        driver.findElement(By.id("username")).sendKeys(username);
	        driver.findElement(By.id("password")).sendKeys(password);
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();
	    }
	    
	    @Then("Get your page title and confirmation message")
	    public void readTitleAndHeading() {
	    	//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("h2.mt-5")));    
	    	WebElement success= driver.findElement(By.cssSelector("h2.mt-5"));
	    	String confirmMessage = success.getText();
	    	WebElement invalid= driver.findElement(By.cssSelector("h2.mt-3"));
	    	String invalidconfirm= invalid.getText();
	    	if(success.isDisplayed())
	    	{
	    		String pageTitle = driver.getTitle();
		        //String confirmMessage = success.getText();
		        System.out.println("Page title is: " + pageTitle);
		        System.out.println("Login message is: " + confirmMessage);
		        Assert.assertEquals(confirmMessage, "Welcome Back, Admin!");
	    	}
	    	else 
	    	{
	    		//String invalidconfirm= invalid.getText();
	    		Assert.assertEquals(invalidconfirm, "Invalid credentials");
	    	}
	        
	    }

}
