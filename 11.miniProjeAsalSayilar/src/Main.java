
public class Main {

	public static void main(String[] args) {

		// ! ve kendinden başka böleni olmayan sayılara Asal Sayı denir.
		int number = 2;
		int remainder = number % 2; // ramainder = kalan (% yüzde-mod operatörü)

		System.out.println(remainder);

		/*
		 * Benim Çözümüm Yanlış!! if (number <0) { System.out.println(number +
		 * " Sayısı Negatiftir. Lütfen Pozifif Bir sayı giriniz. ");
		 * 
		 * } else if (number == 2) { System.out.println(number + " Sayısı Asaldır. ");
		 * 
		 * } else if (number == 1) { System.out.println(number +
		 * " Sayısı asal değildir"); }
		 * 
		 * else if(remainder==1) {
		 * 
		 * System.out.println(number + " Sayısı Asaldır. "); }
		 */

		// Hocanın Çözümü

		boolean isPrime = true; // Asal Sayı mı?

		if (number == 1) {
			System.out.println("Sayı Asal değildir.");

			return; // buradan daha aağı gitmesin diye burada programı bitiriyoruz.
			// 1 girdiğinde aşağıdaki satırları işlemesin diye.
		}
		if (number < 1) {
			System.out.println("Geçersiz Sayı");
		}

		for (int i = 2; i < number; i++) { // 2 den başlayıp 25e değil 24 'e kadar.

			if (number % i == 0) {
				isPrime = false;
				// ilk etapta sayımızı asal kabul ediyoruz .2 'den 24 e kadar herhangi bir sayı
				// tam bölüyorsa false olarak işaretlenir.

			}
		}

		if (isPrime) {// if (isPrime==true) ile if (isPrime) aynıdır.
			System.out.println("Sayı Asaldır");

		} else {
			System.out.println("Sayı Asal Değildir.");

		}

		// sayıya 2 verdiğimizde asal der çunkü for döngüsünü 2 'den başlattığımızdan
		// dolayı.
		// For döngüsünün içerisine hiç bir zaman girmez.

	}

}
