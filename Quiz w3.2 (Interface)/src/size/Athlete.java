package size;

public class Athlete implements Matter, Height{

	private double weight; 
	private double height; 
// the unit of weight is pound // xxx add field inches


   // xxx modify the constructor so it takes in two arguments: weight and height
	Athlete(double weight, double height){
		// the unit of weight is pound
		this.weight = weight;
		this.height = height;
	}
	
	public double getMassKgs() {
		return weight*0.454;
	}
	
	public double getWeightPounds() { // the unit of weight is pound
		return weight;
	}

    // xxx add method getHeightInches()
	public double getHeightInches() {
		return height;
	}
    // xxx add method getHeightCentimeters()
	public double getHeightCentimeters() {
		return height*2.54;
	}
    // xxx add method getMinHeight()
	public static double getMinHeight(Athlete[] team) {
		double minHeight = team[0].getHeightInches();
		for(int i=1; i<team.length; i++) {
			if(team[i].getHeightInches() < minHeight) {
				minHeight = team[i].getHeightInches();
			}
		}
		return minHeight;
	}
	// xxx use the following for testing the above new methods


      public static void main ( String args[] ) {
          Athlete[] team = new Athlete[3];
           team[0] = new Athlete(220, 72);
           team[1] =  new Athlete(100, 58);
           team[2] = new Athlete(165,68);
           System.out.println(getMinHeight(team));
      }



	
	
}
