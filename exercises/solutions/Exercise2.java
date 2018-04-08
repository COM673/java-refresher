import java.util.Scanner;

/*
@author Stephen Howell (@stephen-howell)
Complete the exercise below: Stars
a) As the user to enter a number
b) Print that number of stars in a row
c) on the next line, print the stars -1 and continue to print a line subtracting 1 each time
d) When there are no more stars, print the pattern in reverse, increasing by 1 each time
Example:
Enter the number of stars: 5
*****
****
***
**
*
**
***
****
*****
Note only a single star in the centre...
*/
package exercises.solutions;

class Exercise2
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of stars: ");
        int numStars = input.nextInt();
        for(int i = numStars; i >= 1; i--)
        {
            for(int j = 0; j < i; j++)
                System.out.print('*');
            System.out.println();
        }
        for(int i = 2; i <= numStars; i++)
        {
            for(int j = 0; j < i; j++)   
                System.out.print('*');     
            System.out.println();
        }
        input.close();
    }
}