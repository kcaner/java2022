
public class Main {

	public static void main(String[] args) {

		// Mükemmel Sayı = Kendinden başka
		// pozitif tam bölenlerinin toplamı kendisine eşit olan
		// sayıya mükemmel sayı denir.
		// 6 = 1,2,3
		// 28 = 1,2 ,4 , 7, 14

		// Benim Çözümüm, Hocanın Çözümüde Bu şekilde.
		int number = 6;
		int total = 0;

		if (number < 0) {
			System.out.println("Geçersiz Sayı Girdiniz.");
			return;
		}

		if (number == 0) {
			System.out.println("Sayı Mükemmel Sayı değildir.");
			return;
		}
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}

		}
		if (total == number) {
			System.out.println("Sayı Mükemmel Sayıdır.");

		} else {
			System.out.println("Sayı Mükemmel Sayı değildir.");

		}

	}
}
