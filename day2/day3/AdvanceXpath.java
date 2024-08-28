package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {

	public static void main(String[] args)  throws InterruptedException  {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//To maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//To load the URL
		driver.get("https://login.salesforce.com");
		
		driver.findElement(By.xpath("//div[@id='username_container']//input[1]")).sendKeys("dilip@testleaf.com");
		//div[@id='username_container']//input[1]
		driver.findElement(By.xpath("//form[@id='login_form']/input[@id='password']")).sendKeys("[testleaf@2024]");
		driver.findElement(By.xpath("//form[@id = 'login_form']/input[@name = 'Login']")).click();
		

		String title = driver.getTitle();
		if(title.contains("Home|SalesForce"))
		{
			System.out.println("login successfully");
		} else
		{
			System.out.println("login not successful ");
		}
		
		Thread.sleep(3000);
	      driver.close();
	}
}



