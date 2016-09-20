
public class StudentTest {

	public static void main(String[] args) {
		Subject subjectOne = new Subject ("Maths", 12, "Margaret Power");
		Subject subjectTwo = new Subject ("Computer Architecure", 9, "Aidan McManus");
		Subject subjectThree = new Subject ("Programming", 8, "Greg Doyle");
		Subject subjectFour = new Subject ("Systems Analysis", 11, "Margaret Power");
		Subject subjectFive = new Subject ("Maths", 7, "Margaret Power");
		Student newStudent = new Student ("Ryan", 3, "Castledermot","Software Development",
											831744889, 2, subjectOne,
											subjectTwo, subjectThree, subjectFour,
											subjectFive);
		
		System.out.println(newStudent.toString());
	}

}
