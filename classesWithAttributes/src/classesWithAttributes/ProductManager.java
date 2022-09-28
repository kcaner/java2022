package classesWithAttributes;

public class ProductManager {
	
	public void Add(Product product) {
		// Bu ürünleri JDBC kodları yazarak veritabanına kaydedicez.
	//	System.out.println("Ürün Eklendi: "+product.name);
		//Get ve Setten sonra pasif ettim.
		
		// SOLİD '*** yazılım kurallarına göre bir Class Sadece bir iş yapar.
		//Single Responsibility
		
	}
	
	public void Add2(int id,String name,String description,int stockAmount,double price,String renk) {
		
		// Böyle bir kullanımda bu fonksiyonu nerede kullandıysanız hepsinde buraya bir renk parametresi göndermeiz gerekecektir.
		// Ve tüm kod blockları kızaracaktır.
		
	}

}
