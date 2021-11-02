
public class Study3 {

	public static void main(String[] args) {
		
		System.out.printf("%d\n", 15);	// 10진수 출력 15
		System.out.printf("%#o\n", 15);	// 8진수 출력 017
		System.out.printf("%#x\n", 15);	// 16진수 출력 0xf
		System.out.printf("%s\n\n", Integer.toBinaryString( 15));	//2진수 출력 1111
		
		
		double f = 1.456789;			//정밀도 7자리 float 대신 15자리인 double 사용
		System.out.printf("%f\n", f);	
		System.out.printf("%e\n", f);	//지수형태 값 출력
		System.out.printf("%g\n", f);	//소수점 포함 7자리 간략
		
		
		System.out.printf("[%5d]\n", 1234567);	//지정자리수5 보다 출력값이 커도 짤리지 않음
		System.out.printf("[%-5d]\n", 10);		//5칸 공간 왼쪽 정렬
		System.out.printf("[%05d]\n\n", 10);	//5칸 공간 나머지 0으로 채워짐
		
		double d = 1.23456789;
		System.out.printf("[%.7f]\n", d);	//소수점 7자리까지출력
		
		System.out.printf("[%s]\n", "www.naver.com");
		System.out.printf("[%20s]\n", "www.naver.com" );	//20칸 공간 기본오른쪽 정렬
		System.out.printf("[%-20s]\n", "www.naver.com" );	//20칸 공간 왼쪽 정렬
		System.out.printf("[%.5s]\n", "www.naver.com" );	//지시자 앞.숫자 문자열 일부 
	}
}
