package scenariobasedproblems;

import java.util.HashSet;
import java.util.Set;

public class BusSeatAllotmentSimulator {

    public static void main(String[] args) {

        int[] ticketsWantsBook = {3, 5, 12, 5, 11};

        Set<Integer> reservedSeats = new HashSet<Integer>();

        for(int seat : ticketsWantsBook)
        {
            if(seat < 1 || seat > 40)
                System.out.println("Seat "+seat+" Invalid");

            if(reservedSeats.contains(seat))
            {
                System.out.println("Seat "+ seat +" Already Booked ");
            }

            if(reservedSeats.add(seat))
                System.out.println("Seat " + seat + " Booked");

        }


    }

}
