public class Car extends RoadVehicle
{
	private String make;
	private String model;
	private double engineSize;
	private String engineType;
	private String reg;
	
	public Car(){
		this("","",0,"","");
	}
	public Car (String m, String mdl, double size, String type, String r){
		setMake(m);
		setModel(mdl);
		setEngineSize(size);
		setEngineType(type);
		setReg(r);
	}
	public Car (String m, String mdl, double size, String type){
		setMake(m);
		setModel(mdl);
		setEngineSize(size);
		setEngineType(type);
		reg = "";
	}
	public void setMake(String m){
		make = m;
	}
	public void setModel(String mdl){
		model = mdl;	
	}
	public void setEngineSize(double size){
		engineSize = size;
	}
	public void setEngineType(String type){
		engineType = type;
	}
	public void setReg(String r){
		reg = r;
	}
	public String getMake(){
		return make;
	}
	public String getModel(){
		return model;
	}
	public double getEngineSize(){
		return engineSize;
	}
	public String getEngineType(){
		return engineType;
	}
	public String getReg(){
		return reg;
	}
	public String toString() {
			
		return "Make: " + this.make
				+ "\n" + "Model: " + this.model + "\n"
				+ "Engine Size: " + this.engineSize + "\n"
				+ "Engine Type: " + this.engineType + "\n"
				+ "Registration: " + this.reg;
		}
}