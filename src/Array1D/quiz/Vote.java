package Array1D.quiz;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int win = 0;

        for (int i = 0; i < k; i++){
            int index = sc.nextInt();
            arr[index-1] += 1;
        }

        for (int i = 0; i < n; i++){
            if (arr[i] > max){
                win = i + 1;
                max = arr[i];
            }
        }

        System.out.println(win);
        System.out.println(max);
    }
}
