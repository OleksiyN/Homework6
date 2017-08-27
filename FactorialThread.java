import java.math.BigInteger;

public class FactorialThread implements Runnable {
	private int number;

	public FactorialThread(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	private BigInteger factorialCalculate(int number) {
		BigInteger factorial = new BigInteger("1");
		for (int i = 1; i <= number; i += 1) {
			factorial = factorial.multiply(new BigInteger(Integer.toString(i)));
		}
		return factorial;
	}

	@Override
	public void run() {
		Thread th = Thread.currentThread();
		System.out.println(th.getName() + " " + (this.number+1) + "! = " + factorialCalculate(this.number+1));
	}

}
