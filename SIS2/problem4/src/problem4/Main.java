package problem4;

import lab2.Time;

public class Main {
	public static void main(String[] args) {
		Time[] times = new Time[3];
		times[0] = new Time(12, 42, 50);
		times[1] = new Time(15, 12, 24);
		times[2] = new Time(12, 43, 51);
		Sort.bubbleSort(times);
		
		for (Time e : times) {
			System.out.println(e.getHour() + " " + e.getMinute() + " " + e.getSecond());
		}
	}
}
