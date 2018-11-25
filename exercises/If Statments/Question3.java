/*Question 3 Write a program to find the number of days in 
a month by entering the month number and year.*/

import java.util.*;

class Question3{
	public static void main (String[] args){
		Scanner kb = new Scanner(System.in);
		int input =0;
		int input2 =0;
				
		System.out.println("Enter month number");
		input = kb.nextInt();
		System.out.println("Enter year number");
		input2 = kb.nextInt();
		
		if (input == 9 || input == 4 || input == 6 || input== 11 ){
			System.out.println("That month has 30 days");
		}
		else if (input == 1 || input == 3 || input == 5 || input ==7 ||
					input == 8 || input == 10 || input == 12){
			System.out.println("That month has 31 days");
		}
		else if (input == 2){
			if ((input2%4==0 || input2%400==0) && input2%100!=0){
				System.out.println("That month has 29 days");
			}
			else{
				System.out.println("That month has 28 days");
			}
		}
		 
		
	}

}