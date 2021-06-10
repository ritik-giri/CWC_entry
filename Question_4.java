import java.util.Scanner;
public class Question_4 {
	static boolean isAutomorphic(int N)
    {        
        int sq = N * N;
        while (N > 0) {           
            if (N % 10 != sq % 10)
                return false;            
            N /= 10;
            sq /= 10;
        }  
        return true;
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no. to check if it is Automorphic or not: ");
		int n=sc.nextInt();
		boolean b=isAutomorphic(n);
		if(b==false)
			System.out.println("Not an Automorphic Number");
		else
			System.out.println("Automorphic Number");
	}
}