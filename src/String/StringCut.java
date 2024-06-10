package String;

import java.util.Scanner;

public class StringCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String seach = sc.nextLine();
        int x = word.indexOf(seach);
        int first = 0;
        int r = word.length();
        boolean check = false;

        if (x == -1){
            System.out.println("no target character found");
            return;
        }

        while (x != -1) {
            
            String sub = word.substring(first, x);

            if (sub.length() > 0){
                System.out.println(sub);
                check = true;
            }

            first = x + 1;
            x = word.indexOf(seach, x + 1);

        }

        String sub = word.substring(first, r);

        if (sub.length() > 0){
            System.out.println(sub);
            check = true;
        }

        if (!check){
            System.out.println("no output");
        }

    }
}
