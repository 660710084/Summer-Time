package Array2D;

import java.util.Scanner;

public class Battleship2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int k = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < k; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();

            boolean vaildR = (r >= 1) && (r <= R);
            boolean vaildC = (c >= 1) && (c <= C);

            if (!vaildR || !vaildC){
                out += 1;
            }else{
                in += 1;
            }
        }

        System.out.println(in);
        System.out.println(out);

    }
}
