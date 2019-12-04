package problem4;

public class Main {

	public static void main(String[] args) {
		int a[] = { 0 , 8 , -3 ,20};
		MinMax.Pair p = MinMax.minmax(a);
		System.out.println(p.min + " "+ p.max);
		
	}
}
