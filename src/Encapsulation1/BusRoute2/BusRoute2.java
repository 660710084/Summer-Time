package Encapsulation1.BusRoute2;

import java.util.Scanner;

class Route{

    String[] location;
    int[] dis;

    Route(String[] location, int[] dis){
        this.location = location;
        this.dis = dis;
    }

    void getStopInfo(int seq){
        seq = seq - 1;
        if (seq >= 0 && seq <= location.length - 1){
            System.out.println(location[seq] + " " + dis[seq]);
        }else{
            System.out.println("invalid number");
        }

    }

    void summarizeRoute(){

        int sum = 0;

        for (int i = 0; i < location.length; i++){
            sum += dis[i];
        }
        
        System.out.println(location[0] + " " + location[dis.length - 1] + " " + sum);

    }

}

public class BusRoute2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        String[] names = new String[N];
        int[] distances = new int[N];
        for(int i = 0; i < N; i++) {
            names[i] = sc.next();
            distances[i] = sc.nextInt();
        }

        Route R = new Route(names, distances); // Create a Route object here.
        // final int K = sc.nextInt();
        // for(int i = 0; i < K; i++) {
        //     int x = sc.nextInt();
        //     R.getStopInfo(x);
        // }

        R.summarizeRoute();
    }
}
