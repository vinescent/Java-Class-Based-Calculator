public class ScientificCalculator extends StandardCalculator {
    @Override
    public String format(double x) {
        if (!Double.isFinite(x)) {                              // Checks for NaN or Infinity
            return String.valueOf(x);
        }

        String[] parts = String.format("%.3e", x).split("e");   //Splits into first part and exponent
        int exponent = Integer.parseInt(parts[1]);              //Pulls the exponent and stores as an integer.

        return parts[0] + " * 10^" + exponent;                  // Returns the first part and exponent in scientific notation format
    }
}