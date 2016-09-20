public class Subject 
{
	private String subName;
	private int noOfHours;
	private String teacher;
	
	public Subject()
	{
		this("",0,"");
	}
	public Subject(String subN, int hours, String tName)
	{
		this.setSubjectName(subN);
		this.setHours(hours);
		this.setTeacher(tName);	
	}
	public void setSubjectName(String subN)
	{
		this.subName = subN;
	}
	public void setHours(int hours)
	{
		this.noOfHours = hours;
	}
	public void setTeacher(String tName)
	{
		this.teacher = tName;
	}
	public String toString(){
		return "Subject Name: " + this.subName + "\n" 
				+ "No. of Hours :" + this.noOfHours + "\n"
				+ "Name of teacher: " + this.teacher;
	}
}
