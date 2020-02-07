import java.util.*;
// import java.time.temporal.ChronoUnit;

public class SharedBirthday {

    public static void main(String[] args) {
        try {
            if (args.length != 3) {
                throw new IllegalArgumentException("Exactly three arguments required");
            }

            int people = Integer.parseInt(args[0]);
            int days = Integer.parseInt(args[1]);
            int trials = Integer.parseInt(args[2]);

            System.out.println(probabilityEstimate(people, days, trials));
        } catch (NumberFormatException e) {
            System.err.println("Arguments must all be integers");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static double probabilityEstimate(int people, int days, int trials) {
        //
        // TODO: Do the main work here. I've just returned 0.0 as a place holder
        // so the code compiles. It isn't right though. Remove the return here and
        // implement the whole method on your own.
        //
        if (people < 2) {
          throw new IllegalArgumentException("At least two people required");
        }
        else if (days < 1) {
          throw new IllegalArgumentException("At least one day required");
        } else if (trials < 1) {
          throw new IllegalArgumentException("At least one trial required");
        }
        int count = 0; // initializes the count at 0
        for (int i = 0; i < trials; i++){ // counts the number of trials
          HashSet<Integer> b = new HashSet<Integer>(); // creates a Hashset
          for (int j = 0; j < people; j++){
            boolean doesContain;
            String bDay;
            int day = (int)Math.floor(Math.random() * days); // generate a day
            doesContain = b.contains(day); // takes the boolean value
            if (doesContain == true){
              count += 1; // if it contains (there's a match) then increment
              break;
            } else {
              b.add(day); // add the day to data
            }
          }

        }
        return (double)count / (double)trials;

    }

    //
    // TODO: Don't be afraid to write private helper methods to keep your code modular.
    //
}
