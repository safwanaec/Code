import java.math.RoundingMode;
import java.text.DecimalFormat;

public class tests {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.#######");
        df.setRoundingMode(RoundingMode.HALF_EVEN);
        double[] num = {33.9996999,34.000010001};

        System.out.println(df.format(num[0])+" "+df.format(num[1]));
    }
}
