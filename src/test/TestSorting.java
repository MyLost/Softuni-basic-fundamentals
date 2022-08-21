package test;

public class TestSorting {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 200000; i++) {
				System.out.println(2000000 - 1000000);
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println(startTime / 1000);
		System.out.println(endTime / 1000);
	}
}
