package a5;

import java.util.ArrayList;

public class ListManipulator {
	//Accepts an array list of integers and sorts it in ascending or descending order.
	//Make sure to account for cases with duplicate values. The method returns the 
	//sorted list. 
	ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending){
		ArrayList<Integer> newList = new ArrayList<Integer>();
		if(ascending == true) {
			for(int n : myLst) {
				for(int i = 0; i < myLst.size()-2; i++) {
					for(int j = i +1 ; j < myLst.size()-1; j++) {
						if(myLst.get(i) > myLst.get(j)) {
							int temp = myLst.get(i);
							myLst.add(i, myLst.get(j));
							myLst.add(j, temp);		
						}
					}
				}
			}
		}	
		return myLst;
	}
	
	private void Swap(int temp, int temp2) {
		int a = temp;
		temp = temp2;
		temp2 = a;	
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
		/*ListManipulator m = new ListManipulator();
		result = m.sort(array, true);
		System.out.println(result);*/
		System.out.println(123);
		
	}
}
