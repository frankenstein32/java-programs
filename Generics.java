package crx30dec;

import java.util.Comparator;

public class Generics {

	public static void main(String[] args) {

		Car[] carr = new Car[5];

		carr[0] = new Car(10, 1000, "Black");
		carr[1] = new Car(80, 8000, "Blue");
		carr[2] = new Car(30, 9000, "Yellow");
		carr[3] = new Car(50, 500, "Grey");
		carr[4] = new Car(9, 100, "White");
		 bubblesort(carr, new carpricecomparator());
		//bubblesort(carr);
		display(carr);

	}

	public static <T extends Comparable<T>> void bubblesort(T[] arr) {

		for (int counter = 0; counter < arr.length - 1; counter++) {

			for (int j = 0; j < arr.length - 1 - counter; j++) {

				if (arr[j].compareTo(arr[j + 1]) > 0) {

					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static <T> void bubblesort(T[] arr, Comparator<T> comparator) {

		for (int counter = 0; counter < arr.length - 1; counter++) {

			for (int j = 0; j < arr.length - 1 - counter; j++) {

				if (comparator.compare(arr[j], (arr[j + 1])) > 0) {

					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static <T> void display(T[] arr) {

		for (T val : arr) {
			System.out.println(val + " ");
		}

		System.out.println();
	}
}
