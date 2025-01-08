import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {
    public static void main(String[] args) {
       
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/selects");
        System.out.println("Page title is: " + driver.getTitle());

        WebElement dropdown = driver.findElement(By.xpath("//select[contains(@class, 'h-10')]"));
        Select select = new Select(dropdown);

        select.selectByVisibleText("Two");
        System.out.println("Second option: " + select.getFirstSelectedOption().getText());

        select.selectByIndex(3);
        System.out.println("Third option: " + select.getFirstSelectedOption().getText());

        select.selectByValue("four");
        System.out.println("Fourth option: " + select.getFirstSelectedOption().getText());

        List<WebElement> allOptions = select.getOptions();
        System.out.println("Options in the dropdown: ");
        for(WebElement option : allOptions) {
            System.out.println(option.getText());
        }

        driver.quit();
    }
}