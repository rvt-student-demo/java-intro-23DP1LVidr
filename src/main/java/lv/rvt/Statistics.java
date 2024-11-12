package lv.rvt;

public class Statistics {
    private int count;

    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int number) {
        this.count = this.count + 1;
    }

    public int getCount() {
        return this.count;
    }
}
