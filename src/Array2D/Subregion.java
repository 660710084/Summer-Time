package Array2D;

import java.util.Scanner;

public class Subregion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[R][C];

        int P = sc.nextInt() - 1;
        int Q = sc.nextInt() - 1;

        int H = sc.nextInt();
        int W = sc.nextInt();

        int start_r = P;
        int stop_r = P + (H - 1);

        int start_c = Q;
        int stop_c = Q + (W - 1);

        if (start_r < 0 || stop_r >= R || start_c < 0 || stop_c >= C){
            System.out.println("invalid input");
            return;
        }

        for (int i = start_r; i <= stop_r; i++){
            for (int j = start_c; j <= stop_c; j++){
                arr[i][j] = 1;
            }
        }

        for (int i = 0; i < R; i++){
            for (int j = 0; j < C; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
     }
}
