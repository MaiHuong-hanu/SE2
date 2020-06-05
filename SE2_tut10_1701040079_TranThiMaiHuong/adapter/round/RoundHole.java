package tuts.tut10.to_dos.adapter.round;

/**
 * RoundHoles are compatible with RoundPegs.
 */
public class RoundHole {
	//TO-DO: Declare an attribute: name = radius, type = double
    protected double radius;
	//TO-DO: Declare the constructor with a parameter
    public RoundHole(double r){
        this.radius = r;
    }
	//TO-DO: Implement getRadius() method
	public double getRadius() {
		return radius;
	}

	//TO-DO: Implement fits() method
	public boolean fits(RoundPeg peg) {
//		boolean result;
		//if getRadius() of RoundHole >= getRadius() of RoundPeg => return true
		//else return false
		return this.getRadius() >= peg.getRadius();
//		return result;
	}
}
