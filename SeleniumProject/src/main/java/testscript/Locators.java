package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators  extends Base{
	public void id() {
		//WebElement elementname=driver.findElement(By.Locator("locator value"));
		WebElement Message=driver.findElement(By.id("single-input-field"));
		
		//find element- is a method used to locate a single webelement on a webpage
		//By --is a class used to locate a web element it
		WebElement singlecheckbox=driver.findElement(By.id("gridCheck"));
		WebElement firstname=driver.findElement(By.id("validationCustom01"));
        WebElement checkebox1=driver.findElement(By.id("check-box-one"));
        WebElement city=driver.findElement(By.id("validationCustom03"));
        WebElement checkbox2= driver.findElement(By.id("check-box-two"));
        

		
	}
	public void className() {
		
	}
public void tagNameName() {
		
	}
public void linkText() {
	
}
public void parttialLinkText() {
	
}


	public static void main(String[] args) {
		Locators locators= new Locators();
		locators.initiliseBrowser();
		locators.id();
		locators.driverQuitAndClose();
	}

}