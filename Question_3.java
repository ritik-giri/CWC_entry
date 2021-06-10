import java.util.Scanner;
public class Question_3 {
	static int n;
	public static int series(int n) {
		switch(n) {
		case 1:			
			return 0;
		case 2:			
			return 1;
		case 3:			
			return 1;
		default:			
			return series(n-1)+series(n-2)+series(n-3);		
		}		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of terms you want to print: ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++ )
		System.out.print(series(i)+" ");		
	}
}