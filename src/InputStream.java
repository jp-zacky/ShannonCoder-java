import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 * Created by zacky on 2015/12/07.
 */
public class InputStream {
    public Double[] inputStream() {
        ArrayList<Double> s = new ArrayList<Double>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        Double check_sum = 0.0;

        int i = 0;
        while (true) {
            System.out.println("S" + (i + 1) + " の確立(小数)を入力してください (qで終了)");
            try {
                line = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (line.equals("q")) break;
            s.add(Double.parseDouble(line));
            check_sum += s.get(i);
            // System.out.println(check_sum);
            i++;
            if (check_sum >= 1.0) break;
        }
        /*
        if (check_sum > 1.0) {
            System.out.println("ERROR: 確率の合計は1.0でないといけません");
            System.exit(-1);
        }
        */


        Double[] result = new Double[i];
        for (int j = 0; j < i; j++) {
            result[j] = s.get(j);
        }

        return result;
    }

    public Double[] inputStreamFraction() {
        ArrayList<Double> s = new ArrayList<Double>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        Double check_sum = 0.0;
        String[] frac = new String[2];

        System.out.println("例）1/32　と入力　");
        int i = 0;
        while (true) {
            System.out.println("S" + (i + 1) + " の確立(分数)を入力してください (qで終了)");
            try {
                line = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (line.equals("q")) break;
            frac = line.split("/", 0);
            s.add(Double.parseDouble(frac[0]) / Double.parseDouble(frac[1]));
            check_sum += s.get(i);
            i++;
            if (check_sum == 1.0) break;
        }

        Double[] result = new Double[i];
        for (int j = 0; j < i; j++) {
            result[j] = s.get(j);
        }

        return result;
    }

    public Double[] mode() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        System.out.println("モードを選択してください (f: 分数モード, d: 小数モード)");
        try {
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(line.equals("d")){
            Double[] s = inputStream();
            return s;
        }else if(line.equals("f")){
            Double[] s = inputStreamFraction();
            return s;
        }else{
            System.out.println("ERROR: モードは f か d です");
            System.exit(-1);
        }
        Double[] bad = null;
        return bad;
    }
}
