package Method_basic;

import java.util.Scanner;

public class Account2 {

    static void account(int x){
        int balance = 10000;
        int sum = balance + x;

        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        account(x);
    }
}
