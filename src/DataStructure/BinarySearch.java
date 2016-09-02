package DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 * @author dhruv
 * 
 * binary search recursive algorithm
 *
 */
public class BinarySearch {

	public static int binarySearch(ArrayList<Integer> list, int element, int low, int high) {

		int mid = low + (high - low) / 2;

		if (list.get(mid) == element) {
			return mid;
		} else if (element > list.get(mid)) {
			return binarySearch(list, element, mid + 1, high);
		} else {
			return binarySearch(list, element, low, mid - 1);
		}

	}

	public static void main(String args[]) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		Scanner o = new Scanner(System.in);

		System.out.println("insert the elements in the list");

		for (int j = 0; j < 10; j++) {
			int temp = o.nextInt();

			list.add(temp);
		}

		Collections.sort(list);

		System.out.println("Binary search must be a sorted list Sort the list" + list);

		System.out.println("Enter the element one want to search");

		int element = o.nextInt();

		System.out.println("element Position :" + BinarySearch.binarySearch(list, element, 0, list.size() - 1));

	}

}
