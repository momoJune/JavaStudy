//scan

import java.util.*; //* 특정패키지에 있는 모든 클래스를 사용가능 or java.util.scanner;

public class Study4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //scanner객체 생성
		
		float num = scanner.nextFloat(); //scanner 객체 사용
		int num2 = scanner.nextInt();
		System.out.println(num);
		System.out.println(num2);
		
//		String input = scanner.nextLine();
//		int num = Integer.parseInt(input);
//		
//		System.out.println(num);
	}
}
