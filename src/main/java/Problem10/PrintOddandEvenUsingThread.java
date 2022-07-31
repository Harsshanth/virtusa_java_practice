package Problem10;

public class PrintOddandEvenUsingThread implements Runnable{
    private int range;
    private Print print;
    private boolean isEven;

    PrintOddandEvenUsingThread(int range, Print print, boolean isEven) {
        this.range = range;
        this.print = print;
        this.isEven = isEven;
    }

    @Override
    public void run() {
        int number = isEven ? 2 : 1;
        while (number <= range) {
            if (isEven) {
                print.printEven(number);
            } else {
                print.printOdd(number);
            }
            number += 2;
        }
    }
}



