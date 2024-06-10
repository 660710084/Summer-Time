package BasicClass.BusCompany.BusCompany1;

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
}

public class BusCompany1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus b = new Bus(id, type, seats);
        b.printStats();
    }
}
