package String;

import java.util.Scanner;

public class CharCount2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];
        int max = sc.nextInt();
        sc.nextLine();
        int count = 0;

        while (true) {
            String word = sc.nextLine();
            count += 1;
            for (int i = 0; i < word.length(); i++){
                char c = word.charAt(i);
                int index = c - 'A';
                arr[index] += 1;
                if (arr[index] == max){
                    System.out.println(c);
                    System.out.println(count);
                    return;
                }
            }
        }
    }
}
