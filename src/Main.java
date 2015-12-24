
/**
 * Created by zacky on 2015/11/30.
 */
class Main {
    public static void main(String args[]) {
        // 入力
        InputStream is = new InputStream();
        Double[] s = is.mode();

        // エントロピー
        Entropy e = new Entropy();
        System.out.println("エントロピー: " + e.entropy(s));

        // ソート
        Sort st = new Sort();
        int[] sta = st.sToa(s);
        Double[] a = st.upSort(s);

        // 累計値
        CumulativeValue cv = new CumulativeValue();
        Double[] p = cv.cumulative(a);

        // 桁数・平均符号長
        Digit d = new Digit();
        int[] dits = d.digits(a);
        System.out.println("平均符号長: " + d.averageDigit(a, dits));

        // ２進数展開
        DecimalBinary db = new DecimalBinary();
        String[] code = db.decimalBinarys(p, dits);

        for (int i = 0; i < code.length; i++) {
            System.out.println("S" + (sta[i] + 1) + ": " + code[i]);
        }

    }
}
