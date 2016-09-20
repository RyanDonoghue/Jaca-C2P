
public class EmployeeTest 
{

	public static void main(String[] args) {
		Employee[] employeeArray = new Employee[9];
		System.out.println("what is the model of the car");
		String m = EasyIn.getString();
		Car car1 = new Car(m, "Fiesta", 2.0 , "Diesel", "02KK1146");
		Car car2 = new Car("Toyota", "Camry", 2.0 , "Petrol", "98LS789");
		employeeArray[0] = new Employee(831744889, "Ryan", "Castledermot", "Tech Support", 80000, car1, car2);
		System.out.println(employeeArray[0].toString());
	}

}
