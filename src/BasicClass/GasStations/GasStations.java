package BasicClass.GasStations;

import java.util.Scanner;

class GasStation{

    public boolean[] oil = new boolean[7];
    public int[] capacityOil = new int[7];
    public int[] usedOil = new int[7];
    private String[] names = {"Dummy", "95S", "91S", "E20", "E85", "B7", "B20"};

    GasStation(boolean[] oil, int[] capacityOil){
        this.oil = oil;
        this.capacityOil = capacityOil;

        for (int i = 1; i < oil.length; i++){
            usedOil[i] = capacityOil[i];
        }
    }

    void dispense(int type, int capacity){

        if (type < 1 || type > 6 || !oil[type]){
            System.out.println("Invalid gas type");
            return;
        }

        if (this.usedOil[type] == 0){
            System.out.println("No gas available");
            return;
        }

        if (this.usedOil[type] - capacity > 0){
            System.out.println("Dispense " + capacity + " liters");
            usedOil[type] -= capacity;
        }else{
            System.out.println("Dispense " + usedOil[type] + " liters");
            usedOil[type] -= usedOil[type];
        }

    }

    void refillStation(int type, int fillOil){
        if (type < 1 || type > 6 || !oil[type]){
            System.out.println("Invalid gas type");
            return;
        }

        if (usedOil[type] == capacityOil[type]){
            System.out.println("No storage capacity available");
            return;
        }

        if (usedOil[type] + fillOil >= 0 && usedOil[type] + fillOil <= capacityOil[type]){
            System.out.println("Refill " + fillOil + " liters");
            usedOil[type] += fillOil;
        }else{
            int x = capacityOil[type] - usedOil[type];
            System.out.println("Refill " + x + " liters");
            usedOil[type] += x;
        }
        
    }

    void report(){
        for (int i = 0; i < oil.length; i++){
            if (oil[i]){
                System.out.print(names[i] + " " + usedOil[i] + ", ");
            }
        }
        System.out.println();
    }

}

public class GasStations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int N = scan.nextInt();
        GasStation[] stations = new GasStation[N+1];

        for(int s = 1; s <= N; ++s) {
            boolean[] gas = new boolean[7]; //gas with service
            int[] capa = new int[7]; //capacity for each gas type
                for(int g = 1; g <= 6; ++g) {
                    int k = scan.nextInt();
                    gas[g] = (k > 0) ? true: false;
                    capa[g] = k;
            }
            stations[s] = new GasStation(gas, capa);
        }

        final int Q = scan.nextInt();
        for(int i = 0; i < Q; ++i) {
            final int A = scan.nextInt();
            final int S = scan.nextInt();
            final int B = scan.nextInt();
            final int C = scan.nextInt();
            
            if (A == 1){
                stations[S].dispense(B, C);
            }

            if (A == 2){
                stations[S].refillStation(B, C);
            }

            if (A == 3){
                stations[S].report();
            }
        }
    }
}
