package problem4;

import lab2.Time;

public class Sort {

	static <E> void swap(E[] times, int i, int j) {
		E temp = times[i];
		times[i] = times[j];
		times[j] = temp;
	}

	static <E extends Comparable<E>> void bubbleSort(Time[] times) {
		int n = times.length;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (times[j].compareTo(times[i]) == 1 && j < i) {
					swap(times, i, j);
				}
	}
	 
	/*
	 * static <E> void swap(E[] times, int n, int i) {
	 * 
	 * int largest = i; int l = 2 * i + 1; int r = 2 * i + 2; if (l < n && ((Time)
	 * times[l]).compareTo(times[largest]) == 1) largest = l;
	 * 
	 * if (r < n && ((Time) times[r]).compareTo(times[largest]) == -1) largest = r;
	 * 
	 * if (largest != i) { E swap = times[i]; times[i] = times[largest];
	 * times[largest] = swap;
	 * 
	 * swap(times, n, largest); }
	 * 
	 * }
	 * 
	 * static <E extends Comparable<E>> void heapSort(E[] times) { int n =
	 * times.length;
	 * 
	 * for (int i = n / 2 - 1; i >= 0; i--) swap(times, n, i);
	 * 
	 * for (int i = n - 1; i >= 0; i--) { E temp = times[0]; times[0] = times[i];
	 * times[i] = temp;
	 * 
	 * swap(times, i, 0); }
	 * 
	 * }
	 */
}
