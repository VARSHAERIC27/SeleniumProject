package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathExample extends Base {
	public void relativeXpath() {
		// syntax relative xpah
		// tagname[@attributetype='value']
		WebElement element = driver.findElement(By.xpath("//input[@placeholder=Message]"));
		WebElement element1 = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement element2 = driver.findElement(By.xpath("//button[@type='btn btn-primary']"));
		WebElement element3 = driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement element4 = driver.findElement(By.xpath("//button[@id='button-two']"));
		WebElement element5 = driver.findElement(By.xpath("//input[@id='subject']"));

		/*
		 * absoulut xpath
		 * 1)/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input 2)
		 * WebElement element5=driver.findElement(By.xpath(
		 * "/html/body/section/div/div/div[2]/div/div/div[2]/form/div[1]/input"));
		 * 
		 */}

	public void dinamicXpath() {
		/*
		 * dinamic xpath
		 *  1.contains 
		 * 2.text
		 */
		// contains
		WebElement element = driver.findElement(By.xpath("//button[contains(@id,'-one')]"));
		WebElement element1 = driver.findElement(By.xpath("//input[contains(@id,'sub')]"));
		WebElement element2 = driver.findElement(By.xpath("//textarea[contains(@placeholder,Descr)]"));
		WebElement element3 = driver.findElement(By.xpath("//input[contains(@class,'-primary')]"));
		WebElement element4 = driver.findElement(By.xpath("//input[contains(@placeholder,'First')]"));
		WebElement element5 = driver.findElement(By.xpath("//input[contains(@placeholder,'Last')]"));

		// text

		WebElement element6 = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement element8 = driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement element9 = driver.findElement(By.xpath("//button[text()='Submit form']"));
		WebElement element10 = driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
		WebElement element11 = driver.findElement(By.xpath("//a[text()='Select Input']"));
		WebElement element12 = driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));

	}

	/*
	 * xpath axes methods 
	 * 1.parent
	 *  WebElement element1= driver.findElement(By.xpath("//button[text()='Show Message']//parent::form"));
	 * 
	 * 
	 * 
	 * 2.child 
	 *  WebElement element1=driver.findElement(By.xpath("//a[@class='navbar-brand']//child::img"));
	 * 
	 * 3.following //input[@type='text']//following::input
	 * 
	 * 4.indexing //form[@method='POST'][1]
	 * 
	 */
	public void axesMethods() {
		// 1.parent
		WebElement element = driver.findElement(By.xpath("//a[text()='Checkbox Demo']//parent::li"));
		WebElement element1 = driver.findElement(By.xpath("//button[text()='Get Results']//parent::form"));
		WebElement element2 = driver.findElement(By.xpath("//input[@id='validationCustom01']//parent::div"));
		WebElement element3 = driver.findElement(By.xpath("//input[@id='validationCustom02']//parent::div"));
		WebElement element4 = driver.findElement(By.xpath("//input[@id='single-input-field']//parent::div"));
		// 2.child
		WebElement elemen5 = driver.findElement(By.xpath("//a[@class='navbar-brand']//child::img"));
		WebElement element6 = driver.findElement(By.xpath("//button[@class='navbar-toggler']//child::span"));
        WebElement element15=driver.findElement(By.xpath("")); 
		// following
		WebElement element7 = driver.findElement(By.xpath("//input[@type='text']//following::input"));
		WebElement element13 = driver.findElement(By.xpath("//input[@id='value-a']//following::input"));
		WebElement element14 = driver.findElement(By.xpath("//button[@id='button-two']//following::div"));

		// indexing
		WebElement element8 = driver.findElement(By.xpath("//form[@method='POST'][1]"));
		WebElement element9 = driver.findElement(By.xpath("(//option[@value='Red'])[1]"));
		WebElement element10 = driver.findElement(By.xpath("(//option[@value='Yellow'])[2]"));
		WebElement element11 = driver.findElement(By.xpath("(//div[@class='form-check'])[2]"));
		WebElement element12 = driver.findElement(By.xpath("(//input[@name='student-age'])[1]"));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XpathExample xpathexample = new XpathExample();
		xpathexample.initiliseBrowser();
	}

}
