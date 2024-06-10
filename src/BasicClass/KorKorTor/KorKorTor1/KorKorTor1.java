package BasicClass.KorKorTor.KorKorTor1;

import java.util.Scanner;

class Party{

    public String nameParty;
    public int numMember;
    public String[] firstName;
    public String[] lastName;
    public int[] countyNum;

    Party(String nameParty, int numMember, Scanner sc){
        this.nameParty = nameParty;
        this.numMember = numMember;
        firstName = new String[numMember];
        lastName = new String[numMember];
        countyNum = new int[numMember];

        for (int i = 0; i < numMember; i++){
            firstName[i] = sc.next();
            lastName[i] = sc.next();
            countyNum[i] = sc.nextInt();
        }
    }

    void printInfo(int Number){

        if (Number < 0){
            System.out.println("invalid region number");
        }

        if (Number == 0){
            for (int i = 0; i < numMember; i++){
                System.out.println(firstName[i] + " " + lastName[i] + " " + countyNum[i]);
            }
        }

        if (Number > 0){
            boolean check = false;
            for (int i = 0; i < numMember; i++){
                if (countyNum[i] == Number){
                    check = true;
                    System.out.println(firstName[i] + " " + lastName[i]);
                }
            }

            if (!check){
                System.out.println("none");
            }
        }

    }

}

public class KorKorTor1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        String[] partyName = new String[N];
        int[] countyNum = new int[N];

        for (int i = 0; i < N; i++){
            partyName[i] = scan.next();
            countyNum[i] = scan.nextInt();
        }

        Party[] party = new Party[N];

        for (int i = 0; i < N; i++){
            party[i] = new Party(partyName[i], countyNum[i], scan);
        }
        
        final int K = scan.nextInt();

        for(int i = 0; i < K; ++i) {
            int partyNumber = scan.nextInt() - 1;
            int regionNumber = scan.nextInt();
            party[partyNumber].printInfo(regionNumber);
        }

    }
}
