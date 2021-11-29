package javajungseok1;

public class Ex_2 {
	public static void main(String[] args) {
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
				
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		System.out.println();
		c1.width = 50;
		c1.height = 7;
		System.out.println(c1.width+" "+ c1.height);
		
		
		Card.width = 80;
		Card.height= 90;
		c2.width = 10;
		c2.height = 17;
		
		System.out.println(c1.width+" "+ c1.height);
		System.out.println(c2.width+" "+c2.height);
	}
}
class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
	
}