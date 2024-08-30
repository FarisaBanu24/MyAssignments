package week2.day4;

public class LoginTestdatasubclass extends TestDataSuperclass {
	

	
	public void enterUsername() {
		String username = "Farisa";
	
		System.out.println("UserName: " +username);
	}

		public void Password() {
			
			String password = "Farisa123";
			System.out.println("Password: " +password);
			
		}
		
		public static void main(String[] args) {
			LoginTestdatasubclass Login = new LoginTestdatasubclass();
			
			Login.EnterCredentials();
			Login.enterUsername();
			Login.Password();
			Login.navigateToHOmepage();
			
			
					
			
		}
	}


