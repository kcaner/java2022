
public class Main {

	public static void main(String[] args) {

		//double[] myList = new double{4};
				// Bunu yazmanın bir diğer yöntemi de 
				// Bu yöntemle arka planda bir new bir aray oluşturacaktır. 
				
				double[] myList = {1.2,1.3,4.3,5.6,8.7};
				double total=0;
				double max= myList[0];
				for (double number:myList) {
					if (max<number) {
						max = number;
						
					}
					
					total = total + number;
					System.out.println(number);
					
				
					
				}
				
				System.out.println( "Toplam = "+ total);
				System.out.println( "En Buyuk = "+ max);

	}

}
