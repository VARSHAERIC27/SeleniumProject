package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Frames extends Base {
	public void frameHandling() {
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		//WebElement element=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframe);
		WebElement element=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		element.click();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frames frames=new Frames();
		frames.initiliseBrowser();
		frames.frameHandling();
		
	}

}
