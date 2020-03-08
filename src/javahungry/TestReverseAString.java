package javahungry;

public class TestReverseAString {

	public static void main(String[] args) {

		String str="Abhi";
		System.out.println(reverse(str));
	}

	private static String reverse(String str) {

		if(str.length()==0)
			return str;
		else
		return	str.charAt(str.length()-1)+reverse(str.substring(0, str.length()-1));
	}

}
