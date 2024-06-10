package BasicClass.LectureRoom.LectureRoom4;

import java.util.Scanner;

class LectRoom{

    public int classCode;
    public String name;
    public int capacity;
    public int currentSeats;

    LectRoom(int classCode, String name, int capacity){
        this.classCode = classCode;
        this.name = name;
        this.capacity = capacity;
    }

    boolean reserveSeats(int numSeats){
        if (numSeats + this.currentSeats > capacity){
            return false;
        }

        this.currentSeats += numSeats;
        return true;
    }

}

public class LectureRoom4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LectRoom[] lr = new LectRoom[n];

        for (int i = 0; i < n; i++){
            int classCode = sc.nextInt();
            String name = sc.next();
            int capacity = sc.nextInt();

            lr[i] = new LectRoom(classCode, name, capacity);
        }

        int N = sc.nextInt();

        for (int i = 0; i < N; i++){
            int classCode = sc.nextInt();
            int capacity = sc.nextInt();
            boolean check = false;
            for (int j = 0; j < n; j++){
                LectRoom lrs = lr[j];
                if (lrs.classCode == classCode && lrs.reserveSeats(capacity)){
                    System.out.println(lrs.name);
                    check = true;
                    break;
                }
            }
            if (!check){
                System.out.println("sorry");
            }
        }

    }
}

