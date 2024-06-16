package solved._01bronze_5;

import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
public class boj_10807 {
    /**
     * date : 24-06-16
     * time : 00 : 07 : 46
     */

    /*
    총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
    첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다.
    셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
     */

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("data/boj_10807.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        String[] token = br.readLine().split(" ");
        for(int i = 0 ; i < length; i++){
            int number = Integer.parseInt(token[i]);
            int count = countMap.getOrDefault(number, 0);
            countMap.put(number, count+1);
        }
        int findNumber = Integer.parseInt(br.readLine());
        System.out.println(countMap.getOrDefault(findNumber, 0));



    }
}
