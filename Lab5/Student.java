public class Student 
{
	private String name;
	private int age;
	private String address;
	private String course;
	private long number;
	final int flatRate = 500;
	private int year;
	Subject[] subArray = new Subject[5];
	Subject subjectOne = new Subject("",0,"");
	Subject subjectTwo = new Subject("",0,"");
	Subject subjectThree = new Subject("",0,"");
	Subject subjectFour= new Subject("",0,"");
	Subject subjectFive = new Subject("",0,"");
	
	
	
	public Student(){
		this.setName("");
		this.setAge(0);
		this.setAddress("");
		this.setCourse("");
		this.subArray[0] = null;
		this.subArray[1] = null;
		this.subArray[2] = null;
		this.subArray[3] = null;
		this.subArray[4] = null;
	}
	public Student (String n, int a, String addr, String c, long num, int y, Subject subjectOne,
					Subject subjectTwo, Subject subjectThree, Subject subjectFour, Subject subjectFive){
		this.setName(n);
		this.setAge(a);
		this.setAddress(addr);
		this.setCourse(c);
		this.setNumber(num);
		this.setYear(y);
		this.setSubjectOne(subjectOne);
		this.setSubjectTwo(subjectTwo);
		this.setSubjectThree(subjectThree);
		this.setSubjectFour(subjectFour);
		this.setSubjectFive(subjectFive);
		
	}
	public void setName(String n){
		this.name = n;
	}
	public void setAge(int a){
		this.age = a;
	}
	public void setAddress(String addr){
		this.address = addr;
	}
	public void setCourse(String c){
		this.course = c;
	}
	public void setNumber(long num){
		this.number = num;
	}
	public void setYear(int y){
		this.year = y;
	}
	public void setSubjectOne(Subject subjectOne){
		subArray[0] = subjectOne;
	}
	public void setSubjectTwo(Subject subjectTwo){
		subArray[1] = subjectTwo;	
	}
	public void setSubjectThree(Subject subjectThree){
		subArray[2] = subjectThree;
	}
	public void setSubjectFour(Subject subjectFour){
		subArray[3] = subjectFour;
	}
	public void setSubjectFive(Subject subjectFive){
		subArray[4] = subjectFive;
	}
	public int getYear(){
		return this.year;
	}
	public int calcReg(){
		int fee = 0;
		int input = this.getYear();
		
		switch(input) {
		case 1: fee = flatRate;
		break;
		case 2: fee = flatRate + 100;
		break;
		case 3: fee = flatRate + 200;
		break;
		case 4: fee = flatRate + 300;
		break;
		case 5: fee = flatRate + 400;
		break;
		default: fee = 0;
		}
		return fee;
	}
	public String toString(){
		
		return "Name: " + this.name
				+ "\n" + "Age: " + this.age + "\n"
				+ "Address: " + this.address + "\n"
				+ "Course: " + this.course + "\n"
				+ "Number: " + this.number + "\n"
				+ "Year: " + this.year + "\n"
				+ "Registration Fee: "  + this.calcReg()+ "\n" + "Subjects: " 
				+ "\n" + this.subArray[0]
				+ "\n" + this.subArray[1]
				+ "\n" + this.subArray[2]
				+ "\n" + this.subArray[3]
				+ "\n" + this.subArray[4];
	}	
	}
