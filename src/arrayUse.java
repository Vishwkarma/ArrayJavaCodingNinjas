import java .util.Scanner;
public class arrayUse {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();
		int input[]=new int [size];//initially all index values are 0s
		for(int i=0;i<size;i++) {
			
			input[i]=s.nextInt();//here we iterate all the value take input from it
		
		}
		
		for(int i=0;i<size;i++) {
			
		
		System.out.print(input[i]+" ");//for get output then also we iterate all the value that a reason we using loop
		
		}
		
		
		
		

	}

}
