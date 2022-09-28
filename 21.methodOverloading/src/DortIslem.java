
public class DortIslem {

	public int topla(int sayi1, int sayi2) {// Topla Operasyonu
		return sayi1 + sayi2;

	}

	// Yeni bir özellik getirmek istiyorum.
	
	// ikisinin method parametrelerinin imzasının farklı olması.
	//Değişken sıralamasıda önemli
	// ikisinede topla ismini verdik Ancak parametre sayıları farklı olduğundan 
	// iki farklı Operasyon gibi algılanıyor 
	//BU durmu ****overLoading denmektedir.
	public int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2;

	}
}
