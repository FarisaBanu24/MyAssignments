package week1.day3;

import java.util.Arrays;

public class Printduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] value = {2,4,6,9,12,8,4,9,3,12};

Arrays.sort(value);
for (int i = 0; i < value.length-1; i++) {
	
	if(value[i]==value[i+1]) {
	System.out.println("Dupilacte value is : " +value[i]);
	
	

}
		
	}}}
