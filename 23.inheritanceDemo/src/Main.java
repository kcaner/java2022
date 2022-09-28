
public class Main {

	// Yazılımda en büyük olgu değişim ve değişimin kolaylığıdır.
	public static void main(String[] args) {
		
		// bİR Class sadece başka bir class'ı inherit - extends edebilir.
		// bir kişinin sadece bir base'i anesi olabilir.
	
		/*
		 * OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		 * ogretmenKrediManager.Hesapla();
		 */
		
		KrediUI krediUI =new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());// Ogretmen Kredi mangerın içerisndeki kod burada çalışır.
		// Ben Kredi hesaplada ona bir OgretmenKrediManager sınıfı göndereceğimi söyledim.
		// Yani bellekte bu örneği oluştur demektir.
		
		//new OgretmenKrediManager() istersem new TarimKrediManager()'ı gönderebilirim
		//Böyle bir kullanımda hata vermeyecektir.
		//Nedeni de BaseKredi Manager ikisininde annesi old. için anneyi verip çocuklarından
		// istediğimizi yollyabiliriz bunu Referans tip olması dolayısıyla yapıyor.İkisininde referansını tutar.
		
		//Bunun bu şekilde kullanılmasına ****Polymorphsym denir.
		
		krediUI.KrediHesapla(new AskerKrediManager()); // gibi örneklerle çoğaltabiliriz.
	}

}
