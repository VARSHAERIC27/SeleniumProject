package revision;

public class Navigation extends Base{
	public void navigation() {
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Navigation navigation=new Navigation();
		navigation.initilizeBrowser();
		navigation.navigation();
		//navigation.driverQuitAndclose();

	}

}
