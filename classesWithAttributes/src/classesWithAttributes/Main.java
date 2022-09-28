package classesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"siyah"); 
		//Constructor konusu için bunu newleyip çağırdığımızda Constructor bloğu çalışacaktır.
		//Constructor bloğu içerisinde istersek set edebiliriz.
		
		//isteyen üsttki gibi isteyen alttakş gibi kulananbilir.
		
		//Product product = new Product();
		  product.set_name("Laptop"); 
		  product.setId(1);
		  product.set_description("Asus Laptop") ; 
		  product.set_price(5000); 
		  product.set_stockAmount(3);
		  product.set_renk("");
	
		
		
		
		
		
		/*
		 * product.name = "Laptop"; 
		 * product.id = 1; 
		 * product.description = "Asus Laptop";
		 * product.price = 5000; 
		 * product.stockAmount = 3; 
		 * product.renk="";
		 */
		
		ProductManager productManager =  new ProductManager();
		productManager.Add(product);
		
		// Encapsulation == kapsülleme 
		//Kullanıcıyı herhangi bir alanı kullanmak için kısıtlamayı sağlar.
		
		/*
		 * //Bu yanlış bir kullanım olabilir. productManager.Add2(1,"", "", 2, 2);
		 * productManager.Add2(1,"", "", 2, 2); productManager.Add2(1,"", "", 2, 2);
		 * productManager.Add2(1,"", "", 2, 2);
		 */
		
		
		//  Değişkenlerimi artık get ve set'e göre düzenleyebilirim.
		/*
		 * product.set_name("Laptop"); 
		 * product.setId(1);
		 * product.set_description("Asus Laptop") ; 
		 * product.set_price(5000); 
		 * product.set_stockAmount(3);
		 * product.set_renk("");
		 // Constructor bloğu içerisinde istersek set edebiliriz.
		 */
		  
		 System.out.println((product.get_kod()));
		
	}

}
