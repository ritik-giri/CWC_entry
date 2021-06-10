
public class Question_7 {
	static int term(int n,int i) {
		if(n==78)
			return i;		
		else
			return term(n+5,i+1);
	}
	public static void main(String[] args) {		
		System.out.println("78 is output for i="+term(3,1));
	}
}