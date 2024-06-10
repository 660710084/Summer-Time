package String;

import java.util.Scanner;

public class LongestCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean check = false;
        int max = Integer.MIN_VALUE;
        int count = 0;


        while (!check) {
            String word = sc.nextLine();

            if (word.length() == 0){
                check = true;
            }

            if (word.length() > max){
                max = word.length();
                count = 0;
            }

            if (max == word.length()){
                count += 1;
            }

        }

        System.out.println(max);
        System.out.println(count);

    }
}
