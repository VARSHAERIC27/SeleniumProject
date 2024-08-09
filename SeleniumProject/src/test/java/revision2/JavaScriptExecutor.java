package revision2;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class JavaScriptExecutor extends Base{
	@Test
	public void javascriptExecutor() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,150)","");
		//js.executeScript("window.scrollBy(0,-150)", "");
		driver.navigate().to("https://www.amazon.in/");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		//WebElement amazone=driver.findElement(By.id("nav-search-submit-button"));
		//js.executeScript("arguments[0].click();",amazone );
	}

}
