class FizzBuzz{

 public static void main(String[] args) {
      
	  for (int x = 1; x<101;x++){
		  System.out.print(x + " ");
		  
		  if (x%3==0){
			  System.out.print("Fizz");
		  }
		  if(x%5==0){
			  System.out.print("Buzz");
		  }
		  
		 /*  if (x%3==0 && x%5==0 ){
			  System.out.print("FizzBuzz");
		  }
		  else if(x%5==0){
			  System.out.print("Buzz");
		  }
		  else   if (x%3==0){
			  System.out.print("Fizz");
		  } */
		  System.out.println();
		  
		  
	  }
   
    }
}