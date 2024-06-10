package Array1D.quiz;

import java.util.Scanner;

public class Box1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] box1 = new int[n];
        int[] box2 = new int[n];

        for (int i = 0; i < n; i++){
            box1[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        for (int i = 0; i < k; i++){
            int X = sc.nextInt();
            int Q = sc.nextInt();
            int B = sc.nextInt()-1;
            
            if (X == 1){
                if (box2[B] + Q <= box1[B]){
                    box2[B] += Q;
                    System.out.println(box2[B]);
                    continue;
                }
            }
            if (X == 2){
                if (box2[B] - Q >= 0){
                    box2[B] -= Q;
                    System.out.println(box2[B]);
                    continue;
                }
            }
            System.out.println(-1);

        }
    }
}