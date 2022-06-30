package interviewquestions.com;

public class ReverseString {

	public static void main(String[] args) {

		String str = "JawaharRajeev", nstr ="";
		char ch;

		System.out.println("Original Word:"+"\n"+str);

		for (int i = 0; i < str.length(); i++) {
			ch =str.charAt(i);
			nstr=ch+nstr;

		}
		System.out.println("Reversed Word:"+"\n"+nstr);
	}

}
