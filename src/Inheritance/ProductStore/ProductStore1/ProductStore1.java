package Inheritance.ProductStore.ProductStore1;

import java.util.Scanner;

class Product{

    public String name;
    public String sku;
    public double price;
    public int weight;
    public boolean valid;

    Product(String name, String sku, double price, int weight){
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.weight = weight;
    }

    boolean checkValidity(){
        boolean valid = true;
        if (name == null || name.length() <= 0){
            System.out.println("name is invalid");
            valid = false;
        }

        if (sku == null || sku.length() <= 0){
            System.out.println("sku is invalid");
            valid = false;
        }

        if (price < 0){
            System.out.println("price is invalid");
            valid = false;
        }

        if (weight < 0){
            System.out.println("weight is invalid");
            valid = false;
        }

        this.valid = valid;
        return valid;

    }

    void printInfo(){
        System.out.print(name + ", " + sku + ", " + price + ", " + weight);

        if (!valid){
            System.out.print(", Invalid");
        }
        System.out.println();
    }

}

public class ProductStore1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        Product[] p = new Product[N];

        for(int i = 0; i < N; ++i) {
            scan.nextLine(); // throw away new-line char
            String name = scan.nextLine();
            String sku = scan.nextLine();
            double prices = scan.nextDouble();
            int weight = scan.nextInt();
            p[i] = new Product(name, sku, prices, weight);
        }

        // Call checkVaidity of each product object.
        for(int i = 0; i < N; ++i) {
            boolean valid = p[i].checkValidity();
            System.out.println(valid);
        }

        // Call printInfo of each product object.
        for(int i = 0; i < N; ++i) {
            p[i].printInfo();
        }

    }
}
