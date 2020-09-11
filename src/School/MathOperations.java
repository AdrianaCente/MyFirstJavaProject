package School;

import java.text.NumberFormat;

public class MathOperations {
    public int mathCalculus() {
        int result = (int)Math.round(2.4);
        int res = (int)(Math.random() * 100) - result;
        return res;
    }
    public String formatNumbers() {
        String percentOne = NumberFormat.getPercentInstance().format(0.23);
        return percentOne;
    }
}
