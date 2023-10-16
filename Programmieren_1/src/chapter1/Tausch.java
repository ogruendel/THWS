package chapter1;

public class Tausch {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;

        //Vor dem Tausch
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        //Tausch
        int temp = x;
        x = y;
        y = temp;

        //Nach dem Tausch
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
