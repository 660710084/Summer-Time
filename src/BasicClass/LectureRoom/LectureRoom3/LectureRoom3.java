package BasicClass.LectureRoom.LectureRoom3;

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

public class LectureRoom3 {
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

        for (int i = 0; i < 3; i++){
            int x = sc.nextInt() - 1;
            System.out.println(lr[x].classCode + " " + lr[x].name + " " + lr[x].capacity);
        }

    }
}
