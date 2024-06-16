package solved._01bronze_5;

import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj_9086 {

    /**
     * date : 24-06-16
     * time : 00 : 05 : 23
     */

    // 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램
    public static void main(String[] args) throws  Exception {
        System.setIn(new FileInputStream("data/boj_9086.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int case_num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < case_num ; i++){
            String sentence = br.readLine();
            sb.append(sentence.charAt(0));
            sb.append(sentence.charAt(sentence.length()-1));
            sb.append("\n");
        }

        System.out.println(sb.toString());

    }
}
