

import java.util.Scanner;

public class findLargestelementsbyarray {

	
       public static int LargestValue(int input[]) {
    	   
    	   
    	   int max = Integer.MIN_VALUE;
    	   
    	   for(int i=0;i<input.length ; i++) {
    		   
    		   
    		   if(max<input[i]) {
    			   max= input[i];
    		   }
    		   
    	   }
    	   return max;
    	   
       }
       
       public static int[] TakeInput() {
    	   
    	   Scanner scan= new Scanner(System.in);
    	   int size=scan.nextInt();
    	   int input[] = new int[size];
    	   
    	   for(int i=0; i < size ; i++) {
    		   
    		   input[i]=scan.nextInt();
    		   
    		   
    	   }
    	   
    	   return input;
       }
    	   
       

public static void print(int input[]) {
	int size= input.length;

	   for(int i=0; i <  size; i++) {
		   
		   System.out.print(input[i] +" ");
		   
		   
	   }
	System.out.println();
	
}

public static void main(String [] args) {
	
	int arr[]= TakeInput();
	print(arr);
	int largest=LargestValue(arr);
	System.out.print("Largest "+ largest);
	
}
	
}