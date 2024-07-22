package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxRadioButtons extends Base{
	

	public void checkBox() {
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement option1=driver.findElement(By.xpath("//input[@value='option-1']"));
		System.out.println(option1.isDisplayed());

		option1.click();
		System.out.println(option1.isSelected());
		WebElement option2=driver.findElement(By.xpath("//input[@value='option-2']"));
		System.out.println(option1.isDisplayed());
		option2.click();
		System.out.println(option2.isSelected());
		//WebElement option3=driver.findElement(By.xpath("//input[@value='option-3']"));
		//System.out.println(option3.isSelected());
	}
public void radioButton() {
	driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

	WebElement button1=driver.findElement(By.xpath("//input[@value='green']"));
	System.out.println(button1.isDisplayed());
	button1.click();
	System.out.println(button1.isSelected());
	WebElement button2=driver.findElement(By.xpath("//input[@value='orange']"));
	System.out.println(button2.isDisplayed());
	button2.click();
	System.out.println(button2.isSelected());
}
public void enableCheck() {
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement message= driver.findElement(By.id("single-input-field"));
	System.out.println(message.isEnabled());

	
}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxRadioButtons checkboxradiobuttons=new CheckBoxRadioButtons();
		checkboxradiobuttons.initiliseBrowser();
		checkboxradiobuttons.checkBox();
		checkboxradiobuttons.radioButton();
		checkboxradiobuttons.enableCheck();

	}

}
