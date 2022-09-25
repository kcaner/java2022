
public class Main {

	public static void main(String[] args) {

		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);

		System.out.println("------------------------");
		// [] array dizi.

		String[] ogrenciler = new String[4];
		// veri tipini ve kaç elemandan oluşaca1ğını tanımladık.
		// bir dizi bu şekilde tanımlanır.
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";
		// ogrenciler[4] = "Ali";
		// java.lang.ArrayIndexOutOfBoundsException hatası verdirir.
		// yani indek kabul edilen sınırkların dışında hatası döndürür.

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

		// Genelde bu yöntem kullanılır.
		// ogrencilerdeki her bir ogrenci yi tut.

		// Tersine mühendislik (Reverse Enginiring ) - Best praktise açık yazmak
		// tanımlamaları.
		System.out.println("--------------------");
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);

			// Bu ogrenciler dizisindeki her bir elemanı gez demek.
			// her bir elemanı gezerken o ogrencilere takma isim ve ogrenci

	}
	}
}
