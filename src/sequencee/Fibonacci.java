package sequencee;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		System.out.println("la suite fibonacci de "+n+ " est :"+fibo(n));

	}
	
	public static int fibo(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		else {
			return fibo(n-1)+fibo(n-2);
		}
		
	}

}
