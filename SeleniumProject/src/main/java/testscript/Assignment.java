package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment extends Base {
	public void inputAddition() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement valueA= driver.findElement(By.id("value-a"));
		valueA.sendKeys("1");
		WebElement valueB= driver.findElement(By.id("value-b"));
		valueB.sendKeys("2");
		WebElement getTotal= driver.findElement(By.id("button-two"));
		getTotal.click();

		

		
		
	}
	

	public static void main(String[] args) {
		Assignment assignment=new Assignment();
		assignment.initiliseBrowser();
		assignment.inputAddition();

	}

}
