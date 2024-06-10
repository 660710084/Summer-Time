package Array1D;

import java.util.Scanner;

public class Number_Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean check = false;

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for (int i = 0; i < n; i++){
            if (x == arr[i]){
                check = true;
                System.out.print((i+1) + " ");
            }
        }

        if (!check){
            System.out.println(0);
        }
    }
}
