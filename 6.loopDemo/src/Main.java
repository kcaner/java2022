
public class Main {

	public static void main(String[] args) {

		// For
		// i++ = i=i+1 = i+=1 i'yi bir arttır

		// i 1'den başlasın i 10'dan küçük old. sürece,
		// i'yi bir arttır. Son kısmı i'nin kaçar artacağını ifade eder.

		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);

		}

		for (int i = 2; i < 10; i += 2) {
			System.out.println(i);
			// çift sayıları bu şekilde yazabiliriz.

		}

		System.out.println(" For Döngüsü Bitti ");

		// While

		// Bir değişken direk olarak tanımlandığı yerde blokcta geçerlidir.
		// her yerde kullanmak ister isen globalde tanımlaman gerekmektedir.

		int i = 2;
		while (i < 10) {
			System.out.println(i);
			i += 2;

		}

		// i 'yi şarta göre attırmaz isem infinite(sonsuz) bir döngü
		// ile karşılaşırız. Bunu Windowstan task managerdan zorla durdurmamız
		// gerekmektedir.

		System.out.println(" While Döngüsü Bitti ");

		// Do-While

		// Burada kodlarımız do'nun içerisinde
		int j = 100;
		do {

			System.out.println("Loglandı");// kim hangi operasyonu ne şekilde çağardı şeklinde.

			System.out.println(j);
			j += 2;
			// i'nin Main içerisinde tanımlı old.
			// J tanımlarız

		} while (j < 10);

		System.out.println(" Do-While Döngüsü Bitti ");

		// while'de şart sağlanmazsa hiç bir şekilde kodları
		// çalıştırmaz.
		// do - while'de ise do ilk önce 1 kez çalışır daha da çalışmaz

		// Örneğin; siz bir döngüye girdiğiniz zaman dögü çalışmasa bile
		// veri tabanına log(o döngünün sınandığına, çalıştırıldığına, test edildiğine
		// dair bilgi) atmak istiyorsunuz

		// şart sağlanmadığında 1 kere çalışan , şartlar sağlandığında
		// normal while'den bir farkı olmayan fonksiyon.
	}

}
