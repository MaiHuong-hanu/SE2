package tuts.tut10.to_dos.adapter.square;

/**
 * SquarePegs are not compatible with RoundHoles (they were implemented by
 * previous development team). But we have to integrate them into our program.
 */
public class SquarePeg {

    //TO-DO: Declare an attribute: name = width, type = double

    protected double width;

    //TO-DO: Declare the constructor with a parameter

    public SquarePeg(double width) {
        this.width = width;
    }

    //TO-DO: Implement getWidth() method

    public double getWidth() {
        return width;
    }

    //TO-DO: Implement getSquare() method
    public double getSquare() {
        double result;
        //TO-DO: result = width^2
        result = Math.pow(width, 2);
        return result;
    }
}
