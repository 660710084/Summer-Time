package BasicClass.Tumbol.Tumbol1;

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
    
    void allocateBudget(int[] arrBudget){
        boolean check = false;
        for (int i = 0; i < arrBudget.length; i++){
            if (arrBudget[i] + money <= availBudget){
                money += arrBudget[i];
                check = true;
                System.out.print((i + 1) + " ");
            }
        }

        if (!check){
            System.out.println("none");
        }
    }

}

public class Tumbol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.next();
        int latitube = sc.nextInt();
        int longtitube = sc.nextInt();
        int numPeople = sc.nextInt();

        Tumbol t = new Tumbol(name, latitube, longtitube, numPeople);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();    
        }

        t.allocateBudget(arr);
    }
}
