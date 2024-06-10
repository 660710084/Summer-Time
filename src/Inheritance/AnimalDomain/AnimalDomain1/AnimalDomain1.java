package Inheritance.AnimalDomain.AnimalDomain1;

import java.util.ArrayList;
import java.util.Scanner;

class Animal{

    public String name;
    public int lifeExpect;
    public int age;

    Animal(String name, int lifeExpect){
        this.name = name;
        this.lifeExpect = lifeExpect;
        this.age = 0;

        System.out.println(name + " was born with life expectancy " + lifeExpect + " year(s)");
    }

    void live(int year){

        int x = age + year;

        if (age == lifeExpect){
            System.out.println(name + " died earlier");
            return;
        }

        if (x < lifeExpect){
            if (year == 1){
                System.out.println(name + " lived " + year + " more year");
            }else{
                System.out.println(name + " lived " + year + " more years");
            }
            age += year;
            return;
        }

        if (x >= lifeExpect){
            int dif = lifeExpect - age;
            if (dif == 1){
                System.out.println(name + " lived " + dif + " more year and died");
            }else{
                System.out.println(name + " lived " + dif + " more years and died");
            }
            age = lifeExpect;
            return;
        }



    }

    boolean isAlive(){

        boolean alive = (age < lifeExpect);

        if (alive){
            System.out.println(name + " is alive");
            return true;
        }else{
            System.out.println(name + " is dead");
            return false;
        }
    }

}

public class AnimalDomain1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Animal> animals = new ArrayList<Animal>();

        for (int i = 0; i < N; i++){
            int type = sc.nextInt();
            if (type == 1){
                String name = sc.next();
                int lifeExpect = sc.nextInt();
                Animal a = new Animal(name, lifeExpect);
                animals.add(a);
            }

            if (type == 2){
                int id = sc.nextInt();
                int year = sc.nextInt();
                Animal a = animals.get(id - 1);
                a.live(year);
            }

            if (type == 3){
                int id = sc.nextInt();
                Animal a = animals.get(id - 1);
                a.isAlive();
            }
        }
    }
}
