package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base {
	public void dropDown() {
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement drop=driver.findElement(By.id("dropdowm-menu-1"));
		Select select=new Select(drop);
		select.selectByValue("c#");
		//select.selectByIndex(3);
		//select.selectByVisibleText("SQL");
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DropDown dropDown=new DropDown();
		dropDown.initilizeBrowser();
		dropDown.dropDown();
	}

}
