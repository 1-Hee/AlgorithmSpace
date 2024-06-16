package solved._01bronze_5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class boj_7256_2 {
    /**
     * date : 24-06-16
     * time : -
     * memory : 16200 KB
     * speed : 156 ms
     */

    static class Cake {
        public int x, y, z;

        void setX(int x){
            this.x = x;
        }
        void setY(int y){
            this.y = y;
        }
        void setZ(int z){
            this.z = z;
        }
        public Cake(){
            this.x = 0;
            this.y = 0;
            this.z = 0;
        }

       String getValue(){
            return this.x + " " + this.y + " " +this.z;
        }
    }

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("data/boj_7256.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] cakeStrA = br.readLine().split(" ");
        String[] cakeStrC = br.readLine().split(" ");
        Cake cakeA = new Cake();
        Cake cakeB = new Cake();
        Cake cakeC = new Cake();

        for(int i = 0; i < 3 ; i++){
            switch (i){
                case 0:{
                    cakeA.setX(Integer.parseInt(cakeStrA[i]));
                    cakeC.setX(Integer.parseInt(cakeStrC[i]));
                    break;
                }
                case 1: {
                    cakeA.setY(Integer.parseInt(cakeStrA[i]));
                    cakeC.setY(Integer.parseInt(cakeStrC[i]));
                }
                case 2: {
                    cakeA.setZ(Integer.parseInt(cakeStrA[i]));
                    cakeC.setZ(Integer.parseInt(cakeStrC[i]));
                }
            }
        }

        cakeB.setX(cakeC.x - cakeA.z);
        cakeB.setY(cakeC.y / cakeA.y);
        cakeB.setZ(cakeC.z - cakeA.x);

        System.out.println(cakeB.getValue());

    }
}
