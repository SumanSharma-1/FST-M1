import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity13 {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/webelements/tables");
		System.out.println("Page title is: "+driver.getTitle());
		
		List<WebElement> rows= driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Number of rows: "+rows.size());
		
		List<WebElement> cols= driver.findElements(By.xpath("//table[contains(@class, 'full')]//th"));
		System.out.println("Number of columns: "+cols.size());
		
		List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[3]/td"));
        System.out.println("Third row cell values:");
        for(WebElement cell : thirdRow) {
            System.out.println(cell.getText());
        }

        WebElement secondRow = driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second cell value: " + secondRow.getText());
        driver.quit();
		

	}

}
