package Array1D.quiz;

import java.util.Scanner;

public class Calcurator_V1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        boolean check = false;
        int count = 0;

        for (int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }

        while (!check){

            int x = sc.nextInt();

            if (x == 0){
                check = true;
            }

            if (x > 0){
                int y = sc.nextInt();
                int z = sc.nextInt();

                if (y < 0 || y >= arr1.length || z < 0 || z >= arr1.length){
                    System.out.println("error");
                }else{
                    arr2[count] = arr1[y] + arr1[z];
                    System.out.println(arr2[count]);
                    count += 1;
                }

            }
        }

        int sum = 0;

        for (int i = 0; i < count; i++){
            System.out.print(arr2[i] + " ");
            sum += arr2[i];
        }
        System.out.println();
        System.out.println(sum);
    }
}