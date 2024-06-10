package BasicClass.BusCompany.BusCompany3;

import java.util.Scanner;

class Bus{

    public String id;
    public int type;
    private int capacity;
    private int seats = 0;
    private boolean Active = true;

    Bus(String id, int type, int capacity){
        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }

    void printStats(){
        System.out.println(id);
        
        if (type == 1){
            System.out.println("Fan");
        }

        if (type == 2){
            System.out.println("P1");
        }

        if (type == 3){
            System.out.println("VIP");
        }

        System.out.println(this.seats + " " + this.capacity);

        if (this.Active){
            System.out.println("Active");
        }else{
            System.out.println("Inactive");
        }
    }

    boolean reserve(int numSeats){
        if (numSeats <= 0 || numSeats + seats > capacity || !Active){
            return false;
        }

        seats += numSeats;
        return true;
    }

    void sendToRepair(){
        Active = false;
    }

    void backToService(){
        Active = true;
    }
}

public class BusCompany3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Bus[] b = new Bus[n];

        for (int i = 0; i < n; i++){
            String id = scan.next();
            int type = scan.nextInt();
            int seats = scan.nextInt();
            b[i] = new Bus(id, type, seats);
        }
        

        int N = scan.nextInt();

        for(int i = 0; i < N; ++i) {
            int P = scan.nextInt();
            int K = scan.nextInt();
            int T = scan.nextInt();

            if (P == 1){
                boolean check = false;
                for (int j = 0; j < n; j++){
                    if (b[j].type != T){
                        continue;
                    }

                    boolean bus = b[j].reserve(K);

                    if (bus){
                        check = true;
                        System.out.println(b[j].id);
                        break;
                    }
                }

                if (!check){
                    System.out.println("sorry");
                }
            }

            if (P == 2){
                b[T - 1].sendToRepair();
            }

            if (P == 3){
                b[T - 1].backToService();
            }
        }
    }
}
