import java.util.Scanner;

public class Study10 {

	public static void main(String[] args) {
		
	
		int i = 9999_9987;
		float f = (float)i;
		int i3 = (int)f;
		
		double d = (double)i;
		int i2 = (int)d;
		
		System.out.printf("int >> float = %f\n", f); //float 정밀도 7자리 8자리오류남
		System.out.printf("float >> int = %d\n", i3);
		System.out.printf("int >> double = %f\n", d);
		System.out.printf("double >> int = %d", i2);
	
	}
}
