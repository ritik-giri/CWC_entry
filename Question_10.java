import java.util.Scanner;
public class Question_10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n=sc.nextInt();
		System.out.print("n+nn+nnn= "+(n+(n*n)+(n*n*n)));
	}
}
