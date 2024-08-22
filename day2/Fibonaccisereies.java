package week1.day2;

public class Fibonaccisereies {

	public static void main(String[] args) {
		int f1=0, f2=2,f3,i,value=10;
		System.out.println(f1);
		System.out.println(f2);
		for (i=2; i<value; ++i); 
		{
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}
		

	}

}
