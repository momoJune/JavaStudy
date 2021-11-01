
public class VarEx1 {

	public static void main(String[] args) {
		long hi = 10000000000L;
		int i = 2000000001;
		double f = 3.14f;
		boolean power = true;
		byte b = 127; //-128 ~ 127
		
		int oct = 010; 	//8진수 , 10진수로 8
		int hex = 0x10;	//16진수, 10진수로 16
		System.out.println(hi);
		System.out.println(oct);
		System.out.println(hex); //println 10진수출력가능
		long l = 10000_000_000L; //int최대값 20억이므로 L 붙혀서 long type 리터럴로만듦
	
		float d = 3.14f;
		double s = 3.14f;
		System.out.println(10.);
		System.out.println(.10); //0생략  0.1
		System.out.println(10f); //접미사 생략 10.0
		System.out.println(1e3); //10의 3제곱 1000.0
	}

}
