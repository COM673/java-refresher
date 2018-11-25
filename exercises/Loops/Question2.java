/*Question 2 Create a program that takes 1 number
 from the user and checks if it is prime.  
 (You will need to use % to check for even division)*/

import java.util.*;

class Question2{
	public static void main (String[] args){
		Scanner kb = new Scanner(System.in);
		int input =0;
				
		System.out.println("Enter your number");
		input = kb.nextInt();
		int i =0;
		for (i = 2;i<input; i++){
			if (input%i==0){
				break;
			}
		}
		 
		 if (i == input){
			System.out.println("Prime"); 
		 }
		 else{
			 System.out.println("Not prime");
		 }
		
	}

}