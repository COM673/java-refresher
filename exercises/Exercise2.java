import java.util.Scanner;

/*
@author <Your name here>
Complete the exercise below: Stars
a) As the user to enter a number (done for you)
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
class Exercise2
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of stars: ");
        int numStars = input.nextInt();
        
        input.close();
    }
}