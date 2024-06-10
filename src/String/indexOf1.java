package String;

import java.util.Scanner;

public class indexOf1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String seach = sc.nextLine();
        int x = word.indexOf(seach);

        if (x >= 0){
            System.out.println(x + 1);
        }else{
            System.out.println("string not found");
        }
        
    }
}
