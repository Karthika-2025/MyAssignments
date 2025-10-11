package week2.day2.HomeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookAccountCReation 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Krithikesh");		
		driver.findElement(By.name("lastname")).sendKeys("Krithikesh");
		driver.findElement(By.id("u_0_h_0c")).sendKeys("1234567891");
		driver.findElement(By.id("password_step_input")).sendKeys("abcabc");
		
		WebElement birthDay= driver.findElement(By.name("birthday_day"));
		Select DayOption=new Select(birthDay);
		DayOption.selectByValue("14");
		
		WebElement birthMonth= driver.findElement(By.id("month"));
		Select BirthOption=new Select(birthMonth);
		BirthOption.selectByIndex(4);
		
		WebElement birthYear= driver.findElement(By.id("year"));
		Select BirthYear =new Select(birthYear);
		BirthYear.selectByVisibleText("1991");
		
		
		
		
		

		
		


		)
		
		

	}

}
