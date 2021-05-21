package wtn;

public class Strings6 {

	public static void main(String[] args) {
		String a = "potru";
		String b = "saikiran";
		String output;

		if (a.length() < b.length()) 
			output = a + b + a;
		else
			output = b + a + b;
		
		System.out.println(output);
	}

}