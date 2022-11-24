import java.util.Scanner;

public class Arrayagain {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int size=scan.nextInt();//take the input 
		int Arr[]=new int[size];
		
		for(int i=0; i<size ;i++) {
			Arr[i]=scan.nextInt();//all the print the of input taking by the user
			
		}
	for(int i=0;i<size;i++) {
		System.out.print(Arr[i]+" ");
	}
   System.out.println();
	}

}
