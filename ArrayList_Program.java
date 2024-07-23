package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Program {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Rajan");
		al.add("Sethi");
		al.add("RAHUL");
		al.add("RIA");
		al.add("Asmitha");
		System.out.println(al);
		Iterator i1 = al.iterator();
		while (i1.hasNext())// true if the iteration has more elements
		{
			System.out.println(i1.next());// true if the iteration has more elements
		}
		System.out.println("lets iterate in farward direction");
		ListIterator i2 = al.listIterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
		System.out.println("lets iterate in backward direction");
		while (i2.hasPrevious()) {
			System.out.println(i2.previous());
		}

	}
}
