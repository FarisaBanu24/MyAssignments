package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("farisa_banu@yahoo.co.in");
		driver.findElement(By.id("pass")).sendKeys("Secret2000");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		if(title.contains("(20+) Facebook")) {
			
			System.out.println("Login is successful");
			
		
		}else {
			System.out.println("Login is not successful");
		}
		driver.close();
		
	

}
}