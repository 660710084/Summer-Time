package testfromgit;

import java.util.Scanner;

public class what {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();

        if (x.length() == 0){
            x = null;
        }

        System.out.println(x);
    }
}
