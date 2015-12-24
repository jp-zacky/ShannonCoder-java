/**
 * Created by zacky on 2015/12/14.
 */
public class Digit {
    public int digit(Double a) {
        return (int) (-1 * (Math.log(a) / Math.log(2.0))) + 1;
    }

    public int[] digits(Double[] a) {
        int[] ds = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            ds[i] = digit(a[i]);
        }
        return ds;
    }

    public double averageDigit(Double[] a, int[] dits) {
        double ad = 0.0;
        for (int i = 0; i < a.length; i++) {
            ad = ad + a[i] * dits[i];
        }
        return ad;
    }
}
