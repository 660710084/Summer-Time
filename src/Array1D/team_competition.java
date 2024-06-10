package Array1D;

import java.util.Scanner;

public class team_competition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int sumA = 0, sumB = 0;

        for (int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            if (A[i] > B[i]){
                sumA += 2;
            }else if(A[i] == B[i]){
                sumA += 1;
                sumB += 1;
            }else{
                sumB += 2;
            }
        }

        if (sumA > sumB){
            System.out.println("Team 1 wins");
            System.out.println("Score "+ sumA + " to " + sumB);
        }else if (sumA == sumB){
            System.out.println("Draw game");
            System.out.println("Score "+ sumA + " to " + sumB);
        }else{
            System.out.println("Team 2 wins");
            System.out.println("Score "+ sumB + " to " + sumA);
        }
    }
}
