package week2.day1;

 import org.openqa.selenium.chrome.ChromeDriver;


public class Launchbrowser {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		try {
			Thread.sleep(10000);
		}catch (InterruptedException e) {
		e.printStackTrace();
		
		driver.close();
		

	}

}
}

