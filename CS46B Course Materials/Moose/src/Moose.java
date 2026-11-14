//HIDE
import java.util.HashSet;

// use Is-A relationship

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Moose implements Comparable<Moose> {
	private String title;
	private double age;
    private float numberOfSisters;
  	public Moose(String title, double age, float numberOfSisters) {
     	// Finish this.
	  	this.title = title;
	  	this.age = age;
	  	this.numberOfSisters = numberOfSisters;
  	}
  	public String getTitle() {
     // Finish this.
	  return title;
  	}

  	public double getAge() {
     // Finish this.
	  return age;
  	}
  	public float getNumberOfSisters() {
     // Finish this.
	  return numberOfSisters;
  	}
  
  	@Override
  	public boolean equals(Object o) {
		return this.compareTo((Moose) o ) ==0 ;
  	}
  
  @Override
  public int hashCode() {
	  return (int)(age + numberOfSisters);
  }
  
  @Override
  public int compareTo(Moose x) {
		int ans = this.title.compareTo(x.getTitle()) ;
		if ( ans ==0 ) {
			ans = Double.compare ( this.age, x.age ) ;
		}
		if ( ans == 0 ) {
			ans=Double.compare(this.numberOfSisters,x.numberOfSisters ) ;
		}
		return ans;
  }

	@Override
	public String toString () {
		return getTitle() + ": age=" + age + ", num sibling = " + numberOfSisters ;
		
	}


}

class Herd1 extends HashSet<Moose> {

}


// use Has-A relationship
class Herd2 {
	private HashSet<Moose> herd = new HashSet<Moose>();
	
	public boolean add(Moose x) {
		return herd.add(x);
	}
	
	public boolean contains(Moose x) {
		return herd.contains(x);
	}
	
	public ArrayList<Moose> getSorted(){
		TreeSet<Moose> sorted = new TreeSet<Moose>(herd);
		return new ArrayList<Moose>(sorted);
	}
	public int size() {
		return herd.size();
	}
}
//EDIT
