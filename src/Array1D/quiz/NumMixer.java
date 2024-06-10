package Array1D.quiz;

import java.util.Scanner;

public class NumMixer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int count = n-1;

        if (x > 0){
            for (int i = 0; i < n; i++){
                System.out.print(arr1[i] + " ");
                System.out.print(arr2[count - i] + " ");
            }
        }else{
            for (int i = 0; i < n; i++){
                System.out.print(arr2[count - i] + " ");
                System.out.print(arr1[i] + " ");
            }
        }

    }
}
