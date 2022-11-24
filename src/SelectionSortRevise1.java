
public class SelectionSortRevise1 {
	
	public static void selectionSort(int []input) {
		
		for(int i=0;i<input.length-1;i++)//0 t0 length-2
		{
//			suppose array is 2 6 9 1 5
			int min=input[i];//Here minimum is 2 
			int minIndex =i;//minimum index is 0 
			for(int j=i+1;j<input.length;j++) {
				if(input[j] < min) {
					//compare 2 to 6  and 9 and 1 find it minimum element in the array 
					
					min=input[j];//now update the minimum
					minIndex=j;		//also increase its index
					
				}
				
			}
			if(minIndex !=i) {
			input[minIndex]=input[i];
			input[i]=min;
			
			
			 
		}
		}
	}

	public static void main(String[] args) {
		int input[]= {2,6,9,1,5};
		selectionSort(input);
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]+" ");
		}
		
		
		
	}

}
