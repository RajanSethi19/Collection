package Collection;

import java.util.ArrayList;

public class ArrayListTwo {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add("Rajan");
		al.add("Sethi");
		al.add("RAHUL");
		al.add("RIA");
		al.add('a');
		al.add(null);
		ArrayList a2= new ArrayList();
		
		a2.addAll(al);
		a2.add("Surya");
		
		a2.removeAll(al);
		System.out.println(a2);
		System.out.println(al.size());
		
		

	}

}
