import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/webelements/dynamic-controls");
		System.out.println("Page title is: " + driver.getTitle());
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement checkbox= driver.findElement(By.id("checkbox"));
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		System.out.println("Is checkbox visible? " + checkbox.isDisplayed());
		
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(checkbox)).click();
		System.out.println("Is checkbox selected? " + checkbox.isSelected());
		driver.quit();

	}

}
