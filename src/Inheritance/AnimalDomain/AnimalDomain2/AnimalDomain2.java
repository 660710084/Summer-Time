package Inheritance.AnimalDomain.AnimalDomain2;

import java.util.ArrayList;
import java.util.Scanner;

class Animal{

    public String name;
    public int lifeExpect;
    public int age;
    public boolean vaccine;

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

    void vaccine(){
        this.vaccine = true;
        System.out.println(name + "'s life expectancy is now " + lifeExpect + " year(s)");
    }

}

class Dog extends Animal{

    Dog(String name){
        super(name, 8);
    }

    @Override

    void vaccine(){
        if (!vaccine){
            int x = lifeExpect - age;
            lifeExpect += x;
        }       
        super.vaccine();
    }

}

class Turtle extends Animal{

    Turtle(String name){
        super(name, 50);
    }

}

class Salmon extends Animal{

    Salmon(String name){
        super(name, 4);
    }

}


public class AnimalDomain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Animal> animals = new ArrayList<Animal>();

        for (int i = 0; i < N; i++){
            int type = sc.nextInt();
            if (type == 1){
                int T = sc.nextInt();
                String name = sc.next();

                if (T == 1){
                    Animal d = new Dog(name);
                    animals.add(d);
                }

                if (T == 2){
                    Animal t = new Turtle(name);
                    animals.add(t);
                }

                if (T == 3){
                    Animal s = new Salmon(name);
                    animals.add(s);
                }
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

            if (type == 4){
                int id = sc.nextInt();
                Animal a = animals.get(id - 1);
                a.vaccine();
            }
        }
    }
}
