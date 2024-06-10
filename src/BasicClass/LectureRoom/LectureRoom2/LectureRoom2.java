package BasicClass.LectureRoom.LectureRoom2;

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

public class LectureRoom2 {
    public static void main(String[] args) {
        
    }
}
