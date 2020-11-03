
import java.util.ArrayList;

public class MethodTest {
	public static void main(String[] args) {
		ArrayList<Double> listd = new ArrayList<>();
		listd.add(2.2);
		listd.add(5.2);
		listd.add(2.8);
		listd.add(6.2);
		listd.add(2.9);
		listd.add(3.9);
		listd.add(4.9);
		listd.add(5.9);
		ArrayList<String> lists = new ArrayList<>();
		lists.add("mango");
		lists.add("apple");
		lists.add("orange");
		lists.add("kiwi");
		lists.add("parsemon");
		ArrayList<Integer> listI = new ArrayList<>();
		listI.add(1);
		listI.add(2);
		listI.add(3);
		listI.add(4);
		listI.add(5);
		listI.add(6);
		System.out.println("for string list: ");
		count(lists);
		System.out.println("for integer list: ");
		count(listI);
		System.out.println("for double list: ");
		count(listd);
		
	}
	
	public static <T> void count(ArrayList<T> list) {
		int count = 0;
		for(int i = 0; i < list.size(); i++) {
			count = count + 1;
		}
		System.out.println("the numbers of element in the list is " + count);
		
	}
}
