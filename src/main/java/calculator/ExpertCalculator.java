package calculator;

public class ExpertCalculator {
    // return index of value in arraylist l
    public double calculate(int first, int second, String opt) {
        if (opt.equals("/")) {
            return ((double) first) / second;
        }
        if (opt.equals("^")) {
            return Math.pow(first, second);
        }
        return -1;
    }
}


