
public class MultiThread {
	static void multi(int[] arr, int number) {
		long sumTreads = 0;
		SumSingleThread[] threadarr = new SumSingleThread[number];
		for (int i = 0; i < threadarr.length; i++) {
			int size = arr.length / number;
			int begin = size * i;
			int end = ((i + 1) * size);
			if ((arr.length - end) < size) {
				end = arr.length;
			}
			threadarr[i] = new SumSingleThread(arr, begin, end);
		}
		for (int i = 0; i < threadarr.length; i++) {
		try {
		threadarr[i].getT().join();
		} catch (InterruptedException e) {
		System.out.println(e);
		}
		}
		for (int i = 0; i < threadarr.length; i++) {
			sumTreads = sumTreads + threadarr[i].getSum();
			}
		System.out.println(sumTreads);
	}
	
}
