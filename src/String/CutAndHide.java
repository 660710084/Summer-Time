package String;

import java.util.Scanner;

public class CutAndHide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String seach = sc.nextLine();
        int first = word.indexOf(seach);
        int last = word.lastIndexOf(seach);

        System.out.print(word.charAt(first));
        for (int i = first; i < last; i++){
            if (word.charAt(i) != seach.charAt(0)){
                System.out.print(word.charAt(i));
            }
        }
        System.out.print(word.charAt(last));

    }
}
