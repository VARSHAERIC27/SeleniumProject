package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	public void upload() {
		/*driver.navigate().to("https://the-internet.herokuapp.com/upload");
		WebElement file=driver.findElement(By.xpath("//input[@id='file-upload']"));
		file.sendKeys("C:\\Users\\DELL\\Downloads\\Manual testing.pdf");
		WebElement upload=driver.findElement(By.id("file-submit"));
		upload.click();*/
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		WebElement file=driver.findElement(By.id("imagesrc"));
		file.sendKeys("C:\\Users\\DELL\\Pictures\\float.png");

		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUpload fileupload=new FileUpload();
		fileupload.initilizeBrowser();
		fileupload.upload();
	}

}
