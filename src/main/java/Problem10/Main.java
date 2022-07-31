package Problem10;

public class Main extends Print{
    public static void main(String[] args) {
        Print print = new Print();
        Thread t1 = new Thread(new PrintOddandEvenUsingThread(10,print, false),"Odd");
        Thread t2 = new Thread(new PrintOddandEvenUsingThread( 10, print,true),"Even");
        t1.start();
        t2.start();
    }
}
