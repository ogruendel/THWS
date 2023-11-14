package chapter7;

import java.util.Arrays;

public class Euro {
    public static void main(String[] args) {
        int euroGefunden = 0;
        for (int i = 0; i < 10000; ) {
            int[] schreibtisch = schreibtisch();
            if (schreibtisch[0] == 0 && schreibtisch[1] == 0) {
                if (schreibtisch[2] == 1) {
                    euroGefunden++;
                }
                i++;
            }
        }
        System.out.println((double) euroGefunden / 10000.0);
    }

    private static int[] schreibtisch() {
        int euro = (int) (Math.random() * 2);
        int[] schreibtisch = new int[3];
        if (euro == 1) {
            int random = (int) (Math.random() * 3) + 1;
            switch (random) {
                case 1 -> schreibtisch[0] = 1;
                case 2 -> schreibtisch[1] = 1;
                case 3 -> schreibtisch[2] = 1;
            }
        }
        return schreibtisch;
    }
}
