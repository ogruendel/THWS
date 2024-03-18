package chapter8;

import java.util.Objects;

public class Rechner {
    public static void main(String[] args) {
        int output = Integer.valueOf(args[0]);
        for (int i = 1; i < args.length - 1; i++) {
            if (Objects.equals(args[args.length - 1], "+")) {
                output += Integer.valueOf(args[i]);
            } else {
                output -= Integer.valueOf(args[i]);
            }
        }
        System.out.println(output);
    }
}
