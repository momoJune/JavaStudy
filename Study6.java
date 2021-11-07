
public class Study6 {

	public static void main(String[] args) {
		
		int a = 100_0000;
		int b = 200_0000;
		
		long c = a * b; // int * int = int 이므로
		//-1454759936(int) 로 오버플로우 발생함.  
	
		
		//해결법? long c = (long)-1454759936 : 
		//이미 값이 잘못됨.
		
			System.out.print(c);
			
		
	}
}
