public class RoadVehicle {
	private int wheels;
	private int passengers;
	
	//constructors
	
	public RoadVehicle(){
		this(0,0);
	}
	public RoadVehicle(int w, int p){
		setWheels(w);
		setPass(p);
	}
	
	//setters
	
	public void setWheels(int w){
		wheels = w;
	}
	public void setPass (int p){
		passengers = p;
	}
	
	//getters
	
	public int getWheels(){
		return wheels;
	}
	public int getPass(){
		return passengers;
	}
	

}
