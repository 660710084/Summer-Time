package Array2D;

import java.util.Scanner;

public class Battleship3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[R + 1][C + 1];
        boolean[][] shotarr = new boolean[R + 1][C + 1];
        int AllShip = 0;

        for (int i = 1; i <= R; i++){
            for (int j = 1; j <= C; j++){
                arr[i][j] = sc.nextInt();
                AllShip += arr[i][j];
            }
        }

        int k = sc.nextInt();

        int first = 0;
        int firstmiss = 0;
        int same = 0;
        int samemiss = 0;
        int out = 0;

        int firstHit = -1;
        int lastHit = -1;
        int count = 0;

        for (int i = 0; i < k; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();

            boolean vaildR = (r >= 1) && (r <= R);
            boolean vaildC = (c >= 1) && (c <= C);

            if (!vaildR || !vaildC){
                out += 1;
                continue;
            }

            boolean hit = (arr[r][c] == 1);
            boolean WasHit = shotarr[r][c];

            if (hit){
                if (!WasHit){
                    first += 1;
                    shotarr[r][c] = true;
                    if (firstHit == -1){
                        firstHit = i + 1;
                    }
                    lastHit = i + 1;
                    count += 1;
                }else{
                    same += 1;
                }
            }else{
                if (!WasHit){
                    firstmiss += 1;
                    shotarr[r][c] = true;
                }else{
                    samemiss += 1;
                }
            }
        }

        System.out.println(first);
        System.out.println(firstmiss);
        System.out.println(same);
        System.out.println(samemiss);
        System.out.println(out);

        int ShipRemain = AllShip - count;

        if (ShipRemain > 0){
            System.out.println("battleship " + firstHit);
        }else{
            System.out.println("attacker " + lastHit);
        }
    }
}
