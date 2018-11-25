/*Question 1 Make a program to has three 
integers (d, h, and m), and display the 
number of seconds in d days, h hours, 
and m minutes (assume d, h, and m have 
values of 1 , 17 , 34 respectively).*/

import java.util.*;

class Question1{
	public static void main (String[] args){
		Scanner kb = new Scanner(System.in);
		int d =0;
		int h = 0;
		int m = 0;
		
		System.out.println("Enter number of days");
		d = kb.nextInt();
		System.out.println("Enter number of hours");
		h = kb.nextInt();
		System.out.println("Enter number of minutes");
		m = kb.nextInt();
		
		int secInDay = 24*60*60;
		int secInHour = 60*60;
		
		int answer = (d*secInDay)+(h*secInHour)+(m*60);
		System.out.println(answer);
	}

}