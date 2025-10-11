package week2.day2.HomeAssignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookAccountCReation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Driver initialization
		ChromeDriver driver=new ChromeDriver();
		
		//Open Facebook & maximize the window
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Click CREATE NEW ACCOUNT button
		driver.findElement(By.linkText("Create new account")).click();
		
		//FIRST NAME & LAST NAME text box filled
		driver.findElement(By.name("firstname")).sendKeys("Krithikesh");		
		driver.findElement(By.name("lastname")).sendKeys("Krithikesh");
		
		//DOB drop down filled
		WebElement birthDay= driver.findElement(By.name("birthday_day"));
		Select DayOption=new Select(birthDay);
		DayOption.selectByValue("14");
		
		WebElement birthMonth= driver.findElement(By.id("month"));
		Select BirthOption=new Select(birthMonth);
		BirthOption.selectByIndex(4);
		
		WebElement birthYear= driver.findElement(By.id("year"));
		Select BirthYear =new Select(birthYear);
		BirthYear.selectByVisibleText("1991");
		
		//GENDER radio button selected using XPATH
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		//EMAIL & PASSWORD filled
		driver.findElement(By.name("reg_email__")).sendKeys("1234567891");
		driver.findElement(By.id("password_step_input")).sendKeys("abcabc");
			
		//IMPLICIT WAIT used
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		System.out.println(driver.getTitle());
		driver.close();
	}

}
