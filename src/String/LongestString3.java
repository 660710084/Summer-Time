package String;

import java.util.Scanner;

public class LongestString3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        String long_word = "";

        for (int i = 0; i < 5; i++){
            String word = sc.nextLine();

            if (word.length() >= max){
                max = word.length();
                long_word = word;
            }
        }

        System.out.println(long_word);

    }
}
