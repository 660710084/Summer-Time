package Recursion;

import java.util.Scanner;

public class RemoveAnyDup {

    String RemoveAnyDup(String str){
        int L = str.length();

        if (L <= 1){
            return str;
        }

        String last = str.substring(L - 1, L);
        String n_str = str.substring(0, L - 1);

        int index = n_str.indexOf(last);
        String ans = RemoveAnyDup(n_str);

        if (index == -1){
            ans += last;
        }

        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        RemoveAnyDup remover = new RemoveAnyDup();
        String result = remover.RemoveAnyDup(str);
        System.out.println(result);

    }
}
