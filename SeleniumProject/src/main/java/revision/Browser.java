package revision;

public class Browser  extends Base{
	public void browser() {
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String page=driver.getPageSource();
		System.out.println(page);


		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browser=new Browser();
		browser.initilizeBrowser();
		browser.browser();
	}

}
