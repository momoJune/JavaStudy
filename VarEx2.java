// 문자 리터럴과 문자열 리터럴

public class VarEx2 {

	public static void main(String[] args) {
		
		char ch = 'A';
		int i = 'A';
			System.out.println(i);
			System.out.println(ch);
		
		String str = ""; // 빈 문자열 (empty string)
		String str2 = "sdasd";
		String str3 = "123";
		String str4 = str2 + str3; //문자열 + 문자열
		String str5 = "" + 7+7; // "" +"7" + "7"
		String str6 = 7+7 + "";	// 7+7 "14"+""	
		
			System.out.println(str4);
			System.out.println(str);
			
			System.out.println(str5);
			System.out.println(str6);
	}

}
