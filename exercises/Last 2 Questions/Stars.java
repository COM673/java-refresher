import java.util.*;

class Stars
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number of stars: ");
        int numStars = kb.nextInt();
		
		for (int j = numStars;j>0;j--){
			for(int i = 0;i<j;i++){
				System.out.print("*");
			}
			System.out.println();
		}
		for (int j = 2; j<=numStars; j++){
			for(int i = 0;i<j;i++){
				System.out.print("*");
			}
			System.out.println();
		}
   
    }
}