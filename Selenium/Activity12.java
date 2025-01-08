import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {

	public static void main(String[] args) {

		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("https://training-support.net/webelements/dynamic-content");
		System.out.println("Page title is: "+driver.getTitle());
		
		WebElement clickMe= driver.findElement(By.id("genButton"));
		clickMe.click();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"),"release")))
			System.out.println(driver.findElement(By.id("word")).getText());
		
		driver.quit();
	}

}
