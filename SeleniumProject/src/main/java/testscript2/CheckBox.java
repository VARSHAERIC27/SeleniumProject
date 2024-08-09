package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class CheckBox  extends Base{
	public void checkbox() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement element=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		if((element.isSelected())){
			element.click();
           System.out.println("check box is deselected");
            
			
		}
		else {
			element.click();
	           System.out.println("check box is selected");

		}
		/*//multicheck
		WebElement check1=driver.findElement(By.xpath("(//input[@class='check-box-list'])[1]"));
		
		check1.click();
		WebElement check2=driver.findElement(By.xpath("(//input[@class='check-box-list'])[2]"));
		check2.click();*/
		
		/*
		List<WebElement> check=driver.findElements(By.xpath("(//input[@class='check-box-list'])"));

for(WebElement temp:check) {
	if(temp.equals(check.get(2))){
		temp.click();
	}
	if(temp.equals(check.get(1))){
		temp.click();
	}}*/
	
	
	//temp.click();
}
		

		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBox checkbox=new CheckBox();
		checkbox.initiliseBrowser();
		checkbox.checkbox();
	}

}
