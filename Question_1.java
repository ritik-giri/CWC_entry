import java.util.*;
public class Question_1 {
	public static int indexof(int[] arr, int x)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == x) 
            {
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter array size: ");
      int n = sc.nextInt();
      int arr1[] = new int[n];
      System.out.print("Enter array elements: ");
      for(int i = 0 ; i <n ; i++)
    	  arr1[i] = sc.nextInt();
      int arr2[] = new int[n];
      for(int i = 0 ; i <n ; i++)
    	  arr2[i] = arr1[i];
      Arrays.sort(arr2);
      int count=0,j,temp;          
      for(int i = 0 ; i < n ; i++)
      {
    	  if(arr1[i] != arr2[i])
    	  {
    		 count++; 
    		 j = indexof(arr1,arr2[i]);
    		 temp = arr1[i];
    		 arr1[i] = arr1[j];
    		 arr1[j] = temp;
    	  }
      }    
      System.out.print("Sorted Array: ");
      for(int array : arr1 )
    	  System.out.print(array+" ");
      System.out.println("\nThe minimum number of swaps required are "+count);      
	}
}