package Collection;

import java.util.ArrayList;

public class ArrayList_One {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add("Rajan");
		al.add("Sethi");
		al.add("RAHUL");
		al.add("RIA");
		al.add('a');
		al.add(null);
		al.add(10);
		System.out.println(al);
		ArrayList a2= new ArrayList();
		a2.addAll(al);
		System.out.println("Before adding "+a2);
		a2.add("Ram");
		
		System.out.println("After adding"+a2);
		System.out.println(a2.contains("Ram"));
		a2.clear();
		System.out.println(a2);
		System.out.println(a2.isEmpty());
		System.out.println(al.isEmpty());
		
		System.out.println(al.remove("RAHUL"));
		System.out.println(al);
		System.out.println(al.removeAll(al));
		
		
		
		
		
		
	}

}
