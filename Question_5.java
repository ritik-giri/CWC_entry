import java.util.Scanner;
public class Question_5 {	
		static int InversionCount(int arr[])
	    {
	        int count = 0;
	        for (int i = 0; i <arr.length-1; i++)
	            for (int j = i + 1; j <arr.length; j++)
	                if (arr[i] > arr[j])
	                    count++;	  
	        return count;
	    } 	    
	    public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter array size: ");
	        int n=sc.nextInt();
	        System.out.println("Enter array elements:");
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++)
	        	arr[i]=sc.nextInt();
	    	System.out.println("Number of inversions are "+InversionCount(arr));
	    }	
}