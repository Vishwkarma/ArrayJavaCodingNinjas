//using function to make our  problem to be an easier way

import java.util.Scanner;

public class arayuse2 {
	
	public static int[] takeinput() {
		
	
	Scanner s= new Scanner(System.in);
	int size=s.nextInt();
	int input[]=new int [size];//initially all index values are 0s
	for(int i=0;i<size;i++) {
		
		input[i]=s.nextInt();//here we iterate all the value take input from it
	
		
	}
	return input;
	
	}
	
	public static void print(int input[]) {
		
	int size=input.length;//give length of array
	
		for(int i=0;i<size;i++) {
			
			
			System.out.print(input[i]+" ");//for get output then also we iterate all the value that a reason we using loop
			
			}
		System.out.println();
	}
	
		
			
	public static void main(String[] args) {
		
		int arr[]=takeinput();//arr lakar dega hume 
		print(arr);
		
		
	}
}
	
