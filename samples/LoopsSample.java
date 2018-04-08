/**  COM673 java-refresher Loops sample code.
* @author  Stephen Howell (@stephen-howell)
*/

class LoopsSample
{
    public static void main(String[] args) {
        int stopVal = 100;
        
        int val = 200;
        do {
            System.out.println(val);
            val += val;
        } while(val < stopVal);
        
        val = 2;
        while(val < stopVal) {
            System.out.println(val);
            val *= val; // What does this operator do?
        }

        for(int i = 0; i <= 30; i+=3) 
            System.out.print(i + ", ");
        
        System.out.println();
        String[] animals = { "cat", "dog", "mouse" };
        for(var animal : animals)
            System.out.println(animal);
    }
}