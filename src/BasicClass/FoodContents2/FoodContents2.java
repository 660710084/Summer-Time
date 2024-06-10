package BasicClass.FoodContents2;

import java.util.Scanner;

class Food{

    public String menu;
    public String content;
    public int kilo = 0;
    public int cal = 0;

    Food(String menu, String content, int kilo, int cal){
        this.menu = menu;
        this.content = content + " ";
        this.kilo = kilo;
        this.cal = kilo * cal;
    }

    void addContent(String content, int kilo, int cal){
        this.kilo += kilo;
        this.content += content + " ";
        this.cal += kilo * cal;
    }

    void printInfo(){
        System.out.println(menu);
        System.out.println(kilo + " " + cal);
        System.out.println(content);
    }

}


public class FoodContents2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String foodName = scan.next();
        String content1 = scan.next();
        int w1 = scan.nextInt();
        int c1 = scan.nextInt();

        Food f = new Food(foodName, content1, w1, c1);

        int q = scan.nextInt();

        while(q != 0) {

            if(q == 1) {
                f.printInfo();
            } else if(q == 2) {
                String content2 = scan.next();
                int w2 = scan.nextInt();
                int c2 = scan.nextInt();
                f.addContent(content2, w2, c2);
            } 
            q = scan.nextInt();

        }
    }
}
