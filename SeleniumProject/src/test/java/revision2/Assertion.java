package revision2;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Assertion extends Base{
	@Test
	public void AssertEquals() {
		driver.navigate().to("https://www.browserstack.com/");
		String actualString=driver.getTitle();
		System.out.println(actualString);
		String expectedString="Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertEquals(actualString, expectedString);
	}
	@Test
	public void AssertNotEquals() {
		driver.navigate().to("https://www.browserstack.com/");
		String actual=driver.getTitle();
		System.out.println(actual);
		String expected=" Reliable App & Cross Browser Testing Platform | BrowserStack";
Assert.assertNotEquals(actual, expected);
		
		}
	@Test
	public void assertTrue() {
		driver.navigate().to("https://www.browserstack.com/");
boolean verifytitle=driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		Assert.assertTrue(verifytitle);
		
	}
	@Test
	public void assertFalse() {
		driver.navigate().to("https://www.browserstack.com/");
		boolean verifytitle=driver.getTitle().equalsIgnoreCase(" Reliable  & Cross Browser Testing Platform | BrowserStack");
		Assert.assertFalse(verifytitle);
		

		
	}
	@Test
	public void assertNull() {
		driver.navigate().to("https://www.browserstack.com/");
         String verifyassert=null;
         Assert.assertNull(verifyassert);
 		
	}
	@Test
    public void assertnotnull() {
		driver.navigate().to("https://www.browserstack.com/");
		boolean verifyassert=driver.getTitle().equalsIgnoreCase(" Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		Assert.assertNotNull(verifyassert);



		
	}
	



}


