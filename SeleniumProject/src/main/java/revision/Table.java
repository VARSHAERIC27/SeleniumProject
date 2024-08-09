package revision;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table extends Base {
	public void table() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
	}
	public void row() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");

		WebElement row =driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]"));
		System.out.println(row.getText());

	}
	public void cell() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement cell =driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td[1]"));
System.out.println(cell.getText());
		
	}
	public void column() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> tablelist =driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		/*for(WebElement table:tablelist) {
			System.out.println(table.getText());
		}*/
Iterator<WebElement>it=tablelist.iterator();
while(it.hasNext()) {
	System.out.println(it.next().getText());
}


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table table=new Table();
		table.initilizeBrowser();
		table.table();
		//table.row();
		//table.cell();
		//table.column();
		
		
	}

}
