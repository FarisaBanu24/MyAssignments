package week.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateBookTicket {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.pvrcinemas.com/");
		//TEst steps:
		
		driver.findElement(By.xpath("//span[@class  ='p-dropdown-label p-inputtext p-placeholder']")).click();
		driver.findElement(By.xpath("(//span[text()='Chennai'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();;
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()= 'Select Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
		
		driver.findElement(By.xpath("//span[contains(text() , 'Sun')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='VAAZHAI'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(), '12:20 PM')]")).click();
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("SL.SILVER|F:8")).click();
		driver.findElement(By.id("SL.SILVER|F:9")).click();
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	
		//Printing seat details and total
		
		String seatInfo = driver.findElement(By.xpath("//h6[text()='Seat Info']")).getText();
	
		String d1 = driver.findElement(By.xpath("//p[text()='F9']")).getText();
	
		String d2 = driver.findElement(By.xpath("//p[text()='F8']")).getText();
	
		System.out.println("Seats: " +seatInfo +"\n" +d1 +"\n" +d2);
		
		driver.findElement(By.xpath("//h6[text() = 'Grand Total']")).getText();
		
		//String total = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//span[1]")).getText();
		
		String total  = driver.findElement(By.xpath("(//span[text()='442.92'])[2]")).getText();
		
		System.out.println("total prize: " +total);
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		//To get page title
		
		String title  = driver.getTitle();
		System.out.println("Title of the page :" +title);
		
		driver.close();
		
		
		
		
		
		
	}

}
