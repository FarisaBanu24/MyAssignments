package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
		String  Name="Farisa Banu";
 char[] Ch = Name.toCharArray();
		for (int i = Ch.length-1; i>=0; i--) {
			System.out.print(Ch[i]);
		}
	}

}
