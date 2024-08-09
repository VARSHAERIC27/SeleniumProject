package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;



public class FileUpload extends Base {
	public void sendkey() {
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		WebElement choosefile=driver.findElement(By.xpath("//input[@id='file-upload']"));
		choosefile.sendKeys("C:\\Users\\DELL\\Downloads\\Manual testing.pdf");
		WebElement upload=driver.findElement(By.xpath("//input[@id='file-submit']"));
		upload.click();
		
		/*driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");

		WebElement file1=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		file1.click();
		file1.sendKeys("C:\\Users\\DELL\\Downloads\\Manual testing.pdf");

		*/
		//upload a file from system
		//sendkeys method will only work if file upload control's type attribute  value is file,,,
		//else we need to use robot class
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUpload fileupload=new FileUpload();
		fileupload.initiliseBrowser();
		fileupload.sendkey();
		
		
	}

}
