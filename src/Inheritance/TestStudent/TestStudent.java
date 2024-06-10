package Inheritance.TestStudent;

import java.util.Scanner;

class Student{

    public String firstName;
    public String lastName;
    private int stepScore[];

    Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        stepScore = new int[4];
    }

    int getTestScore(int want){
        return stepScore[want - 1];
    }

    void setTestScore(int want, int score){
        stepScore[want - 1] = score;
    }

    int computeTotal(){
        int sum = 0;
        for (int i = 0; i < 4; i++){
            sum += stepScore[i];
        }
        return sum;
    }

    void printInfo(){
        System.out.println(firstName + " " + lastName + " " + computeTotal());
    }

}

public class TestStudent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Student[] roster = new Student[N];

        for (int i = 0; i < N; i++) {
            String fname = scan.next();
            String lname = scan.next();
            roster[i] = new Student(fname, lname);
            for (int j = 1; j <= 4; j++) {
                int score = scan.nextInt();
                roster[i].setTestScore(j, score);
            }
            roster[i].printInfo();
        }

        int K = scan.nextInt();
        for (int i = 0; i < K; i++) {
            int rosterNum = scan.nextInt();
            int testNum = scan.nextInt();
            System.out.println(roster[rosterNum - 1].getTestScore(testNum));
        }
    }
}
