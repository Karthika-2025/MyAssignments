package week2.day1;

public class Browser 
{
	public String launchBrowser(String browserName) 
	{
		return browserName;
	}
	public String loadUrl(String url) 
	{
		return url;	
	}	
	public static void main(String[] args) 
	{
		Browser object1=new Browser();
		object1.launchBrowser("Google");
		object1.loadUrl("Url loaded successfully");

	}

}
