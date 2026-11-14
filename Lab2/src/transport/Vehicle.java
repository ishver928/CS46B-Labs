package transport;

public class Vehicle {
    private int nWheels;
    private double xPosition; 
    private double yPosition; 

    public Vehicle(int nWheeels){
        this.nWheels = nWheeels;
        System.out.println("Vehicle constructor");
    }

    public int getNWheels(){
        return nWheels;
    }

    public double getXPosition(){
        return xPosition;
    }

    public double getYPosition(){
        return yPosition;
    }

    public void setXPosition(double xPosition){
        this.xPosition = xPosition;
    }

    public void setYPosition(double yPosition){
        this.yPosition = yPosition;
    }

    public void setNWheels(int nWheels){
        this.nWheels = nWheels;
    }

    public void setPosition(double xPosition, double yPosition){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void changePosition(double xDistance, double yDistance){
        this.xPosition += xDistance;
        this.yPosition += yDistance;
    }

    @Override 
    public String toString(){
        return "Vehicle with " + nWheels + " wheels at position (" + xPosition + ", " + yPosition + ")";
    }


    
   
}
