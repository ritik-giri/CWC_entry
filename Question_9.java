import java.util.Scanner;
public class Question_9 {
	static String revString(String str) {
		if(str.isEmpty());
		else 
		{
			System.out.print(revString(str.substring(1))+str.charAt(0));
		}
		return "";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=sc.next();
		revString(str);
	}
}