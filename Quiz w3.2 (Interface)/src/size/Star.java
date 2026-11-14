package size;

public class Star implements Matter{
	
	private double mass; // the unit of mass is Kilograms
	
	Star(double mass){
    	// the unit of mass is Kilograms
		this.mass = mass;
	}
	
	public double getMassKgs() {
		return mass;
	}
	
	public double getWeightPounds() {
		return mass/2.2;
	}
	
}
