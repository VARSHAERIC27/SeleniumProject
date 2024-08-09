package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class TableHandling  extends Base{
	public void tablePrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
	}
	public void rowPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");

		WebElement row1=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]"));
		System.out.println(row1.getText());

	}
	public void cellPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement cell=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td[1]"));
		System.out.println(cell.getText());

	}
	public void columnPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> tablelist=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
for(WebElement menu:tablelist) {
	System.out.println(menu.getText());

}
	}
	public void searchElement() { // search ashton cox element in first column
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");

		String s="Ashton Cox"	;
		List<WebElement> list1=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
for(WebElement emp:list1) {
	//if(emp.getText().contains(s))
	if(s.equals(emp.getText())) {
	
		//System.out.println(emp.getText());

		System.out.println("both are same =" +emp.getText());
		

	}
} 

}
	


		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling tablehandling=new TableHandling();
		tablehandling.initiliseBrowser();
		//tablehandling.tablePrinting();
		//tablehandling.rowPrinting();
		//tablehandling.cellPrinting();
		//tablehandling.columnPrinting();
		tablehandling.searchElement();
		
	}

}
