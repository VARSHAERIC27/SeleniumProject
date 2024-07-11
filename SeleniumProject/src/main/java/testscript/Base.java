package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public void initiliseBrowser() {
	driver= new ChromeDriver(); //browser initilization
	driver.get("https://selenium.qabible.in/");// launching the URL
	driver.manage().window().maximize();
	}
	public void driverQuitAndClose() {
		//driver.close();
		driver.quit();
		
	}
	

	public static void main(String[] args) {
		Base base =new Base();
		base.initiliseBrowser();
		base.driverQuitAndClose();
		
	}

}
