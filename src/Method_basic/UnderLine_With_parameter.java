package Method_basic;

import java.util.Scanner;

public class UnderLine_With_parameter {

    static void underline(int n){

        for (int i = 0; i < n; i++){
            System.out.print("-");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            String word = sc.next();
            int x = sc.nextInt();

            System.out.println(word);
            underline(x);
        }
    }
}
