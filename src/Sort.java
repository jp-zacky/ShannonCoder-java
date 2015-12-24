/**
 * Created by zacky on 2015/12/07.
 */
public class Sort {
    public Double[] upSort(Double[] s) {
        Double[] a = s;
        Double tmp;

        for (int i = 0; i < a.length; ++i) {
            for (int j = i + 1; j < a.length; ++j) {
                if (a[i] < a[j]) {

                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;

                }
            }
        }

        return a;
    }

    public int[] sToa(Double[] s){
        int[] num = new int[s.length];
        int tmp2;

        for (int j=0;j<s.length;j++)
            num[j] = j;

        for (int i = 0; i < s.length; ++i) {
            for (int j = i + 1; j < s.length; ++j) {
                if (s[i] < s[j]) {

                    tmp2 = num[i];
                    num[i] = num[j];
                    num[j] = tmp2;

                }
            }
        }

        return num;
    }
}
