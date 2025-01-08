import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 {
    public static void main(String[] args){
       
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/alerts");
        System.out.println("Page title: " + driver.getTitle());

        driver.findElement(By.id("prompt")).click();

        Alert promtAlert = driver.switchTo().alert();
        System.out.println("Text in alert: " + promtAlert.getText());
        promtAlert.sendKeys("Awesome!");

        promtAlert.accept();
        System.out.println(driver.findElement(By.id("result")).getText());
        driver.quit();
    }
}