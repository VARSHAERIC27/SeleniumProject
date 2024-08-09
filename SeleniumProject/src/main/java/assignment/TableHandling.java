package assignment;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TableHandling  extends Base{
	public void rowPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[5]"));
		System.out.println(row.getText());
	}
	public void columnPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> columnList=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[3]"));
		/*for(WebElement col:columnList) {
			System.out.println(col.getText());
		}*/
		Iterator<WebElement>it=columnList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getText());

		}

	}
	public void cellPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement cell=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[3]//td[2]"));
	System.out.println(cell.getText());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling tablehandling=new TableHandling();
		tablehandling.InitiliseBrowser();
		//tablehandling.rowPrinting();
		//tablehandling.columnPrinting();
		tablehandling.cellPrinting();
	}

}
