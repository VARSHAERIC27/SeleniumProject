package testscript;

public class CssSelector  extends Base{
	public void tagAndId()//tag#id 
	{
		
	}
public void tagAndClass() //tag.class
{
		
	}
public void tagAndAttribute()//tag[attribute=value] 
{
	
}
public void tagClassAndAttribute()//tag.classname[attribute=value]
{
	
}
	

	public static void main(String[] args) {
		CssSelector cssSelector=new CssSelector();
		cssSelector.initiliseBrowser();
		cssSelector.tagAndId();
		cssSelector.tagAndClass();
		cssSelector.tagAndAttribute();
		cssSelector.tagClassAndAttribute();
		cssSelector.driverQuitAndClose();
	}

}
