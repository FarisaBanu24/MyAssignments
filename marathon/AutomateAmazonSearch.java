package week.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateAmazonSearch {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
		
		//Test Steps:
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Bags for boys", Keys.ENTER);
		
		Thread.sleep(5000);
		
		//Printing results for bags for boys
		
		String R1 = driver.findElement(By.xpath("//div[@class = 'a-section a-spacing-small a-spacing-top-small']//span[1]")).getText();
		String R2 = driver.findElement(By.xpath("//div[@class = 'a-section a-spacing-small a-spacing-top-small']//span[3]")).getText();
		
		System.out.println("Results: " +R1 +R2);
		
		//To select the checkbox
		
		WebElement chk1 = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]"));
		chk1.click();
		Thread.sleep(3000);
		WebElement chk2 = driver.findElement(By.xpath("//div[contains(@class, 'a-checkbox a-checkbox-fancy')]/following-sibling::span[text() = 'American Tourister']"));
		chk2.click();
		Thread.sleep(3000);
		
		//To sort New arrivals
		
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.id("s-result-sort-select_4")).click();
		
		//WebElement Sort = driver.findElement(By.xpath("//span[text()='Sort by:']"));
		//Select NewArrivals = new Select(Sort);
		//Thread.sleep(3000);
		//NewArrivals.selectByIndex(3);
		//Thread.sleep(3000);
		
		//TO print Name and prize
		String Name = driver.findElement(By.xpath("(//div[@data-cy=\"title-recipe\"]//h2)[1]")).getText();
		String Name1 = driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-color-base')])[2]")).getText();
		System.out.println("Name: " +Name +Name1);
		
		String  PS = driver.findElement(By.xpath("//span[@class='a-price-symbol']")).getText();
		String PV = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		
		System.out.println("Prize: " +PS  +PV);
		
		//To get Title
		
		String title  = driver.getTitle();
		System.out.println("Title of the page : " +title);
		
		Thread.sleep(3000);
		
		//driver.close();
		
		
		

		
		
		
	}

}
