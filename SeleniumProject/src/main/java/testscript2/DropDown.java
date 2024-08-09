package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testscript.Base;

public class DropDown extends Base{
	public void dropdown() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("Red");
		select.selectByIndex(0);
		//select.selectByValue("Yellow");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DropDown dropdown=new DropDown();
		dropdown.initiliseBrowser();
		dropdown.dropdown();
		
	}

}
