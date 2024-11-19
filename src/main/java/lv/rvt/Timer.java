package lv.rvt;

public class Timer {
    private int seconds;
    private int hundredSeconds;

    public Timer() {
        this.seconds = 0;
        this.hundredSeconds = 0;
    }

    public String toString() {
        return this.seconds + ":" + this.hundredSeconds;
    }

    public void advance() {
        if (hundredSeconds == 100) { 
            seconds+=1;
            hundredSeconds=0;
        }
        hundredSeconds+=1;
    }
}
