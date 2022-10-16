package sequencee;

public class NombreFactoriel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factoriel(5));

	}
	
	public static int factoriel(int n) {
		if(n==0 || n==1) {
			return 1;
		}else {
			return n*factoriel(n-1);
		}
	}

}
