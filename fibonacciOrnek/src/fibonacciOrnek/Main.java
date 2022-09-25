package fibonacciOrnek;

public class Main {

		public class SolutionTwo {
		    public static void main(String[] args) {
		        int sayi = 0;
		        int a = 0;
		        int b = 1;
		        int c = a + b ;
		        while (c < 4000000){
		            if (c % 2 == 0){
		                sayi = sayi + c;
		            }
		            a = b;
		            b = c;
		            c = a + b;
		        }
		        System.out.println(sayi);
		    }
		}

			

	}

