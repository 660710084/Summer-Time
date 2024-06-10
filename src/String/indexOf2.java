package String;

import java.util.Scanner;

public class indexOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String seach = sc.nextLine();
        int x = word.indexOf(seach);

        if (x == -1){
            System.out.println("string not found");
        }

        while (x != -1) {
            
            if (x >= 0){
                System.out.print(x + 1 + " ");
                x = word.indexOf(seach, x + 1);
            }

        }

    }
}
