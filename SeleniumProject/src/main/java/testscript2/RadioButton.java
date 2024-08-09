package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class RadioButton extends Base{
	public void radiobutton () {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement female=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		//female.click();
		if(!female.isSelected()) {
			female.click();
			System.out.println("radio button selected");

			
		}
		else {
			System.out.println("radio button already selected");
		}
		//WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		//showmessage.click();

		
	}

	public static void main(String[] args) {
		RadioButton radiobutton= new RadioButton();
		radiobutton.initiliseBrowser();
		radiobutton.radiobutton();
	}

}
