package sequencee;

public class ExtractChaine {
	public static void main(String[] args) {
		String str = "Welcome to (waytolearn)";
		String res1 = str.substring(0,str.indexOf("("));
		String res = res1+" "+ str.substring(str.indexOf("(")+1,str.indexOf(")"));
		System.out.println(res);
	}

}
