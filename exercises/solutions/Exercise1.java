/**
 * @author Stephen Howell (@stephen-howell)
 *  Complete the exercise below: FizzBuzz
 * a) Print out the numbers 1 to 100 (inclusive) each on a new line.
 * b) If the number to be printed is divisible evenly by 3, print Fizz instead
 * c) If the number to be printed is divisible evenly by 5, print Buzz instead
 * d) If the number to be printed is divisible evenly by both 3 and 5, print FizzBuzz instead
 */
package exercises.solutions;

class Exercise1
{
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++)
            if(i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if(i % 3 == 0)
                System.out.println("Fizz");
            else if(i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
    }
}