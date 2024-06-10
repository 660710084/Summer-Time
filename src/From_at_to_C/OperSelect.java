package From_at_to_C;

import java.util.Scanner;

public class OperSelect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (z == 1){
            System.out.println(x+y);
        }

        if (z == 2){
            System.out.println(x-y);
        }

        if (z == 3){
            System.out.println(x*y);
        }

        if (z == 4){
            if (y == 0){
                System.out.println("cannot divide by zero");
            }else{
                System.out.println(x/y);
            }
        }

        if (z == 5){
            if (y == 0){
                System.out.println("cannot divide by zero");
            }else{
                System.out.println(x%y);
            }
        }
    }
}
