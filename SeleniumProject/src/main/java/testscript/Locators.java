package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators  extends Base{
	public void id() {
		//WebElement elementname=driver.findElement(By.Locator("locator value"));
		WebElement Message=driver.findElement(By.id("single-input-field"));
		
		//find element- is a method used to locate a single webelement on a webpage
		//By --is a class used to locate a web element, it provides method id, name,etc.
		WebElement singlecheckbox=driver.findElement(By.id("gridCheck"));
		WebElement firstname=driver.findElement(By.id("validationCustom01"));
        WebElement checkebox1=driver.findElement(By.id("check-box-one"));
        WebElement city=driver.findElement(By.id("validationCustom03"));
        WebElement checkbox2= driver.findElement(By.id("check-box-two"));
        

		
	}
	public void className() {
		WebElement element1=driver.findElement(By.className("clearfix"));
		WebElement element2=driver.findElement(By.className("container page"));
		WebElement element3=driver.findElement(By.className("mb-sec"));
		WebElement element4= driver.findElement(By.className("header-top"));
		WebElement element5=driver.findElement(By.className("needs-validation"));



	}
/*public void tagNameName() {
				//WebElement elementname1=driver.findElements(By.tagname("img"));

	}*/
	public void name() {
		WebElement element1=driver.findElement(By.name("author"));
		WebElement element2=driver.findElement(By.name("description"));
		WebElement element3=driver.findElement(By.name("keywords"));
		WebElement element4=driver.findElement(By.name("viewport"));
		//WebElement element5=driver.findElement(By.name());



	}
public void linkText() {
	WebElement element1=driver.findElement(By.linkText("Checkbox Demo"));
	WebElement element2=driver.findElement(By.linkText("Select Input"));
	WebElement element3=driver.findElement(By.linkText("Ajax Form Submit"));
	WebElement element4=driver.findElement(By.linkText("Simple Form Demo"));
	WebElement element5=driver.findElement(By.linkText("Radio Buttons Demo"));




}
public void parttialLinkText() {
	WebElement element1=driver.findElement(By.partialLinkText("Checkbox"));
	WebElement element2=driver.findElement(By.partialLinkText("Select"));
	WebElement element3=driver.findElement(By.partialLinkText("Ajax Form"));
WebElement element4=driver.findElement(By.partialLinkText("Simple Form"));
WebElement element5=driver.findElement(By.partialLinkText("Radio Buttons"));


}


	public static void main(String[] args) {
		Locators locators= new Locators();
		locators.initiliseBrowser();
		locators.id();
		locators.className();
		locators.name();
		locators.parttialLinkText();
		locators.linkText();
		locators.driverQuitAndClose();
	}

}
