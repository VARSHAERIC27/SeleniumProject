package revision;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindow extends Base{
	public void multipleWindow() {
		driver.navigate().to("https://webdriveruniversity.com");
		WebElement contact=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contact.click();
		WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();
		String Parent=driver.getWindowHandle();
		System.out.println("parent "+Parent);
		System.out.println("************************************");

		Set<String> Allwindows=driver.getWindowHandles();
		for(String temp:Allwindows) {
			if(!temp.equals(Parent)) {
			System.out.println("window"+temp);
			driver.switchTo().window(temp);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("************************************");

			}

			

			

		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindow multipleWindow=new MultipleWindow();
		multipleWindow.initilizeBrowser();
		multipleWindow.multipleWindow();
		
	}

}
