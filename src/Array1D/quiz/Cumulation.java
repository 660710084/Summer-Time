package Array1D.quiz;

import java.util.Scanner;

public class Cumulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt()-1;
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < k; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            for (int j = x-1; j < y; j++){
                arr[j] += z;
            }

            for (int a = 0; a < n; a++){
                System.out.print(arr[a] + " ");
            }
            System.out.println();
        }
    }
}
