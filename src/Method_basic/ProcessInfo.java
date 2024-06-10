package Method_basic;

import java.util.Scanner;

public class ProcessInfo {

    static boolean listProcess(String[] names, int[] ramUses, int Ram){

        int sum = 0;

        for (int i = 0; i < names.length; i++){
            if (ramUses[i] >= 10){
                System.out.println(names[i] + "* " + ramUses[i]);
            }else{
                System.out.println(names[i] + " " + ramUses[i]);
            }

            sum += ramUses[i];
        }

        System.out.println("RAM used = " + sum + " out of " + Ram);

        if (sum > Ram){
            return false;
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        String[] names = new String[N];
        int[] ramUses = new int[N];

        for (int i = 0; i < N; i++){
            names[i] = sc.next();
            ramUses[i] = sc.nextInt();
        }

        int Ram = sc.nextInt();

        boolean p = listProcess(names, ramUses, Ram);

        if (!p){
            System.out.println("Not enough RAM");
        }else{
            System.out.println("Sufficient RAM");
        }

    }

}
