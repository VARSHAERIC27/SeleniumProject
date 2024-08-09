package testscript2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class MultipleWindowHandling extends Base {
	public void multipleWindowHandling() {
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement contact=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contact.click();
		WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();
		String Parent=driver.getWindowHandle();
		System.out.println("parent"+Parent);
		System.out.println("*************************************");

		Set<String> allWindows= driver.getWindowHandles();
		for(String temp:allWindows) {
			
			if(!temp.equals(Parent)) {
			System.out.println("Window"+temp);
			driver.switchTo().window(temp);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("*************************************");
			}
			



			
		}

		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindowHandling multiplewindowhandling=new MultipleWindowHandling();
		multiplewindowhandling.initiliseBrowser();
		multiplewindowhandling.multipleWindowHandling();
	}

}
