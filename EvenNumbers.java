import java.util.Iterator;
import java.util.TreeSet;

public class EvenNumbers {
	public static void main(String args[]) {

		TreeSet<Integer> evennumbers = new TreeSet<Integer>();
		evennumbers.add(4);
		evennumbers.add(5);
		evennumbers.add(6);
		evennumbers.add(7);

		System.out.println(evennumbers);

		TreeSet<Integer> evennumbers1 = new TreeSet<Integer>();
		evennumbers1.add(1);
		evennumbers1.addAll(evennumbers);
		System.out.println(evennumbers1);

		Iterator<Integer> iterator = evennumbers1.iterator();
		System.out.print("TreeSet using Iterator: ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
			System.out.print(", ");
		}

	}
}
