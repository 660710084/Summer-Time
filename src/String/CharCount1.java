package String;

import java.util.Scanner;

public class CharCount1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int[] arr = new int[26];

        for (int i = 0; i < word.length(); i++){
            char chareter = word.charAt(i);
            int index = (int) chareter - 'A';
            arr[index] += 1;
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                char c = (char) (i + 'A');
                System.out.print(c + " " + arr[i]);
                System.out.println();
            }
        }

    }
}
