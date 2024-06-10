package BasicClass.GrabPanda2;

import java.util.Scanner;

class FoodOrder{

    public String name;
    public int foodTotal = 0;
    public int cost = 0;
    public int grandTotal = 0;

    FoodOrder(String name){
        this.name = name;
    }

    void add(int foodTotal){
        this.foodTotal += foodTotal;
    }

    void finalizeReceipt(){
        System.out.println(name);
        System.out.println(foodTotal);

        if (foodTotal <= 50){
            cost += 20;
        }

        if (foodTotal > 50 && foodTotal <= 150){
            cost += 10;
        }

        this.grandTotal = foodTotal + cost;

        System.out.println(cost);
        System.out.println(grandTotal);
    }

    void distribIncome(){

        if (grandTotal <= 200){
            grandTotal -= 20;
            System.out.println("Rider: 20");
        }

        if (grandTotal > 200){
            grandTotal -= 30;
            System.out.println("Rider: 30");
        }

        System.out.println("GrabPanda: " + (foodTotal * 3)/10);
        System.out.println("Food Seller: " + (grandTotal - (foodTotal * 3)/10));

    }

}

public class GrabPanda2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        int N = scan.nextInt();

        FoodOrder order = new FoodOrder(name);

        for(int i = 0; i < N; ++i) {
            int price = scan.nextInt();
            order.add(price);
        }

        order.finalizeReceipt();
        order.distribIncome();

    }
}
