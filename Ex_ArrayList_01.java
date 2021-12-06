import java.awt.Container;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Ex_ArrayList_01 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList<>(10);
		
		list1.add(5);
		list1.add(4);
		list1.add(3);
		list1.add(2);
		list1.add(1);
		
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		System.out.println();
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		list2.add("B");
		list2.add("V");
		list2.add(4,"A");
		print(list1, list2);
		
		list2.set(3, "AD");
		print(list1, list2);
		
		list1.add(2,"1");
		print(list1, list2);
		System.out.println("index :"+ list1.indexOf(new String ("1")));
		list1.remove(new Integer("1"));
		print(list1, list2);
		
		print(list1, list2);
 		
		for(int i = list2.size()-1;i>=0;i--) {
			if(list1.contains(list2.get(i)));
				list2.remove(i);
		}
		print(list1, list2);
				
				System.out.println("----");
				
		
		System.out.println(list1.containsAll(list2));
		
		
		
	}
	
	static void print(ArrayList list1,ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
	}
}