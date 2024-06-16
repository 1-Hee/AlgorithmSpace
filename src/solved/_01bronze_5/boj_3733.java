package solved._01bronze_5;

import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj_3733 {
    /**
     * date : 24-06-16
     * time : 00 : 05 : 56
     */

    public static void main(String[] args) throws  Exception {
        System.setIn(new FileInputStream(("data/boj_3733.txt")));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while(br.ready()){
            String[] token = br.readLine().split(" ");
            int group = Integer.parseInt(token[0]);
            int sValue = Integer.parseInt(token[1]);
            int divResult = sValue / (group + 1);
            sb.append(divResult).append("\n");
        }
        System.out.println(sb.toString());




    }
}
