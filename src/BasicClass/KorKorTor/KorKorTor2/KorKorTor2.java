package BasicClass.KorKorTor.KorKorTor2;

import java.util.Scanner;

class Precinct{

    public String namePrecinct;
    public String[] nameParty;
    public int[] score;

    Precinct(String namePrecinct, String[] nameParty){
        this.namePrecinct = namePrecinct;
        this.nameParty = nameParty;
        this.score = new int[nameParty.length];
    }

    void count(int Number){
        boolean check = false;
        for (int i = 0; i < nameParty.length; i++){
            if (Number == i){
                score[i] += 1;
                check = true;
                System.out.println(nameParty[i] + " " + score[i]);
            }
        }

        if (!check){
            System.out.println("invalid number");
        }
    }

    void printInfo(){
        for (int i = 0; i < nameParty.length; i++){
            System.out.println((i + 1) + " " + nameParty[i] + " " + score[i]);
        }
    }

    void printMax(){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nameParty.length; i++){
            if (score[i] > max){
                max = score[i];
            }
        }

        for (int i = 0; i < nameParty.length; i++){
            if (score[i] == max){
                System.out.println((i + 1) + " " + nameParty[i] + " " + score[i]);
            }
        }
    }

}

public class KorKorTor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namePrecienct = sc.next();
        int n = sc.nextInt();
        String[] partyName = new String[n];

        for (int i = 0; i < n; i++){
            partyName[i] = sc.next();
        }

        Precinct precinct = new Precinct(namePrecienct, partyName);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++){
            int p = sc.nextInt();

            if (p == 1){
                int number = sc.nextInt() - 1;
                precinct.count(number);
            }

            if (p == 2){
                precinct.printInfo();
            }

            if (p == 3){
                precinct.printMax();
            }
        }

    }
}
