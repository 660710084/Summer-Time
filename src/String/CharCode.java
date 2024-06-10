package String;

import java.util.Scanner;

public class CharCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        char c = word.charAt(0);
        int chareter = (int) c;

        System.out.println(chareter);

    }
}
