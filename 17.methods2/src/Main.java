
public class Main {

	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel.";
		mesaj.substring(0, 2);
		String yeniMesaj = sehirVer();
		// substring bir değer döndürüyor demekki.
		System.out.println(yeniMesaj);

		int sayi = topla(5, 7); // topla fonk. parametre göndermek istersem.

		System.out.println(sayi);

		// Variable Argument devam
		int toplam = topla2(2, 3, 4, 5, 6, 10);
		// Arka planda bir dizihye çeviriyor.
		// int toplam = topla2(); // Böyle boş array göndermiş gibi algılar ve kızmaz.
		System.out.println(toplam);

	}

	// operasyon = method= fonksiyon aynı şey
	// Kendimizi tekrar etmemek için kullanırız.

	// void emir kipi gibidir.Ekle emri, ,sil emri gibi
	// void operasyonu deniyor.
	public static void ekle() {
		System.out.println("Eklendi.");
		// Bize birşey döndürmüyor.Sadece işlemin yapıldığını teyit ediyorum.
	}

	// **** Void bize sonuç olarak hiçbir şey vermez.
	public static void sil() {
		System.out.println("Silindi.");
	}

	public static void güncelle() {
		System.out.println("Güncellendi.");

	}

	// ****void yerine int yazdım. Bu şu demek bu fonksiyonü
	// bize intijer türünde bir değer döndürür demek.

	public static int topla(int sayi1, int sayi2) {
		// return 5;
		// return bitir methodu devam ettirme demek
		// ama 5 Döndür demek.
		return sayi1 + sayi2;
	}

	// Variable Argument ile istediğimiz sayıda değer göderebiliriz

	public static int topla2(int... sayilar) { // ... ile bir array gönderiyorum.
		// arka planda bir int array var.
		int toplam = 0;

		for (int sayi : sayilar) { // Sayılarda ki her bir sayı için demek bu.
			toplam += sayi;

		}
		return toplam;
	}

	public static String sehirVer() {

		return "Ankara";
	}
}
