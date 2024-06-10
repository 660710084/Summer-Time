package BasicClass.BusCompany.BusCompany2;

import java.util.Scanner;

class Bus{

    public String id;
    public int type;
    public int capacity;
    public int seats = 0;
    public boolean Active = true;

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

        System.out.println(seats + " " + capacity);

        if (Active){
            System.out.println("Active");
        }else{
            System.out.println("Inactive");
        }
    }

    boolean reserve(int numSeats){
        if (numSeats < 0 || numSeats + seats > capacity || !Active){
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

public class BusCompany2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus b = new Bus(id, type, seats);

        int N = scan.nextInt();

        for(int i = 0; i < N; ++i) {
            int P = scan.nextInt();
            int K = scan.nextInt();
            if(P == 1)
                b.reserve(K);
            else if(P == 2)
                b.sendToRepair();
            else if(P == 3)
                b.backToService();
            b.printStats();
        }
    }
}
