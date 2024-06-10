package Encapsulation1.Grader1NewArrayCopy;

import java.util.Arrays;

class Grader{

    public String name;
    public String desc;
    public int[] pts;
    public String[] sols;

    Grader(String name, String desc, int[] pts, String[] sols){

        int newLength = pts.length;
        this.name = name;
        this.desc = desc;
        this.pts = Arrays.copyOf(pts, newLength);
        this.sols = Arrays.copyOf(sols, newLength);

    }

}
