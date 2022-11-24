import java.util.Scanner; 
public class sumOfElement {

	public static void main(String[] args) { 
		
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();
		int Input[]= new int[size];
		for(int i=0;i<size;i++) {
			
			Input[i]=s.nextInt();
		}
		
		
		int sum=0;
		for(int i=0;i<size;i++) {
			sum =sum+Input[i];
			
		}
       System.out.print(sum);
		
		
     
		

	}

}
