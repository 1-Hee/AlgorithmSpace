package solved._01bronze_5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class boj_1271 {

    /**
     * date : 24-06-16
     * time : 00 : 14 : 14
     */


    public static void main(String[] args) throws  Exception {
        System.setIn(new FileInputStream("data/boj_1271.txt")); // 이클립스 경로상의 테스트 케이스를 불러옴
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] token = br.readLine().split(" ");

        BigInteger total = new BigInteger(token[0]);
        BigInteger people = new BigInteger(token[1]);

        BigInteger unit = total.divide(people);
        BigInteger leftMoney = total.mod(people);

        System.out.println(unit);
        System.out.println(leftMoney);

    }
}
