import java.util.Scanner;
public class Question_2 {
	public static void display(int x[][])
	{
	    System.out.println("The sorted 2D matrix as per your choice is"); 
		for(int i = 0 ; i<x.length ; i++)
	    	 {
	    	  for(int j = 0 ; j<x[i].length ; j++)
	               System.out.print(x[i][j]+" ");
              System.out.println();
	    	 }
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows and columns respectively ");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int size=row*col;
		int arr[][]=new int[row][col];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				arr[i][j]=sc.nextInt();
		int sort[]=new int[size];
		int k=0;
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++,k++)
				sort[k]=arr[i][j];
		System.out.println("Enter 0 for ascending order \nEnter 1 for descending order");
		int order=sc.nextInt();
		switch(order)
		{
		case 0 :  for(int i = 0 ; i <size ; i++)
			        for(int j = 0 ; j<size-i-1 ; j++)
            	      if(sort[j]>sort[j+1])
            	        {
            	   	      int temp = sort[j];
            		      sort[j] = sort[j+1];
            		      sort[j+1] = temp;
            	        }

                  k = 0;
                  for(int i = 0 ; i<row ; i++)
                    for(int j = 0 ; j<col ; j++,k++)
                      arr[i][j] = sort[k];
      
           display(arr);
           break;
		case 1:	for(int i = 0 ; i <size ; i++)
                  for(int j = 0 ; j<size-i-1 ; j++)
   	                if(sort[j]<sort[j+1])
   	                 {
   		                int temp = sort[j];
   		                sort[j] = sort[j+1];
   		                sort[j+1] = temp;
   	                 } 
		
             k = 0; 
             for(int i = 0 ; i<row ; i++)
               for(int j = 0 ; j<col ; j++,k++)
                 arr[i][j] = sort[k];
             
              display(arr);
	          break;		
		default:
			System.out.println("Enter a valid choice");				
		}
	}
}
