package Encapsulation2.Department2;

import java.util.Scanner;

class Dept{

    public int ministryBudget;
    public int eduFee;
    public int serviceFee;
    public int donation;

    public int salary;
    public int elec;
    public int eduCost;

    Dept(int teacher, int student){
        int income = computeIncome(teacher, student);
        int expense = computeExpense(teacher, student);

        System.out.println("total income = " + income);
        System.out.println("total expense = " + expense);
        System.out.println("income - expense = " + (income - expense));
    }

    int computeIncome(int teacher, int student){

        int sum = 0;

        this.ministryBudget = (teacher * 500000) + (student * 3000);
        this.eduFee = student * 5000;
        this.serviceFee = 300000;
        this.donation = 100000;

        sum = ministryBudget + eduFee + serviceFee + donation;
        return sum;
    }

    int computeExpense(int teacher, int student){

        int sum = 0;

        this.salary = teacher * 600000;
        this.elec = (teacher + student) * 2000;
        this.eduCost = student * 4000;

        sum = salary + elec + eduCost;
        return sum;
    }

    void printReport(){
        System.out.println("ministry budget = " + ministryBudget);
        System.out.println("education fee = " + eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = " + donation);
        System.out.println("salary = " + salary);
        System.out.println("electricity = " + elec);
        System.out.println("educational cost = " + eduCost);
    }

}

public class Department2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int teacher = sc.nextInt();
        int student = sc.nextInt();

        Dept d = new Dept(teacher, student);

        d.printReport();
    }
}
