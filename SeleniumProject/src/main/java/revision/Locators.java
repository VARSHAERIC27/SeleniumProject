package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	
	public void locators() {
		WebElement user= driver.findElement(By.id("user-name"));
		user.sendKeys("standard_user");
		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("secret_sauce");
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locators=new Locators();
		locators.initilizeBrowser();
		locators.locators();
		//locators.driverQuitAndclose();
		
	}

}
