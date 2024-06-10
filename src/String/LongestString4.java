package String;

import java.util.Scanner;

public class LongestString4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        String long_word = "";
        boolean check = false;

        while (!check) {
            String word = sc.nextLine();

            if (word.length() == 0){
                check = true;
            }

            if (word.length() >= max){
                max = word.length();
                long_word = word;
            }

        }

        System.out.println(long_word);

    }
}
