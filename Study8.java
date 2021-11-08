import java.util.Scanner;

public class Study8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String inpot = sc.nextLine(); //입력받은 문자열 inpot
		
		Double yoyo = Double.parseDouble(inpot); // 문자열 inpot 형변환
		
		
		System.out.printf("%-10.2f", yoyo); // 전체 10자리중 소수점 2개자리수를 왼쪽
//		부터 출력
		
//		double dou = 0.123456789;
//		String str = "boom";
//		
//		System.out.printf("%f, %e , %g\n",dou, dou , dou);
//		System.out.printf("%-20.10f\n", dou);
//		System.out.printf("\"%-10S\"\n" ,str);
	}
}
