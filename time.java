import java.util.*;
import java.lang.*;

class Time {
    int hrs, min, sec;

    Time() {
        hrs = 0;
        min = 0;
        sec = 0;
    }

    Time(int h, int m, int s) {
        hrs = h;
        min = m;
        sec = s;
    }

    void display() {
        System.out.println(hrs + ":" + min + ":" + sec);
    }

    public static Time add(Time t1, Time t2) {
        Time t3 = new Time();
        t3.hrs = (t1.hrs + t2.hrs) % 24;
        t3.min = (t1.min + t2.min) % 60;
        t3.sec = (t1.sec + t2.sec) % 60;
        return t3;
    }

    public static void main(String[] args) {
        Time t1 = new Time(24, 59, 60);
        Time t2 = new Time(1, 1, 1);
        Time t3 = add(t1, t2);

        System.out.println("Time 1 = ");
        t1.display();
        System.out.println("Time 2 = ");
        t2.display();
        System.out.println("Time 3 = ");
        t3.display();

    }

}