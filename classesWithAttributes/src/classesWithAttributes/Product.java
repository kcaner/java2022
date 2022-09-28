package classesWithAttributes;

public class Product {
	
	// 3. Konu= Constrocter ile bizim Product Classı'nı new lediğimizde çalışan bloğu devreye sokmuş oluyorsunuz.
	// Yani her Class'ın  kendi ismiyle bir Constructor'u vardır. 
	// constructor şöyle yazılır.
	// oClass ile aynı isimde olacak publiten sonra int,void, String yok.Döndüren birşey yok.
	// Bunu bir yapıcı method olarak düşünebiliriz.
		public Product(int id, String name, String description,double price,int stockAmount, String renk) {
		//bu şu anlama gelmektedir.	Ben Product'ı sadece ve sadece bu parametreleri verirsen kullandırırım sana demek.
		// Yani new ' lediğim zaman şu değerleri vermek zorundasın anlamına geliyor.
		System.out.println("Yapıcı Block çalıştı.");
		
		//Son olarak bizim parametreli  Constructoru kullnabilmek için şunu yapmamız gerekmektedir.
		
		this._id=id;
		this._renk=renk; 
		this._name=name;//This name= parametreyle gelen name.
		this._description=description;
		this._price=price;
		this._stockAmount=stockAmount;
		// kısaca bu şekilde o private değişkenleri set ettik.
		
	}
		
		public Product() {
			//4.OverLoading = yani bu ne demek Product class'ının bir tane,
			//6 parametreli bir tane de parametresiz Constructoru var isteyen istediğini kullnır alamına gelmektedir.
					
		}
		
		
	
	
	// ProductManager değil class ismi çünkü ekleme,silme gibi yönetimsel işlemler yoktur.
	
	// attribute | (veya) field denir bunlara.
	/*
	 * int id;//Ürünü tanımlayan eşsiz değerdir. String name; String description;
	 * double price; int stockAmount; String renk;
	 */
	
	
	// Encapsulation
	// Siz bir ürünün içerisinde böyle alanlar doldurduğunuzda siz onu public olarak işaretlemiş oluyorsunuz.
	//public = Her yerden erişilebilir demek.
	// tanımlanan değişkneleri önünde public vardır aslında.

	private int _id;//Ürünü tanımlayan eşsiz değerdir.
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;

	//private sadece tanımlandığı blockta geçerlidir demek.
	//Böyle bir tanımlamada Product classının içeisinde geçerlidir.
	// bir if içerisinde tanımlasaydık. O bulunduğu süslü parantez içerisinde geçerlidir demektir.

	
	// Şöyle durumlarda Encapsulation mutlaka kullnılır.
	// Örneğin siz ürüne ait bir kod oluşturmak istiyorsunuz.
	private String _kod;
	// Bu kodlama işlemini getter ve setter lar ile yapıyoruz.
	
	// Get == getir al demektir.Bir değeri okumaya yönelik bir değerdir.
	
	// Set == kurmak . Değere bir değerini vermeye yarar.
	// Getter ve Setter public yazılır ki ona ulaşabileyim.
	
	//okuyacak ya ilk önce o yüzden Get.int değerli bir değişken döndğrğyorum
	public int getId() { //id'yi okuyabilir.
		// Burada ihitiyacima göre buradaki id'yi değiştirebilirimde.
		return _id;
	}
	// git onun değerini kur demek bana birşey vermene gerek yok.
	// neyi set edece burada set edilecek değer parametre olarak verilmelidir.
	public void setId(int id) {
		//this.id = id;  // iki id karışabilir. Bu karışıklığı önlemek için 
		// *** this kullanılır. this benim içerisinde bulunduğum class demek.
		// Böylede yapılabilir. Yada Best practise olarak tanımlanan değişkenlerin önüne alt çizgi bırakabiliriz.
		//_ ile olnlar Field
		_id = id;
	}
	
	
    // boş sayfa satırına sağ tıklayıp Sourse'dan tüm Getter ve Setterları getirebilrim İDE aracılığıyla.
	public String get_name() {
		return _name;
	}
	public void set_name(String name) {
		this._name = name;
	}
	public String get_description() {
		return _description;
	}
	public void set_description(String description) {
		this._description = description;
	}
	public double get_price() {
		return _price;
	}
	public void set_price(double price) {
		this._price = price;
	}
	public int get_stockAmount() {
		return _stockAmount;
	}
	public void set_stockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}
	public String get_renk() {
		return _renk;
	}
	public void set_renk(String renk) {
		this._renk = renk;
	}
	public String get_kod() {
		//return _kod; // Getindede bunu yapabilirim.
		return this._name.substring(0,1) + _id;
		// kodu kullanıcının yazmasını engelledim.
		//Örn : kodum adın ilk hardi ve id'den oluşuyor.
	}
	/*
	 * public void set_kod(String _kod) { 
	 * this._kod = _kod; // kodu ben yazılabilir istemediğim için bunu silebilirim. }
	 */	
}


