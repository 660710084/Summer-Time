package Array2D;

import java.util.Scanner;

public class NumTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[R + 1][C + 1];
        
        for (int i = 1; i <= R; i++){
            for (int j = 1; j <= C; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();
        int prev = -1;

        for (int i = 0; i < k; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();

            boolean vaildR = (r >= 1) && (r <= R);
            boolean vaildC = (c >= 1) && (c <= C);

            if (vaildR && vaildC){
                if (prev != arr[r][c]){
                    System.out.print(arr[r][c]);
                }else{
                    System.out.print("*");
                }
                prev = arr[r][c];
            }else{
                if (prev != -1){
                    System.out.println();
                }
                prev = -1;
            }
        }
    }
}
