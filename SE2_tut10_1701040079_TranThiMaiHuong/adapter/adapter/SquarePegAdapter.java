package tuts.tut10.to_dos.adapter.adapter;

import tuts.tut10.to_dos.adapter.round.RoundPeg;
import tuts.tut10.to_dos.adapter.square.SquarePeg;

/**
 * Adapter allows fitting square pegs into round holes.
 */
public class SquarePegAdapter extends RoundPeg {

    //TO-DO: Declare an attribute: name = peg, type = SquarePeg

    protected SquarePeg ped;

    //TO-DO: Declare the constructor with a parameter

    public SquarePegAdapter(SquarePeg ped) {
        this.ped = ped;
    }

    //TO-DO: Implement getRadius() method

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        //TO-DO: result = Square Root [(getRadius() of SquarePeg/2)^2) * 2)]
        result = Math.sqrt((Math.pow((ped.getSquare())/2, 2))*2);
        return result;
    }
}
