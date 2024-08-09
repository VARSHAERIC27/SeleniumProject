package revision2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUpload  extends Base{
	@Test
	public void upload() throws AWTException {

	driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
	WebElement pdf=driver.findElement(By.id("pickfiles"));
	pdf.click();
	StringSelection ss=new StringSelection("D:\\backup\\Desktop\\java Syllabus.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
Robot robot =new Robot();
robot.delay(250);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);









}}
