package lab2;

public class Time implements Comparable<Object> {
	private int hour;
	private int minute;
	private int second;

	public Time(int hour1, int minute1, int second1) {
		this.hour = hour1;
		this.minute = minute1;
		this.second = second1;
	}

	public int getHour() {
		return this.hour;
	}

	public int getMinute() {
		return this.minute;
	}

	public int getSecond() {
		return this.second;
	}

	public String toUniversal() {
		/*
		 * String converted = this.hour + ":" + this.minute + ":" + this.second + " ";
		 * return converted;
		 */
		String s;
		if (this.hour >= 10) {
			s = Integer.toString(this.hour);
		} else {
			s = '0' + Integer.toString(this.hour);
		}
		if (this.minute >= 10) {
			s = s + ':' + Integer.toString(this.minute);
		} else {
			s = s + ":0" + Integer.toString(this.minute);
		}

		if (this.second >= 10) {
			s = s + ':' + Integer.toString(this.second);
		} else {
			s = s + ":0" + Integer.toString(this.second);
		}
		return s;
	}

	public String toStandard() {
		if (this.hour > 12)
			return this.convert(this.hour - 12) + " PM";
		else
			return this.toUniversal() + " AM";
	}

	public String convert(int h) {
		String s;
		if (h >= 10) {
			s = Integer.toString(h);
		} else {
			s = '0' + Integer.toString(h);
		}
		if (this.minute >= 10) {
			s = s + ':' + Integer.toString(this.minute);
		} else {
			s = s + ":0" + Integer.toString(this.minute);
		}
		if (this.second >= 10) {
			s = s + ':' + Integer.toString(this.second);
		} else {
			s = s + ":0" + Integer.toString(this.second);
		}
		return s;
	}

	public void add(Time t2) {
		this.hour += t2.hour;
		this.minute += t2.minute;
		this.second += t2.second;
		if (this.second >= 60) {
			this.second -= 60;
			this.minute++;
		}

		if (this.minute >= 60) {
			this.minute -= 60;
			this.hour++;
		}

		if (this.hour >= 24) {
			this.hour -= 24;
		}
		String converted = this.hour + ":" + this.minute + ":" + this.second + " ";
		System.out.println(converted);
	}

	@Override
	public int compareTo(Object o) {
		Time t = (Time) o;
		if (this.hour == t.hour) {
			if (this.minute == t.minute) {
				if (this.second > t.second)
					return 1;
				else if (this.second == t.second)
					return 0;
				return -1;
			} else if (this.minute > t.minute)
				return 1;
			return -1;
		}
		if (this.hour > t.hour)
			return 1;
		return -1;
	}
}
