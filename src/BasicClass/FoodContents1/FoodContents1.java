package BasicClass.FoodContents1;

import java.util.Scanner;

class Food{

    public String menu;
    public String content;
    public int kilo = 0;

    Food(String menu, String content, int kilo){
        this.menu = menu;
        this.content = content + " ";
        this.kilo = kilo;
    }

    void addContent(String content, int kilo){
        this.kilo += kilo;
        this.content += content + " ";
    }

    void printInfo(){
        System.out.println(menu);
        System.out.println(kilo);
        System.out.println(content);
    }

}

public class FoodContents1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String foodName = scan.next();
        String content1 = scan.next();
        int w1 = scan.nextInt();

        Food f = new Food(foodName, content1, w1);

        int q = scan.nextInt();

        while(q != 0) {

            if(q == 1) {
                f.printInfo();
            } else if(q == 2) {
                String content2 = scan.next();
                int w2 = scan.nextInt();
                f.addContent(content2, w2);
            } 
            q = scan.nextInt();

        }

    }
}
