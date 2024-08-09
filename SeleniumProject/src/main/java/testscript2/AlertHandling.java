package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class AlertHandling extends Base{
	
	public void simpleAlert() {
driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");	
WebElement element=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
element.click();
driver.switchTo().alert().accept();

}
public void confirmationAlert() {
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");	
	WebElement element1=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
	element1.click();
	driver.switchTo().alert().dismiss();
	//driver.switchTo().alert().accept();

		
	}

public void promptAlert() {
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");	
	WebElement element=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	element.click();
	driver.switchTo().alert().sendKeys("varsha");
	driver.switchTo().alert().accept();
	


	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alertHandling=new AlertHandling();
		alertHandling.initiliseBrowser();
		//alertHandling.simpleAlert();
		//alertHandling.promptAlert();
		alertHandling.confirmationAlert();
		
	}

}
