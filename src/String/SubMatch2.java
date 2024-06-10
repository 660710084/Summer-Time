package String;

import java.util.Scanner;

public class SubMatch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String seach = sc.nextLine();

        for (int i = 0; i < seach.length() - 2; i++){
            String x = seach.substring(i, i+3);
            int index = word.indexOf(x);

            if (index == -1){
                System.out.println("No");
            }else{
                System.out.println(index + 1);
            }
        }
    }
}
