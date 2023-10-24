package chapter4;

public class Countdown {
    // InterruptedException wegen Thread.sleep()
    public static void main(String[] args) throws InterruptedException {
        for (int i = 15; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
