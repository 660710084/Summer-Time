package BasicClass.MBCompat;

import java.util.Scanner;

class CPU{

    public String model;
    public int clocks;
    public int socket;
    public int memType;
    public boolean valid;

    CPU(String model, int clocks, int socket, int memType){
        this.model = model;
        this.clocks = clocks;
        this.socket = socket;
        this.memType = memType;
        this.valid = isValidSpec(model, clocks, socket, memType);
    }

    boolean isValidSpec(String model, int clocks, int socket, int memType){
        if (model == null || model.length() <= 1){
            return false;
        }

        if (clocks <= 0){
            return false;
        }

        if (socket <= 0){
            return false;
        }

        if (memType <= 0 || memType > 10){
            return false;
        }

        return true;
    }

    void printInfo(){
        System.out.println(model);
        System.out.println(clocks);
        System.out.println(socket);
        System.out.println(memType);
        System.out.println(valid);
    }

}

class MainBoard{

    public String model;
    public int socket;
    public int memType;
    public boolean valid;

    MainBoard(String model, int socket, int memType){
        this.model = model;
        this.socket = socket;
        this.memType = memType;
        this.valid = isValidSpec(model, socket, memType);
    }

    boolean isValidSpec(String model, int socket, int memType){
        if (model == null || model.length() <= 1){
            return false;
        }

        if (socket <= 0){
            return false;
        }

        if (memType <= 0 || memType > 10){
            return false;
        }

        return true;
    }

    void printInfo(){
        System.out.println(model);
        System.out.println(socket);
        System.out.println(memType);
        System.out.println(valid);
    }

}

class Computer{

    public CPU cpu;
    public MainBoard mb;
    public boolean valid;

    Computer(CPU cpu, MainBoard mb ){
        this.mb = mb;
        this.cpu = cpu;
        this.valid = isValidCom(cpu, mb);
    }

    boolean isValidCom(CPU cpu, MainBoard mb){

        if (mb.socket != cpu.socket){
            return false;
        }

        if (mb.memType != cpu.memType){
            return false;
        }

        if (mb.valid != cpu.valid || !mb.valid || !cpu.valid){
            return false;
        }

        return true;

    }

    void printInfo(){
        if (valid){
            System.out.println(cpu.model);
            System.out.println(cpu.clocks);
            System.out.println(mb.model);
            System.out.println(mb.socket);
            System.out.println(mb.memType);
        }else{
            System.out.println("Invalid Spec");
            cpu.printInfo();
            mb.printInfo();
        }
    }

}

public class MBCompat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String model = sc.nextLine();
        int clocks = sc.nextInt();
        int socket = sc.nextInt();
        int memType = sc.nextInt();

        if (model.length() == 0 && socket % 2 == 0){
            model = null;
        }

        CPU cpu = new CPU(model, clocks, socket, memType);

        sc.nextLine();

        model = sc.nextLine();
        socket = sc.nextInt();
        memType = sc.nextInt();

        if (model.length() == 0 && socket % 2 == 0){
            model = null;
        }

        MainBoard mb = new MainBoard(model, socket, memType);
        
        Computer com = new Computer(cpu, mb);
        com.printInfo();
    }
}
