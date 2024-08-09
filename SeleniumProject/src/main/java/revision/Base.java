package revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public void initilizeBrowser() {
		 driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
			//https://demo.automationtesting.in/Register.html
				//https://www.leafground.com/input.xhtml
		//https://demoqa.com/select-menu
		driver.manage().window().maximize();
	}
	public void driverQuitAndclose() {
		//driver.close();
		driver.quit();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base=new Base();
		base.initilizeBrowser();
		base.driverQuitAndclose();
		
	}

}
