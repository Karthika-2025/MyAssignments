package week2.day2.HomeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.core.backend.Options;

public class CreateAccount 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		//Username & Password and click Login button
		
		WebElement name=driver.findElement(By.id("username"));
		name.sendKeys("DemoCSR");
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//"CRM/SFA" link & "Accounts" tab
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("KarthikaNewOctober9");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement dropdownIndustry= driver.findElement(By.name("industryEnumId"));
		Select industryoption=new Select(dropdownIndustry);
		industryoption.selectByContainsVisibleText("Computer Software");
		
		WebElement ownerdropdown= driver.findElement(By.name("ownershipEnumId"));
		Select ownerOption=new Select(ownerdropdown);
		ownerOption.selectByContainsVisibleText("S-Corporation"); 
		
		WebElement sourcedropdown=driver.findElement(By.id("dataSourceId"));
		Select sourceOption=new Select(sourcedropdown);
		sourceOption.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingCampaign= driver.findElement(By.id("marketingCampaignId"));
		Select marketingOption = new Select(marketingCampaign);
		marketingOption.selectByIndex(6);
		
		WebElement stateOrProvince= driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateOrProvinceOption = new Select(stateOrProvince);
		stateOrProvinceOption.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		
		driver.close();
		
		
		

		
		
		
		
	}

}
