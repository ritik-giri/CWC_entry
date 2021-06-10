import java.util.Scanner;
public class Question_6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.print("The greatest of 3 numbers is ");
		if(a>b)
		  {
		     if(c>a)
		    	System.out.println(c);
		     else
		    	System.out.println(a);
		   }
		 else
		  {
		     if(c>b)
		       System.out.println(c);
		     else
		       System.out.println(b);
		   }
		}
	}