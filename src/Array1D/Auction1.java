package Array1D;

import java.util.Scanner;

public class Auction1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                int x = sc.nextInt();

                if (arr[j] < x){
                    arr[j] = x;
                }

                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
