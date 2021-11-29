package javajungseok1;

public class Ex_04 {
	public static void main(String[] args) {
		Mymath mm = new Mymath(); // 객체 생성
		long result1 = mm.add(5,3);
		long result2 = mm.subtract(5, 3);
		double result3 = mm.divide(5, 3);
		long result4 = mm.multiply(5, 3);
		
		mm.printGugudan(2);
		
		long result = mm.max(1L, 4L);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}

class Mymath {
	
	void printGugudan(int dan) {
		if(!(2<=dan && dan<=9))
			return;
		
		for(int i=1;i<=9;i++)
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
	}
	
	long add(long a ,long b) {
		return a + b;
	}
	long max(long a, long b) {return a > b ? a:b;}
	long subtract(long a , long b){return a - b;}
	long multiply(long a , long b){return a * b;}
	double divide(double a, double b) {
		return a/b;
	}
	
}