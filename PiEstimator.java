public class PiEstimator {

    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                throw new IllegalArgumentException("Exactly one argument required");
            }
            int darts = Integer.parseInt(args[0]);
            System.out.println(estimate(darts));
        } catch (NumberFormatException e) {
            System.err.println("Argument must be an integer");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static double estimate(int darts) {

        if (darts < 1) {
            throw new IllegalArgumentException("At least one dart required");
        }
        int count = 0;
        for (int i = 0; i < darts; i++) {
            double x = 2 * Math.random() - 1;
            double y = 2 * Math.random() - 1;
            double r = Math.pow(x, 2) + Math.pow(y, 2);
            if (r < 1) {
                count += 1;
            }

        }
        return ((double)count / darts) * 4.0;
    }

}
