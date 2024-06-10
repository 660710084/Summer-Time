package From_at_to_C;

import java.util.Scanner;

public class reserve_3_vans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int A = 0, B = 0, C = 0;

        for (int i = 0; i < n; i++){
            int x = sc.nextInt();

            if (A <= B && A <= C){
                System.out.println("A");
                A += x;
            }else if (B <= A && B <= C){
                System.out.println("B");
                B += x;
            }else{
                System.out.println("C");
                C += x;
            }
        }
    }
}
