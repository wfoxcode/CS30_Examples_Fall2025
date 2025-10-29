public class LoopStats {
    private int start, stop;

    public LoopStats() {
        setNums(0, 0);
    }

    public LoopStats(int beg, int end) {
        setNums(beg, end);
    }

    public void setNums(int beg, int end) {
        start = beg;
        stop = end;
    }

    // -------------------------------
    // Stat Calculations
    //--------------------------------

    public int getEven() {
        int evenCount = 0;

        // code to count even numbers

        return evenCount;
    }

    public int getOdd() {
        int oddCount = 0;

        // code to count odd nums

        return oddCount;
    }

    public int getTotal() {
        int total = 0;

        // code to sum/total the range

        return total;
    }

    // This is what happens if you call the object without a method specified
    public String toString() {
        return "Start: " + start + ", Stop: " + stop;
    }

}
