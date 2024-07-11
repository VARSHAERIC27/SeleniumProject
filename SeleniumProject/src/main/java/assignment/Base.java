package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	WebDriver driver;
	public void InitiliseBrowser() {
	// driver = new EdgeDriver();
		driver= new ChromeDriver();
	 driver.get("https://selenium.qabible.in/");
	 driver.manage().window().maximize();
		
	}
	public void quitAndClose() {
		driver.quit();
	}

	public static void main(String[] args) {
	//	WebDriver driver = new EdgeDriver();

		Base base= new Base();
		base.InitiliseBrowser();
		base.quitAndClose();
	}

}
