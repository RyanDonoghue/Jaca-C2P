public class Employee 
{
	private long number;
	private String name;
	private String address;
	private String department;
	private int salary;
	private String carReg;
	private double payable;
	final double lowTax = 0.2;
	final double highTax = 0.4;
	Car[] carArray = new Car[2];
	Car car1 = new Car("","",0,"","");
	Car car2 = new Car("","",0,"","");
	
	public Employee (){
		number = 0;
		name = "";
		address = "";
		department = "";
		salary = 0;
		carArray[0] = null;
		carArray[1] = null;
	}
	
	public Employee (long num, String n, String add, String depart, int sal, Car car1, Car car2){
		this.setNumber(num);
		this.setName(n);
		this.setAddress(add);
		this.setDepartment(depart);
		this.setSalary(sal);
		this.setCompanyCarOne(car1);
		this.setCompanyCarTwo(car2);
		
	}
	public Employee (long num, String n, String add){
		this.number = num;
		this.name = n;
		this.address = add;
		this.department = "";
		this.salary = 0;
	}
	public void setNumber(long num){
		this.number = num;
	}
	public void setName(String n){
		this.name = n;
	}
	public void setAddress(String add){
		this.address = add;
	}
	public void setDepartment(String depart){
		this.department = depart;
	}
	public void setSalary(int sal){
		this.salary = sal;
	}
	public long getNumber(){
		return this.number;
	}
	public String getName(){
		return this.name;
	}
	public String getAddress(){
		return this.address;
	}
	public String getDepartment(){
		return this.department;
	}
	public int getSalary(){
		return this.salary;
	}
	public String getReg(){
		return this.carReg;
	}
	public void setCompanyCarOne(Car car1){
		carArray[0] = car1 ;
	}
	public void setCompanyCarTwo(Car car2){
		carArray[1] = car2 ;
	}
	public Double taxPayable(){
		
		if (this.getSalary() < 20000)
		{
			payable = this.getSalary()* lowTax;
		}
		else 
		{
			payable = this.getSalary()* highTax;
		}
		return payable;
	}
	public String toString() {
		
		return "Employee No.: " + this.number
				+ "\n" + "Name: " + this.name + "\n"
				+ "Address: " + this.address + "\n"
				+ "Department: " + this.department + "\n"
				+ "Salary: " + this.salary + "\n"
				+ "Company Car 1: " + "\n" + this.carArray[0] + "\n"
				+ "Company Car 2: " + "\n" + this.carArray[1] + "\n";
	}
}

