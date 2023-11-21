import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Table {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
			String salElem=driver.findElement(
					By.xpath("//td[contains(text(),'B. Wagner')]//following-sibling::td[5]")).getText();
			System.out.println(salElem);
			List<WebElement> L1=driver.findElements(By.xpath("//td[contains(text(),'B. Wagner')]//following-sibling::td[5]"));
			System.out.println(L1.size());
			for (WebElement cell:L1) {
				System.out.println(cell.getText());
			}


}
}
