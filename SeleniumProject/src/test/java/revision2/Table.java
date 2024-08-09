package revision2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Table extends Base{
	@Test
	public void tableprint() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());}
	@Test
	public void row() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");

		WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[5]"));
		row.getText();
		
	}
	@Test
	public void cell() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");

		WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[3]//td[2]"));
		row.getText();
		
	}
	@Test
	public void coulmn() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");

		List<WebElement> column=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
for(WebElement temp:column) {
	System.out.println(temp.getText());
}}
	@Test
public void  search() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");

	String v="Ashton Cox";
	WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
	if(v.equals(table.getText())) {
		System.out.println("both are same");

	}
	else {
		System.out.println("both are not same");

	}

	
	
	
	
}
	}
	

	


