package week2.day4;

public class StaticPolyM {

	public void ReportStep(String msg, String Status) {
		System.out.println("Message :" +msg +"\n" +"Status: " +Status);

	}
	
	public void ReportStep(String Msg, String Status, boolean snap) {
		System.out.println("Message: " +Msg +"\n"+"Status: " +Status +"\n" +"Snap: " +snap);
}
	
		public static void main(String[] args) {
			
			StaticPolyM RS = new StaticPolyM();
			RS.ReportStep("Learn", "Methodoverloading");
			RS.ReportStep("Static", "Polymorphism", false);
		}
	}