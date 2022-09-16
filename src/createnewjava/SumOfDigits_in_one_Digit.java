package createnewjava;

public class SumOfDigits_in_one_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123456;
		int a, sum = 0, b;
		while (n > 0) {
			a = n % 10;
			sum = sum + a;
			n = n / 10;
			System.out.println(sum);
			if (sum > 10) {
				b = sum % 10;
				sum = sum / 10;
				sum = sum + b;
			}
		}
		System.out.println("final"+  sum);
	}
}
