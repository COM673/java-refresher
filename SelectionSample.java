/**  COM673 java-refresher Selection sample
* @author  Stephen Howell (@stephen-howell)
*/

class SelectionSample
{
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        // == simple variable comparison
        // && Boolean AND
        if(a == true && b == true) {
            System.out.println("a is true, b is true");
        }
        else if(a == false && b == false) {
            System.out.println("a is false, b is false");
        }
        else if(a == true && b == false) {
            System.out.println("a is true, b is false");
        }
        else if(a == false && b == true) {
            System.out.println("a is false, b is true");
        }
        String first = "Cat";
        String second = "Dog";
        // .equals() compares the contents of the objects
        if(first.equals(second) == true) {
            System.out.println(first + " is the same as " + second);
        }
        else {
            System.out.println(first + " is not the same as " + second);
        }

    }
}