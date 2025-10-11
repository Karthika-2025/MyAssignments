package week2.day2.HomeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class createLead 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		WebElement name=driver.findElement(By.id("username"));
		name.sendKeys("DemoCSR");
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthika");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mahesh");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(3000);
	
		driver.close();
	}

}
