
public class ExponentTest {
	public static void main(String [] args) {
		System.out.println(fastExp(2,30));
	}
	
	
	static int fastExp(int a, int n) 
	{
		if (n == 0) {
			return 1;
		} 
		else if ((n & 1) == 0) {
			int y = fastExp(a, n / 2);
			return y*y;
		} 
		else {
			return a * fastExp(a, n - 1);
		}
	}
}
