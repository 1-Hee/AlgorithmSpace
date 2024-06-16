package solved._01bronze_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class boj_7256 {
    /**
     * date : 24-06-16
     * time : 00 : 12 : 51
     * memory : 14208 KB
     * speed : 128 ms
     */

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("data/boj_7256.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] cakeA = br.readLine().split(" ");
        String[] cakeC = br.readLine().split(" ");
        int[] arrA = new int[3];
        int[] arrB = new int[3];
        int[] arrC = new int[3];

        for(int i = 0; i < 3; i ++){
            int aValue = Integer.parseInt(cakeA[i]);
            int cValue = Integer.parseInt(cakeC[i]);
            arrA[i] = aValue;
            arrC[i] = cValue;
        }

        arrB[0] = arrC[0] - arrA[2];
        arrB[1] = arrC[1]/arrA[1];
        arrB[2] = arrC[2] - arrA[0];

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < 3 ; i++){
            sb.append(arrB[i]).append(" ");
        }
        System.out.println(sb.toString());

    }
}
