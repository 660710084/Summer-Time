package Encapsulation2.Department1;

import java.util.Scanner;

class Dept{

    public int ministryBudget;
    public int eduFee;
    public int serviceFee;
    public int donation;

    Dept(int teacher, int student){
        computeIncome(teacher, student);
    }

    void computeIncome(int teacher, int student){
        this.ministryBudget = (teacher * 500000) + (student * 3000);
        this.eduFee = student * 5000;
        this.serviceFee = 300000;
        this.donation = 100000;
    }

    void printReport(){
        System.out.println("ministry budget = " + ministryBudget);
        System.out.println("education fee = " + eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = " + donation);
    }

}

public class Department1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int teacher = sc.nextInt();
        int student = sc.nextInt();

        Dept d = new Dept(teacher, student);

        d.printReport();
    }
}
