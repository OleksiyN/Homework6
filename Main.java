import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// Task1
		Thread[] th = new Thread[100];
		for (int i = 0; i < 100; i++) {
			th[i] = new Thread(new FactorialThread(i));
		}
		for (int i = 0; i < 100; i++) {
			th[i].start();
		}
		try {
			for (int i = 0; i < 100; i++) {
				th[i].join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();

		// Task 2
		Random random = new Random();

		long timeStart, timeStop;
		int[] arrInt = new int[200000000];
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = random.nextInt(10);
		}
		timeStart = System.currentTimeMillis();
		sum1(arrInt);
		timeStop = System.currentTimeMillis();
		System.out.println(timeStop - timeStart);
		System.out.println();
		timeStart = System.currentTimeMillis();
		MultiThread.multi(arrInt, 4);
		timeStop = System.currentTimeMillis();
		System.out.println(timeStop - timeStart);
	}

	static void sum1(int[] arr) {
		long sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
	
}
