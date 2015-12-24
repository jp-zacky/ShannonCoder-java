/**
 * Created by zacky on 2015/12/14.
 */
public class CumulativeValue {
    public Double[] cumulative(Double[] a) {
        Double[] p = new Double[a.length];
        p[0] = 0.0;
        for (int i = 1; i < a.length; i++) {
            p[i] = p[i - 1] + a[i - 1];
            // System.out.println(p[i]);
        }
        return p;
    }
}
