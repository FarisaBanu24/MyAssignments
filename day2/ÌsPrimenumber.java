package week1.day2;

public class ÌsPrimenumber {


		  public static void main(String[] args) {

		    int value = 31;
		    boolean flag = false;

		    // 0 and 1 are not prime numbers
		    if (value == 0 || value == 1) {
		        flag = true;
		    }

		    for (int i = 2; i <= value / 2; ++i) {

		      // condition for nonprime number
		      if (value % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(value + " is a prime number.");
		    else
		      System.out.println(value + " is not a prime number.");
		  }
		}
