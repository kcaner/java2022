
public class Main {
	public static void main(String[] args) {
		/*
		 *
		 * int [] sayilar = new int [] {1,2,5,7,9,0}; int aranacakSayi = 5;
		 * 
		 * int x=0; for (int i : sayilar) {
		 * 
		 * if (i == 5) {
		 * 
		 * x += 1;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * System.out.println("5 sayısı diz içerisinde "+ x + " kez geçmektedir." ); }
		 * 
		 * BENİM YAPTIĞIM
		 */

		// HOCANIN YAPTIĞI
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacakSayi = 5;

		boolean varMi = false;

		for (int sayi : sayilar) {

			if (sayi == aranacakSayi) {
				varMi = true;
				break;
				// Döngüyü burada bitirecek

			}
			
		}

		if(varMi) {
			System.out.println("Sayi Mevcuttur");
		}
		else {
			System.out.println("Sayi Mevcut Değildir.");
		}
	}
}
