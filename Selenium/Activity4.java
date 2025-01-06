import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice");
        System.out.println("Page title: " + driver.getTitle());
        
        WebElement thirdheader=driver.findElement(By.xpath("//h3[contains(text(), '#3')]"));
        String thirdHeaderText = thirdheader.getText();
        System.out.println("Third header's text: "+thirdHeaderText);
 
        WebElement fifthheader= driver.findElement(By.xpath("//h5[contains(text(), '#5')]"));
        Color fifthHeaderColor = Color.fromString(fifthheader.getCssValue("color"));
        System.out.println("Color as RGB: " + fifthHeaderColor.asRgb());
        System.out.println("Color as hexcode: " + fifthHeaderColor.asHex());

        String purpleButtonClass = driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class");
        System.out.println("All classes of purple button: "+purpleButtonClass);
        
        String slateButtonText = driver.findElement(By.xpath("//button[text()='Slate']")).getText();
        System.out.println("Text of slate button: "+slateButtonText);
        driver.quit();

	}
}
