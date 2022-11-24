import java.util.Scanner;
public class decimalTObinary {

	public static void main(String[] args) {
		
		
			
		        Scanner s= new Scanner(System.in);
		        int n =s.nextInt();
		        int ans=0,remainder;
		        int i=1;
		        
		        while(n!=0){
		            
		            remainder =n%2;
		            n=n/2;
		            ans=ans+remainder*i;
		            i=i*10;
		            
		            
		        }
		    
		        System.out.print(ans);
		    }
		
		        
}

