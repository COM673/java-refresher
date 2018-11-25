/*Question 1 Create a program that takes 3 int numbers
 from the user (s,e,and i).  Then create a loop that 
 starts at s and counts to e in increments of i. Your 
 program should print the numbers
 
Input s=2, e=11, I = 3
Output = 2, 5 ,8, 11
*/

import java.util.*;

class Question1{
	public static void main (String[] args){
		Scanner kb = new Scanner(System.in);
		int s =0;
		int e =0;
		int i =0;
				
		System.out.println("Enter start point");
		s = kb.nextInt();	
		System.out.println("Enter end point");
		e = kb.nextInt();	
		System.out.println("Enter increment");
		i = kb.nextInt();
		
		while (s<=e){
			System.out.print(s + ", ");
			s = s + i;
		}
		 
		
	}

}