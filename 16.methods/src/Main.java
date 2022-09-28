
public class Main {

	public static void main(String[] args) {
		
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;

		boolean varMi = false;

		for (int sayi : sayilar) {

			if (sayi == aranacak) {
				varMi = true;
				break;
				// Döngüyü burada bitirecek

			}
			
		}
		
		String mesaj = ""; // Bu şekilde de yazabiliriz.
		if(varMi) {
			mesaj = "Sayi Mevcuttur: "+aranacak ; 
			mesajVer(mesaj); // İntijer türünde olsun yeter.
		}
		else {
			mesajVer("Sayi Mevcut Değildir: "+aranacak);
		}

	}
	
/*	// javada method isismleri cameCasing ile yazılır.
	//Class isimleri PascalCase ile yazılır.
	public static void mesajVer(int aranacak) { // parametreli method.
		
		//aranacağa ulaşamadım.Değişen tanımlandığı blokcta geçerlidir.
		System.out.println("Sayi Mevcuttur"+ aranacak);*/
	
public static void mesajVer(String mesaj) { 
		

		System.out.println(mesaj);
	}
}
