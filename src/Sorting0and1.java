import java.util.Scanner ;
public class Sorting0and1 {

	
	public static void Sorting0sand1s(int [] arr) {
		
		
		if(arr.length<=1) {
			return ;
		}
		
		
		 int left=0;
		 
		int  right=arr.length-1;
		 
		 while(left< right )
		 {
			 while(arr[left]%2 ==0 && left < right) {
				 left++;
				 
			 }
			  while(arr[right]%2==1 && left <right) {
				  
				  right--;
				  
			  }
			  
			  if(left<right) {
				  int temp=arr[left];
				  arr[left]=arr[right];
				  arr[right]=temp;
				  
				  left++;
				  right--;
			  }
		 }
		
		
		
		
	}
	public static void main(String[] args) {
		int [] arr= {1,0,0,1,1,1,0};
		
		

	}

}
