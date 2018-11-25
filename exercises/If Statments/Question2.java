/*Question 1 Take three numbers from
 the user and print the greatest number. */

import java.util.*;

class Question2{
	public static void main (String[] args){
		Scanner kb = new Scanner(System.in);
		int num1 =0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.println("Enter 1st number");
		num1 = kb.nextInt();
		System.out.println("Enter 2nd number");
		num2 = kb.nextInt();
		System.out.println("Enter 3rd number");
		num3 = kb.nextInt();
		
		if (num1>num2 && num1>num3){
			System.out.println(num1+ " is the largest number");
		}
		else if (num2>num1 && num2>num3){
			System.out.println(num2+ " is the largest number");
		}
		else if (num3>num1 && num3>num2){
			System.out.println(num3+ " is the largest number");
		}
		else{
			System.out.println("Some or all of the numbers are the same");
		}
		
	}

}