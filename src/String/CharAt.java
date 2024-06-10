package String;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int seach = sc.nextInt()-1;

        if (seach >= 0 && seach < word.length()){
            System.out.println(word.charAt(seach));
        }else{
            System.out.println("invalid position");
        }
        
    }
}
