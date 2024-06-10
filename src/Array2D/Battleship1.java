package Array2D;

import java.util.Scanner;

public class Battleship1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[R][C];

        for (int i = 0; i < R; i++){
            for (int j = 0; j < C; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();

        System.out.println(k);

        for (int i = 0; i < R; i++){
            for (int j = 0; j < C; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
