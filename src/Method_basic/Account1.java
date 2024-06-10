package Method_basic;

import java.util.Scanner;

public class Account1 {

    static int account(int x){
        int balance = 10000;
        int sum = balance + x;

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int money = account(x);

        System.out.println(money);
    }
}
