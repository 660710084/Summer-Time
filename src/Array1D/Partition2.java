package Array1D;

import java.util.Scanner;

public class Partition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        int count = 0;
        int mid = n/2;

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            if (arr[i] <= arr[mid]){
                arr2[count] = arr[i];
                count += 1;
            }
        }

        for (int i = 0; i < count; i++){
            if (arr2[i] <= arr2[count/2]){
                System.out.print(arr2[i] + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < count; i++){
            if (arr2[i] > arr2[count/2]){
                System.out.print(arr2[i] + " ");
            }
        }
    }
}
