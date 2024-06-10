package Encapsulation1.BusRoute3;

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

    void getTripInfo(int n, int k){

        n = n - 1;
        k = k - 1;

        if (n < k && n >= 0 && k <= location.length - 1){
            int sum = 0;

            for (int i = n + 1; i <= k; i++){
                sum += dis[i];
            }

            System.out.println(location[n] + " " + location[k] + " " + sum);
        }else{
            System.out.println("invalid number");
        }

    }

}

public class BusRoute3 {
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
        final int K = sc.nextInt();
        for(int i = 0; i < K; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            R.getTripInfo(x, y);
        }
    }
}
