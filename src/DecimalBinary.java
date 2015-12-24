/**
 * Created by zacky on 2015/12/14.
 */
public class DecimalBinary {
    public String decimalBinary(Double p, int digit){
        int b;
        String result = "";
        for(int i=0; i<digit;i++){
            b = (int)(p * 2);
            result = result + Integer.toString(b);

            if(b == 1){
                p = p * 2.0 - 1.0;
            }else {
                p = p * 2.0;
            }
        }
        return result;
    }

    public String[] decimalBinarys(Double[] p, int[] dits){
        String[] db = new String[p.length];
        for (int i =0;i<p.length;i++){
            db[i] = decimalBinary(p[i], dits[i]);
            // System.out.println(db[i]);
        }
        return db;
    }
}
