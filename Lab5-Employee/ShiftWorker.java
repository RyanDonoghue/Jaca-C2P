public final class ShiftWorker extends Employee
{
	private double wage;
	private double hours;
	public ShiftWorker(){
		super("","");
		setWage(0);
		setHours(0);
	}
	public ShiftWorker(String first, String last, double w, int h){
		super(first, last);
		setWage(w);
		setHours(h);
	}
	public void setWage(double w)
	  { wage = (w > 0 ? w : 0); }

	  // Set the hours worked
	  public void setHours(double h)
	  { hours = (h >= 0 && h < 168 ? h : 0); }
	  public double earnings()
	  { return wage * hours; }
}