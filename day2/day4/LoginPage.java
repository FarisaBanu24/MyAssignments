package week2.day4;

public class LoginPage extends BasePage {
	
	public void PerformcommonTasks() {
		System.out.println("Perform Task: subclass");
	}

	public static void main(String[] args) {
		
		LoginPage LP = new LoginPage();
		LP.findelements();
		LP.clickelements();
		LP.entertext();
		LP.PerformcommonTasks();
	}
}
