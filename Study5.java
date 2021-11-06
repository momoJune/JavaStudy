
public class Study5 {

	public static void main(String[] args) {
		
		String str = "5";
			System.out.println(str.charAt(0) - '0'); //문자열 >> 문자 -'0' = 숫자 5
			System.out.println(Integer.parseInt("5")+5); //문자열 >> 숫자 +5  = 숫자 10
			System.out.println(Integer.parseInt(str)+5);
			System.out.println(str + 1);		//문자열 + 1 =51
			System.out.println(str.charAt(0) -'0' +2); // 문자열 >> 문자 -'0' = 숫자 7
			System.out.println(3+'0');	//숫자 + '0' = 문자  그러나 문자로 숫자를 더할수 없으니 문자를 숫자로 바꿔 더한것.
			
			//System.out.println((char)(3 +'0'));
			
	}
}
