/**  COM673 java-refresher Input and output sample code.
* @author  Stephen Howell (@stephen-howell)
*/

import java.util.Scanner;

class InputOutputSample
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("What age are you " + name + "?");
        int age = input.nextInt();
        System.out.println("Do you like marmite? (true or false)");
        boolean likesMarmite = input.nextBoolean();
        System.out.printf("%s is %d years old and likes marmite: %b\n", name, age, likesMarmite);       
        input.close(); 
    }
}
