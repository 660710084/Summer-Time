package From_at_to_C;

import java.util.Scanner;

public class odd_vs_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even = 0, odd = 0;

        for (int i = 0; i < 8; i++){
            int x = sc.nextInt();

            if (x % 2 == 0){
                even += x;
            }else{
                odd += x;
            }
        }

        if (even > odd){
            System.out.println("even");
            System.out.println(even);
            System.out.println(odd);
        }else if (even == odd){
            System.out.println("equal");
            System.out.println(even);
            System.out.println(odd);
        }else{
            System.out.println("odd");
            System.out.println(even);
            System.out.println(odd);
        }
    }
}
