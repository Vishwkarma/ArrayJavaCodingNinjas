
public class returnSum {
	
	

	public static void main(String[] args) {
		
		//we declear the integer array
		
      int [] arr= new int[8];//intialiasing the zero in memory 
      
      arr[0]=1;
      arr[1]=2;
      arr[2]=3;
      arr[3]=1;
      arr[4]=2;
      arr[5]=3;
      arr[6]=1;
      arr[7]=2;
     // memory store the value
      
      //sum of these number
      int sum=0;
      
      int lengthOfarray=arr.length;
      
      for(int i=0;i<arr.length;i++) {
    	 
    	  sum=sum+arr[i];
    	
      }
      System.out.println(sum);
	  
	}

}
