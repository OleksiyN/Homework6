
public class SumSingleThread implements Runnable {
	private int[] array;
	private int begin;
	private int end;
	private Thread t;
	private long sum;

	public SumSingleThread(int[] array, int begin, int end) {
		super();
		this.array = array;
		this.begin = begin;
		this.end = end;
		t = new Thread(this);
		t.start();
	}

	public int getBegin() {
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public Thread getT() {
		return t;
	}

	public void setT(Thread t) {
		this.t = t;
	}

	public long getSum() {
		return sum;
	}

	public long sum() {
		sum = 0;
		for (int i = begin; i < end; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	@Override
	public void run() {
		sum();
		/*
		 * sum = 0; for (int i = begin; i < end; i++) { sum = sum + array[i]; }
		 */
	}

}
