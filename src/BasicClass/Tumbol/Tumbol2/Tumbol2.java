package BasicClass.Tumbol.Tumbol2;

import java.util.Scanner;

class Tumbol{

    public String name;
    public int latitube;
    public int longtitube;
    public int numPeople;
    public int availBudget;
    public int money;

    Tumbol(String name, int latitube, int longtitube, int numPeople){
        this.name = name;
        this.latitube = latitube;
        this.longtitube = longtitube;
        this.numPeople = numPeople;
        this.availBudget = numPeople * 5000;
    }
    
    int allocateBudget(int[] arrBudget){
        boolean check = false;
        money = 0;
        for (int i = 0; i < arrBudget.length; i++){
            if (arrBudget[i] + money <= availBudget){
                money += arrBudget[i];
                check = true;
                System.out.print((i + 1) + " ");
            }
        }

        if (!check){
            System.out.print("none");
        }

        System.out.println();

        return money;
    }

}

public class Tumbol2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt();
        Tumbol[] tumbols = new Tumbol[k];

        for(int i = 0; i < k; ++i) {
            String name = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int population = scan.nextInt();
            tumbols[i] = new Tumbol(name, x, y, population);
        }

        int total = 0;
        for(int i = 0; i < k; ++i) {
            int N = scan.nextInt();
            int[] budget = new int[N];
            for (int j = 0; j < N; j++){
                budget[j] = scan.nextInt();
            }
            total += tumbols[i].allocateBudget(budget);
        }

        System.out.println(total);
    }
}

