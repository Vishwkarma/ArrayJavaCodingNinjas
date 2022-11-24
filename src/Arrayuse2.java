import java.util.Scanner;

public class Arrayuse2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size =s.nextInt();//take input here 
		int input[]=new int[size];//by default array elements is 0's
		for(int i=0;i<size;i++) {
			input[i]=s.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		
		
		

	}

}
