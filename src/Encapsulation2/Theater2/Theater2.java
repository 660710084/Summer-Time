package Encapsulation2.Theater2;

import java.util.Scanner;

class Theater{

    public boolean ThreeD;
    public boolean luxury;
    public int numSeats;
    public boolean[] seats;

    public String title;
    public int basePrice;

    Theater(boolean ThreeD, boolean luxury, int numSeats){
        this.ThreeD = ThreeD;
        this.luxury = luxury;
        this.numSeats = numSeats;
        this.seats = new boolean[numSeats + 1];
    }

    void setTitle(String title){

        if (title == null || title.length() == 0){
            System.out.println("invalid title");
            return;
        }

        this.title = title;

    }

    void setBasePrice(int basePrice){

        if (basePrice <= 0){
            System.out.println("invalid price");
            return;
        }

        this.basePrice = basePrice;

    }

    int reserveOne(int seatNumber){

        if (seatNumber <= 0 || seatNumber >= seats.length){
            System.out.println("sorry");
            return -1;
        }

        if (seats[seatNumber]){
            System.out.println("sorry");
            return -1;
        }

        seats[seatNumber] = true;
        return basePrice;

    }

    int reserveMultiple(int numSeats, int seatNumber){

        int start = seatNumber;
        int stop = seatNumber + (numSeats - 1);

        if (start <= 0 || start >= seats.length){
            System.out.println("sorry");
            return -1;
        }

        if (stop <= 0 || stop >= seats.length){
            System.out.println("sorry");
            return -1;
        }

        for (int i = start; i <= stop; i++){
            if (seats[i]){
                System.out.println("sorry");
                return -1;
            }
        }

        for (int i = start; i <= stop; i++){
            seats[i] = true;
        }

        return basePrice * numSeats;

    }

    void printInfo(){
        
        if (ThreeD){
            System.out.println("3D");
        }else{
            System.out.println("No 3D");
        }

        if (luxury){
            System.out.println("Luxury");
        }else{
            System.out.println("Standard");
        }

        System.out.println(seats.length - 1);

        if (title != null && title.length() > 0){
            System.out.println(title);
        }else{
            System.out.println("title is not set");
        }

        if (basePrice > 0){
            System.out.println(basePrice);
        }else{
            System.out.println("price is not set");
        }

    }

}

public class Theater2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int threeD1 = sc.nextInt();
        int luxury1 = sc.nextInt();
        int numSeats = sc.nextInt();

        boolean threeD = false;
        boolean luxury = false;

        if(threeD1 == 1)
            threeD = true;
        if(luxury1 == 1)
            luxury = true;

        Theater t = new Theater(threeD, luxury, numSeats);

        String dummy = sc.nextLine(); // throw away new line character
        String title = sc.nextLine();
        t.setTitle(title);

        int basePrice = sc.nextInt();
        t.setBasePrice(basePrice);

        int N = sc.nextInt();

        for(int i = 0; i < N; ++i) {
            int numberOfSeats = sc.nextInt();
            int seatNumber = sc.nextInt();
            int totalPrice;

            if(numberOfSeats == 1)
                totalPrice = t.reserveOne(seatNumber);

            else
                totalPrice = t.reserveMultiple(numberOfSeats, seatNumber);

            if(totalPrice > 0)
                System.out.println(totalPrice);
        }

        t.printInfo();
    }
}
