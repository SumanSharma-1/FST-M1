import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {
    public static void main(String[] args) {
        
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/alerts");
        System.out.println("Page title: " + driver.getTitle());

        driver.findElement(By.id("confirmation")).click();

        
        Alert confirmAlert = driver.switchTo().alert();
        System.out.println("Text in alert: " + confirmAlert.getText());

        confirmAlert.accept();
        System.out.println(driver.findElement(By.id("result")).getText());

        driver.findElement(By.id("confirmation")).click();
        confirmAlert = driver.switchTo().alert();
        confirmAlert.dismiss();
        System.out.println(driver.findElement(By.id("result")).getText());
        driver.quit();
    }
}