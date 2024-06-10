package BasicClass.GrabPanda1;

import java.util.Scanner;

class FoodOrder{

    public String name;
    public int foodTotal = 0;
    public int cost = 0;

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

        System.out.println(cost);
        System.out.println(foodTotal + cost);
    }

}

public class GrabPanda1 {
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

    }
}
