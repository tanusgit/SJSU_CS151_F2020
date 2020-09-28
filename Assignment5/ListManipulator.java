package a5;

import java.util.ArrayList;

public class ListManipulator {
	// Accepts an array list of integers and sorts it in ascending or descending
	// order.
	// Make sure to account for cases with duplicate values. The method returns the
	// sorted list.
	ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending) {
		// using bubble sort to sort the elements
		if (ascending == true) {
			for (int i = 0; i < myLst.size() - 2; i++) {
				for (int j = i + 1; j < myLst.size() - 1; j++) {
					if (myLst.get(i) > myLst.get(j)) {
						int temp = myLst.get(i);
						myLst.set(i, myLst.get(j));
						myLst.set(j, temp);
					}
				}
			}
		} else if (ascending == false) {
			for (int i = 0; i < myLst.size() - 2; i++) {
				for (int j = i + 1; j < myLst.size() - 1; j++) {
					if (myLst.get(i) < myLst.get(j)) {
						int temp = myLst.get(i);
						myLst.set(i, myLst.get(j));
						myLst.set(j, temp);
					}
				}
			}
		}
		return myLst;
	}

	ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst) {
		int i;
		Integer largest = 0;
		Integer smallest = myLst.get(0);
		Integer indexOflargest = 0;
		Integer indexOfsmallest = 0;

		ArrayList<Integer> big = new ArrayList<>();
		ArrayList<Integer> small = new ArrayList<>();
		for (i = 0; i < myLst.size(); i++) {
			if (myLst.get(i) > largest) {
				largest = myLst.get(i);

			}
		}
		// finding how many largest nums are there and saving their index pos
		for (i = 0; i < myLst.size(); i++) {
			if (myLst.get(i) == largest) {
				big.add(i);
			}

			if (myLst.get(i) < smallest) {
				smallest = myLst.get(i);

			}
		}
		// System.out.println("printing position of largest" + big);

		// finding how many smallest nums are there and saving their index pos
		for (i = 0; i < myLst.size(); i++) {
			if (myLst.get(i) == smallest) {
				small.add(i);
			}
		}
		// System.out.println("printing position of smallest" + small);

		// no need to check which smallest or largest value is in the first index as the
		// arraylist is a sorted
		// list so we will always have the first occurring value in the first index
		// storing the first index of smallest and largest value to variables

		int largeFirstindex = big.get(0);
		int smallFirstindex = small.get(0);

		// System.out.println("largest = " + largest + " smallest " + smallest + " small
		// index = " + indexOfsmallest
		// + " index of big = " + indexOflargest);

		myLst.set(smallFirstindex, largest);
		myLst.set(largeFirstindex, smallest);

		return myLst;

	}

	public void table(ArrayList<Integer> myLst) {
		ArrayList<Integer> list = new ArrayList<>();
		// adding unique elements to list
		for (int m = 0; m < myLst.size(); m++) {
			if (!list.contains((Object) myLst.get(m))) {
				list.add(myLst.get(m));
			}

		}
		System.out.println("printing unique list = " + list);
		sort(list, true);
		System.out.println("printing unique list after sorting = " + list);

	}

	/*public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		array.add(1);
		array.add(6);
		array.add(7);
		array.add(9);
		array.add(2);
		array.add(1);
		array.add(8);
		array.add(9);

		ListManipulator m = new ListManipulator();
		m.table(array);

		result = m.swapLargestSmallest(array);
		// System.out.println(result);

	}

}*/

class Pair {
	private int value;
	private int NumOftimes;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getNumOftimes() {
		return NumOftimes;
	}

	public void setNumOftimes(int numOftimes) {
		NumOftimes = numOftimes;
	}

	public Pair(int value, int numOftimes) {
		super();
		this.value = value;
		NumOftimes = numOftimes;
	}

	@Override
	public String toString() {
		return "Keep [value=" + value + ", NumOftimes=" + NumOftimes + "]";
	}

}
