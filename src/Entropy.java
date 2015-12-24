/**
 * Created by zacky on 2015/12/16.
 */
public class Entropy {
    public Double entropy(Double[] s) {
        Double e = 0.0;
        for (int i = 0; i < s.length; i++) {
            e += s[i] * (-1 * (Math.log(s[i]) / Math.log(2.0)));
        }
        return e;
    }
}
