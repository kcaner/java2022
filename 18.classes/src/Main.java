
public class Main {
	
	//java 'da iş yapan herşey bir class'tır.
	public static void main(String[] args) {
		
		//CustomerManager Classından String gibi. 
		//CustomerManager türünde . Bu bir türdür.
		// Bellekte CustomerManager türünde bir nesne bu şekilde oluşturulur.
		
		
		CustomerManager customerManager;
		//*** Classlar Referans tiptir(type).
		CustomerManager customerManager2 = new CustomerManager();
		customerManager=customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//GArbageCollector = Kullanılmayan classı java siler çöbe atar.
	
	
		// ***** Değer ve Referans Tiplerin Farkı
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1=30;
		System.out.println(sayi2);
		// Sonuç 10 
		//Primitive Tip(int, double, float, byte vb)
		//Bu sayısal tipli değişkenler Değer tiplidir.
		//Value type
	
		
		
		int [] sayilar1 = new int [] {1,2,3};
		int [] sayilar2 = new int [] {4,5,6};
		sayilar1 = sayilar2;
		sayilar1[0] = 10 ;
		System.out.println(sayilar2[0]);
		
		// Steak ve HeapTen dolayı 
		// Diziler referans tiptir.
		// Heapteki adreste tutulan değer değişti.
		// Stavkte o değeri diğerine atadı.
	
		
	}	

}

