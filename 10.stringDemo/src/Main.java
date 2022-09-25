
public class Main {


/**
	 * @param args //
	 */
	public static void main(String[] args) {

		// stringler birer karakter dizisidir.

		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		System.out.println("Eleman Sayısı = " + mesaj.length());
		System.out.println(" 5.Eleman : " + mesaj.charAt(4));
		// charAt (4) fonksiyonu elemanı seçmemize yarar Stringteki
		// 5. elemanı bulmamıza yarar.

		System.out.println(mesaj.concat(" Yaşasın!"));
		// Concat = birleştirmek concatinati,ondan geliyor.
		// bu yapı kendine yeni bir String oluşturuyor.

		System.out.println(mesaj.startsWith("B"));
		// bu fonklsiyon B ile başlarsa bize True döndürür.yoksa False
		// "b" olsaydı false döndürdü. Java caseSensitive bir dildir. Küçük büyük harf
		// duyarlı bir dildir.
		System.out.println(mesaj.endsWith("."));
		//// bu fonklsiyon . ile bitiyormu. Bitiyorsa bize True döndürür.yoksa False

		char[] karakterler = new char[5]; // 5 eleman olsun
		mesaj.getChars(0, 5, karakterler, 0);
		// mesajların ilk beş karakterini almak istiyorum.
		// 0'dan başla 4 te bitir.
		// Bize karakter atıyor. O yüzden bir Char'da tutulur.
		// 0'dan 4'e kadar olan elemanları karakterlere ata, destination bagin==hedef,
		// peki karakterleri kaçtan başlayayım atamayı. Kaçıncı yere aktarayım.
		// 4 ü dahil etmityor. 5 karakter almak için 5 demem lazım getCahrs'da.
		System.out.println(karakterler);

		System.out.println(mesaj.indexOf("av"));
		// bir karakteri dizide kaçıncı eleman olduğunu bulmamıza yarar.
		// İlk buldugunu verir ve aramayı bitirir.
		// Bu metinde 'av' var mı onu arar.
		System.out.println(mesaj.lastIndexOf("a"));
		// Sondan aramaya başlar.
		// aramaya sağdan başlar.E yi sagdan başlayarak arar ama
		// soldan sağa kaçıncı indexte ise o index numarasını döndürür

		String yeniMesaj = mesaj.replace(' ', '-');
		// ****** replace = değiştirmek anlamında, Metindeki bazı karakterleri
		// değiştirebiliriz.
		// url'de bolukları bulup bir - atmak için kullanılabilir.
		System.out.println(yeniMesaj); // bu şekilde başka bir değereatayıp kullanabiliriz.

		// ******** yoğun kullanılanlar.
		// **** Görevi bir metnin içerisinden parça almaktır.
		System.out.println(mesaj.substring(2, 4));// nereden itibaren alayım.
		// odan 2. indexe kadar olan kısmı atar gerisini yazdırır.
		// 2. indexten itibaren 4. indexe kadar parçala - kes. 2'den başla 4'e kadar 4'ü
		// katmaz.

		// Split = fonksiyonu bir metni karakter yada karakter dizisini
		// baz alarak parçalamaya yarar.

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime); // kelimeleri parça parça alt alta yazmış olur.
			
			
	 	}
		
		
		
		System.out.println(mesaj.toLowerCase());
		//Mesajımızı Küçük harfa çevirir. Tüm harfleri küçültür.
		
		
		System.out.println(mesaj.toUpperCase());
		// Tüm kelimeleri Büyük harfa çevirir.
		// Bunları veri tabanlarına arama ifadesi gönderdiğimizde kullnırız.
		//  büyük küçük harf duyarlı olabiliyor.
		
		
		System.out.println(mesaj.trim());
		// veritabanındaki kaynak uyuşmazlıklarından dolayı. Trim Kelimenin başındaki ve 
		// sonundaki boşlukları atar.
	}

}
