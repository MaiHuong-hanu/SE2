package tuts.tut10.to_dos.adapter;

import tuts.tut10.to_dos.adapter.adapter.SquarePegAdapter;
import tuts.tut10.to_dos.adapter.round.RoundHole;
import tuts.tut10.to_dos.adapter.round.RoundPeg;
import tuts.tut10.to_dos.adapter.square.SquarePeg;

/**
 * Somewhere in client code...
 */
public class Demo {

    public static void main(String[] args) {
        //TO-DO: Create 2 instances of RoundHole and RoundPeg with same radius
        RoundHole rHole = new RoundHole(3);
        RoundPeg rPeg = new RoundPeg(3);

        //TO-DO: If RoundHole instance can "fits" with RoundPeg instance => show a message
        if (rHole.fits(rPeg)) {
            System.out.println("fit");
        } else {
            System.out.println("not fit");
        }
        //TO-DO: Create 2 instances of SquarePeg with 2 different widths
        SquarePeg sPeg1 = new SquarePeg(2);
        SquarePeg sPeg2 = new SquarePeg(4);
        //Note: You can't make RoundHole instance "fit" with SquarePeg instance
        //Therefore, we need to use Adapter for solving the problem.
        //TO-DO: Create 2 corresponding instances of SquarePegAdapter  
        SquarePegAdapter adapter1 = new SquarePegAdapter(sPeg1);
        SquarePegAdapter adapter2 = new SquarePegAdapter(sPeg2);
//TO-DO: If the RoundHole instance can "fits" with "small" RoundPegAdapter instance 
        //show a suitable message
        if (rHole.fits(adapter1)) {
            System.out.println("fit");
        } else {
            System.out.println("not fit");
        }
        //TO-DO: If the RoundHole instance can not "fits" with "big" RoundPegAdapter instance 
        //show a suitable message
        if (rHole.fits(adapter2)) {
            System.out.println("fit");
        } else {
            System.out.println("not fit");
        }
    }
}
