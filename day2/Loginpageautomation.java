package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpageautomation 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//Enter email id & password
		WebElement email_id=driver.findElement(By.id("email"));
		email_id.sendKeys("testleaf.2023@gmail.com");
		
		WebElement password_id=	driver.findElement(By.id("pass"));
		password_id.sendKeys("Tuna@321");
		
		WebElement buttonclick= driver.findElement(By.name("login"));
		buttonclick.click();
		
		driver.getTitle();
		System.out.println(driver.getTitle());

	}
		
}
