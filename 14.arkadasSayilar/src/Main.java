
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Arkadaş Sayılar =
		// bilinen en küçük arkadaş sayı 220 ve 284 tür.
		// Bu sayılar kendileri hariç pozitif tam bölenleri 7
		// toplamı birbirine eşit olan sayılara arkadaş sayı denir.
		// birden başlayıp 220 ye kadar olan sayıların toplamı 220 dahil değil ile
		// birden başlayıp 284'e kadar poz. bölenlerin sayısı yine 220'e
		// eşit ise bu iki sayı arkadaş sayıdır denir.

		int sayi1 = 220;
		int sayi2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;

		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				toplam1 = toplam1 + i;
			}
		}
		for (int i = 1; i < sayi2; i++) {
			if (sayi2 % i == 0) {
				toplam2 = toplam2 + i;
			}
		}

		/*
		 * Böylede yaparak iki şart sağlanmış olurdu. if(sayi1==toplam2) {
		 * if(sayi2==toplam1) { System.out.println();} }
		 */
		if (sayi1 == toplam2 && sayi2 == toplam1) {
			// && and==ve operatörü 2side doğru olmalı
			// || or=veya pipe diye adlandırılı. sadece 1 şart sağlanması yeteri ise.

			System.out.println("Bu iki sayı arkadaştır.");
		} else {
			System.out.println("Bu iki sayı arkadaş değildir.");

		}

	}

}
