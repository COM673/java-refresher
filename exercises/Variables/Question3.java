/*Question 3 Create a program that takes an integer 
from the user and outputs just the last digit in 
the input value.*/

import java.util.*;

class Question3{
	public static void main (String[] args){
		Scanner kb = new Scanner(System.in);
		int input =0;
				
		System.out.println("Enter number");
		input = kb.nextInt();
		
		int answer = input%10; // this leaves us with the unit value 0 - 9
		System.out.println(answer);
	}

}