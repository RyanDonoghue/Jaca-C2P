public class Hgv extends RoadVehicle
{
	private int cargo;
	
	public Hgv (){
		this(0,0,0);
	}
	public Hgv(int c, int w, int p){
		super(w,p);
		setCargo(c);
	}
	public void setCargo(int c){
		cargo = c;
	}
	public int getCargo(){
		return this.cargo;
	}
}