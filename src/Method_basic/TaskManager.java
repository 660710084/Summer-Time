package Method_basic;

import java.util.Scanner;

public class TaskManager {

    static void reportLoad(int cpuAll, int ramAll, int cpuUsed, int ramUsed){

        int CPU = (cpuUsed * 100) / cpuAll;
        int RAM = (ramUsed * 100) / ramAll;

        System.out.println("CPU: " + cpuUsed + "/" + cpuAll + " ("+ CPU +"%)");
        System.out.println("RAM: " + ramUsed + "/" + ramAll + " ("+ RAM +"%)");

        if (CPU >= 80){
            System.out.println("Limited CPU power");
        }

        if (RAM >= 80){
            System.out.println("Limited RAM availability");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cpuAll = sc.nextInt();
        int ramAll = sc.nextInt();
        int cpuUsed = sc.nextInt();
        int ramUsed = sc.nextInt();

        reportLoad(cpuAll, ramAll, cpuUsed, ramUsed);

    }
}
