public class PiEstimator {

    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                throw new IllegalArgumentException("Exactly one argument required");
            }
            //
            // TODO: Parse the command line argument and call your estimate function
            int darts = Integer.parseInt(args[0]);
            System.out.println(estimate(darts)); //checking if this 1000000 is a valid argument
        } catch (NumberFormatException e) {
            //
            // TODO: Take care of a possible non-integer argument.
            System.err.println("Argument must be an integer");
            //
        } catch (IllegalArgumentException e) {
            //
            // TODO: Take care of the exception you threw above.
            System.err.println(e.getMessage());
            //
        }
    }

    public static double estimate(int darts) {
       if (darts < 1) {
         throw new IllegalArgumentException("At least one dart required");
       }
        //
        // TODO: Do the main work here. I've just returned 0.0 as a place holder
        // so the code compiles. It isn't right though. Remove the return here and
        // implement the whole method on your own.
        //
        int count = 0;
      //  int radius = 1; // radius is 1
        double proportion;
        double estimate;


        for(int i = 0; i < darts; i++) {
          double x = 2*Math.random() - 1; // generates an x value from 0 to 1
          double y = 2*Math.random() - 1; // generates a y value from 0 to 1
          double r = Math.pow(x, 2) + Math.pow(y, 2);
          double radius = 1;
          // double X_square = Math.pow(x, 2); // (0,0) is the center
          // double Y_square = Math.pow(y, 2); // (o,0) is the center
          // double distance = Math.sqrt(X_square + Y_square); //calculates the distance
          //if (Math.hypot(Math.random(), Math.random <= 1))
        //  double proportion;
        //  double estimate;

        /*  if (distance < radius) { // checks to see if the point is in the radius
            count += 1; // increment in the count when it is in circle
          //  System.out.println(count);
        } */
          if (r < radius) {
            count += 1;
          }

        //  proportion = (double)count / i; // finds the proportion of bullseye to total
          // estimate = 4 * proportion; // estimate PI

          }
        proportion = (double)count/ darts;
        estimate = 4 * proportion; // estimate PI
        System.out.println(count);
      //  proportion = (double)count/ darts;
      //  estimate = 4 * proportion; // estimate PI
        System.out.println(estimate);
        return estimate;

    }

    //
    // Don't be afraid to put in some private "helper" methods. You don't have to, of
    // course, but they could be useful and keep your code modular.
    //
}
