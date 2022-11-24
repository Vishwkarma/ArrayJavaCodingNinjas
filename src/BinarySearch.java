
public class BinarySearch {
	
	public static int Binarysearch(int input[],int element) {
		
		int start=0,end=input.length-1;
		while(start<=end) {
			
			
			int mid=(start+end)/2;
			if(element==input[mid]) {
				return mid;
				
			}else if(element>input[mid]) 
			{
				start=mid+1;
			

				
			}
			else {
				end=mid-1;
				
			}
		}
		return -1;
		
	}

		
	public static void main(String[] args) {
		int[] input= {2,4,8,9,15,28};
		int index =Binarysearch(input,28);
		System.out.println(index);
		
		

	}

}
