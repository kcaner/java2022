
public class Main {

	public static void main(String[] args) {

		// switch blokları ;
				// İf bloklarına göre çok daha az kullanılan bir tekniktir.
				// switch blokları ile dallandırma yapabiliriz.

				// char tipinde grade(not)
				// char tek tırnakla verilir ' '

				char grade = 'B';
				// Şartımızın öznesi ne?

				switch (grade) {// ne durumunda .case durum demek
				case 'A':
					System.out.println("Mükemmel : Geçtiniz");
					break; // ilk durumu burda bitirmek gerekiyor.

				case 'B':  // iki durumunda çıktısı eşit ise bu
					       // şekilde bir kullanım yapmamız gerekiyor.
				case 'C':
					System.out.println("İyi : Geçtiniz");
					break;
				case 'D':
					System.out.println("Fena Değil : Geçtiniz");
					break;
				case 'F':
					System.out.println("Malesef : Kaldınız");
					break;

				// default ise şu notların dşında bir not girer ise
				// F yerine G girdi mesela
				default:
					System.out.println("Geçersiz not girdiniz.");

					// Ctrl + shift + F ile codelarımız uygun formata dönüştürebiliriz (Eclipse
					// için)
					
				}
	}

}
