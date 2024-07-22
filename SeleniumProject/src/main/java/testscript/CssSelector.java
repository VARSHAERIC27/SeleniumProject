package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector  extends Base{
	public void tagAndId()//tag#id 
	{
		WebElement element1= driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement element2=driver.findElement(By.cssSelector("input#validationCustom03"));
		WebElement element3=driver.findElement(By.cssSelector("input#validationCustom04"));
		WebElement element4=driver.findElement(By.cssSelector("select#single-input-field"));
		WebElement element5=driver.findElement(By.cssSelector("button#button-one"));
		
	}
public void tagAndClass() //tag.class
{
	WebElement element1= driver.findElement(By.cssSelector("button.navbar-toggler"));
	WebElement element2=driver.findElement(By.cssSelector("input.form-control"));
	WebElement element3=driver.findElement(By.cssSelector("textarea.form-control"));
	WebElement element4=driver.findElement(By.cssSelector("div.my-2"));
	WebElement element5=driver.findElement(By.cssSelector("footer.mt-5"));
	

	}
public void tagAndAttribute()//tag[attribute=value] 
{
	WebElement element1= driver.findElement(By.cssSelector("button[id=button-one ]"));
	WebElement element2=driver.findElement(By.cssSelector("input[id=single-input-field]"));
	WebElement element3=driver.findElement(By.cssSelector("input[id=value-b]"));
	WebElement element4=driver.findElement(By.cssSelector("input[placeholder=Message]"));
	WebElement element5=driver.findElement(By.cssSelector("div[id=message-one]"));
	
	

}
public void tagClassAndAttribute()//tag.classname[attribute=value]
{
	WebElement element1= driver.findElement(By.cssSelector("input.form-control[id=validationCustom01]"));
	WebElement element2= driver.findElement(By.cssSelector("div.my-2[id=message-one]"));
	WebElement element3=driver.findElement(By.cssSelector("input.form-control[id=value-a]"));
	WebElement element4= driver.findElement(By.cssSelector("div.my-2[id=message-two]"));
	WebElement element5=driver.findElement(By.cssSelector("input.form-control[id=value-b]"));
	

}
	

	public static void main(String[] args) {
		CssSelector cssSelector=new CssSelector();
		cssSelector.initiliseBrowser();
		cssSelector.tagAndId();
		cssSelector.tagAndClass();
		cssSelector.tagAndAttribute();
		cssSelector.tagClassAndAttribute();
		cssSelector.driverQuitAndClose();
	}

}
