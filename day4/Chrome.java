package week2.day4;

public class Chrome extends Browser {

	public void Openincognito() {
		
		System.out.println("Chrome: open Igcognito");
	}
	
	public void ClearCache() {
		
		System.out.println("Chome: Clear Cache");
		
	}
	
	public static void main(String[] args) {
		
		Chrome Ch = new Chrome();
		Ch.Openincognito();
		Ch.ClearCache();
		Ch.OpenUrl();
		Ch.CloseBrowser();
		Ch.NavigateBack();
		
	}
}
