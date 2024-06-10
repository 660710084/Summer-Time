package Method_basic;

import java.util.Scanner;

public class Account3 {

    static int deposit(int x){
        int balance = 10000;
        int sum = balance + x;

        if (x > 0){
            return 0;
        }else{
            return -1;
        }
    }

    static int account(int x){
        return 10000 + x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int check = deposit(x);

        if (check == 0){
            System.out.println(account(x));
        }else{
            System.out.println("Error");
        }
    }
}
