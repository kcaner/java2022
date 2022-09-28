
public class Main {
	// Classlar ya atribute ları tutar yada Operasyonları tutuar.
	
	
	// Inheritance = Miras
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		Employee employee = new Employee();
		
	
		
		EmployeeManager employeeManager =new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
		// Ctrl + Space ile intellicence açılır.
		customerManager.Add();
		employeeManager.BestEmployee();//Var ekstradanda.
	}

}
