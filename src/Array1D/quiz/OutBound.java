package Array1D.quiz;

import java.util.Scanner;

public class OutBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean check = false;

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min = sc.nextInt();
        int max = sc.nextInt();

        for (int i = 0; i < n; i++){
            if (arr[i] < min || arr[i] > max){
                System.out.print(arr[i] + " ");
                check = true;
            }
        }

        if (!check){
            System.out.println("no data");
        }

    }
}
