package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class learnDD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Initialize the chromedriver
		ChromeDriver driver=new ChromeDriver();
		//To maximize the window
		driver.manage().window().maximize();
		//To load the URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//Login-Testleafsite credentials
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(6000);
		
		//Lead section
		
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			Thread.sleep(2000);
			
		
		//Create Lead section
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Farisa");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("H");
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTabs");
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SeleniumF");
			
			
			
			// Select Dropdown
			
			WebElement dd = driver.findElement(By.id("createLeadForm_dataSourceId"));
			
			Select Src = new Select(dd);
			Src.selectByIndex(5);
			
			WebElement dd1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			 Select MC= new Select(dd1);
			 MC.selectByVisibleText("Automobile");
			 
			WebElement dd2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select Cy= new Select(dd2);				 
			Cy.selectByValue("KPW");
					
			driver.findElement(By.className("smallSubmit")).click();
			Thread.sleep(3000);
			
		//Title displayed
			String title = driver.getTitle();
			if(title.contains("View Lead"))
			{
				System.out.println("Lead created successfully");
			}
			else
			{
				System.out.println("Lead is not created ");
			}
				
		
          driver.close();
	}

}
