package a5;

import java.util.ArrayList;

public class ListManipulator {
	// Accepts an array list of integers and sorts it in ascending or descending
	// order.
	// Make sure to account for cases with duplicate values. The method returns the
	// sorted list.
	ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending) {
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
		}
		else if (ascending == false) {
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
	
	ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst){
		int i;
		Integer largest = 0;
		Integer smallest = myLst.get(0);
		Integer indexOflargest;
		Integer indexOfsmallest;
		
		for (i = 0; i < myLst.size() - 1; i++) {
			System.out.println( i);
			if (myLst.get(i) > largest) {
				largest = myLst.get(i);
				System.out.println(" just before index" + i + " largest" + largest + " "
						+ myLst.get(i));
			
			}
		}
		
		return myLst;
		
	}
	
	public static int[] swap(int[] array) {
	    int minIndex = 0, maxIndex = 0;
	    for (int i = 1; i < array.length; ++i) {
	        if (array[i] < array[minIndex])
	            minIndex = i;
	        if (array[i] > array[maxIndex])
	            maxIndex = i;
	    }
	    int t;
	    if (maxIndex != minIndex) {
	        t = array[minIndex];
	        array[minIndex] = array[maxIndex];
	        array[maxIndex] = t;
	    }
	    return array;
	}

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		array.add(5);
		array.add(6);
		array.add(7);
		array.add(3);
		array.add(2);
		array.add(1);
		array.add(8);
		array.add(9);
		ListManipulator m = new ListManipulator();
		result = m.sort(array, false);
		System.out.println(result);
		//m.swapLargestSmallest(array);
		int arr[] = {1, 5, 4, 6, 8};
		int a[] = swap(arr);
		for(int l : a) {
			System.out.println(l);
		}
		
		
	}
}
