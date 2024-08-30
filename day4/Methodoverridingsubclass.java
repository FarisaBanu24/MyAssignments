package week2.day4;

public class Methodoverridingsubclass extends MethodOverriddingSuperclass {

	public void takesnap() {
	System.out.println("snap: subclass");
	}
	
	public static void main(String[] args) {
		
		Methodoverridingsubclass MOR = new Methodoverridingsubclass();
		MOR.takesnap();
		MOR.ReportSnap();
	}
}
