package Method_basic;

import java.util.Scanner;

public class AgeReport {

    static int count = 0;

    static int reportAge(int[] id, int[] age, int ageMin, int ageMax){
        for (int i = 0; i < id.length; i++){
            if (age[i] >= ageMin && age[i] <= ageMax){
                count += 1;
                System.out.println(id[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        int[] IDs = new int[N];
        int[] ages = new int[N];

        for (int i = 0; i < N; i++){
            IDs[i] = sc.nextInt();
            ages[i] = sc.nextInt();
        }

        int AgeMin = sc.nextInt();
        int AgeMax = sc.nextInt();

        int x = reportAge(IDs, ages, AgeMin, AgeMax);
        System.out.println("There are " + x + " persons in age range of " + AgeMin + " to " + AgeMax);
    }
}
