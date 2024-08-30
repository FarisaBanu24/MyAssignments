package week2.day4;

public class TestDataSuperclass {

	public void EnterCredentials() {
		System.out.println("Ënter the crendials:");
	}
	
	public void navigateToHOmepage() {
		System.out.println("Navigate to home page: ");
	}
	
	public static void main(String[] args) {
		TestDataSuperclass Testdata = new TestDataSuperclass();
		Testdata.EnterCredentials();
		Testdata.navigateToHOmepage();
	}
}

