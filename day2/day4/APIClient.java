package week2.day4;

public class APIClient {

	
	public void SendRequest(String endpoint){
		System.out.println("Sendrequest endpoint:  " +endpoint);

	}
	
	public void SendRequest(String endpoint, String reqbody, boolean reqstatus) {
		System.out.println("Endpoint: " +endpoint +"\n"+"Request: " +reqbody +"\n" +"Status: " +reqstatus);
}
	
		public static void main(String[] args) {
			
			APIClient Request = new APIClient();
			Request.SendRequest("Learn");
			Request.SendRequest("Method", "Overloading", true);
		}
}


