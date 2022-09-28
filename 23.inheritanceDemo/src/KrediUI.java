
public class KrediUI { //UI user interface 
	//arayüz intelij idea, bir internet sitesi bir arayüz.
	
	/*public void KrediHesapla(OgretmenKrediManager ogretmenKrediManager) {//Prametre olarak yollarım
		ogretmenKrediManager.Hesapla();
	// Bunu böyle yapmak yerine baseKrediManagerda yapabiliriz.
	
		}
		*/
	
	public void KrediHesapla(BaseKrediManager baseKrediManager) {
	baseKrediManager.Hesapla();
	}
}
