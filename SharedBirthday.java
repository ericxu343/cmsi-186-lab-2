import java.util.HashSet;
import java.util.Random;

public class SharedBirthday {

    private static Random random = new Random();

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
        if (people < 2) {
            throw new IllegalArgumentException("At least two people required");
        }
        else if (days < 1) {
            throw new IllegalArgumentException("At least one day required");
        } else if (trials < 1) {
            throw new IllegalArgumentException("At least one trial required");
        }
        int count = 0;
        for (int i = 0; i < trials; i++) {
          if (areThereAnySharedBirthdays(people, days)) {
            count += 1;
          }
        }
        return ((double)count / trials);
    }

    private static boolean areThereAnySharedBirthdays(int people, int days) {
      var birthdays = new HashSet<Integer>();
      for (int i = 0; i < people; i++) {
        int birthday = random.nextInt(days);
        if (birthdays.contains(birthday)) {
          return true;
        }
        birthdays.add(birthday);
      }
      return false;
    }

}
