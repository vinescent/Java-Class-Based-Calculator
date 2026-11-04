public class ScientificCalculator extends StandardCalculator {
    @Override
    public String format(double x) {
        return String.format("%.3e", x);
    } 
}