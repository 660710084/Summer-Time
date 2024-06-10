package Inheritance.ProductStore.ProductStore2;

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

class Shoe extends Product{

    public int gender; 
    public int size; 
    public int type; 
    public String brand;

    Shoe(String name, String sku, double price, int weight, int gender, int size, int type, String brand){
        super(name, sku, price, weight);
        this.gender = gender;
        this.size = size;
        this.type = type;
        this.brand = brand;
    }

    @Override
    void printInfo(){
        super.printInfo();
        System.out.print(gender + ", " + size + ", ");

        if (type == 1){
            System.out.print("sport, ");
        }
        if (type == 2){
            System.out.print("formal, ");
        }
        if (type == 3){
            System.out.print("casual, ");
        }

        System.out.print(brand);
        System.out.println();

    }

}

public class ProductStore2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        Shoe[] s = new Shoe[N];

        for(int i = 0; i < N; ++i) {
        scan.nextLine(); // throw away new-line char
            String name = scan.nextLine();
            String sku = scan.nextLine();
            double prices = scan.nextDouble();
            int weight = scan.nextInt();
            int gender = scan.nextInt();
            int size = scan.nextInt();
            int type = scan.nextInt();
            String brand = scan.next();
            s[i] = new Shoe(name, sku, prices, weight, gender, size, type, brand);
        }

        // Call checkVaidity of each product object.
        for(int i = 0; i < N; ++i) {
            boolean valid = s[i].checkValidity();
            System.out.println(valid);
        }

        // Call printInfo of each product object.
        for(int i = 0; i < N; ++i) {
            s[i].printInfo();
        }

    }
}
