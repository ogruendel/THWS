package chapter7;

public class Lotto {
    public static void main(String[] args) {
        printArray(lottoZahlen());
    }

    private static int[] minSort(int[] input) {
        int min;
        int replace;
        int indexReplace;

        for (int i = 0; i < input.length; i++) {
            min = input[i];
            replace = input[i];
            indexReplace = i;
            for (int j = i; j < input.length; j++) {
                if (min > input[j]) {
                    min = input[j];
                    indexReplace = j;
                }
            }
            input[i] = min;
            input[indexReplace] = replace;
        }

        return input;
    }

    private static int[] lottoZahlen() {
        int[] lottoZahlen = new int[6];
        int lottoZahl;
        int i = 0;
        do {
            lottoZahl = (int) (Math.random() * 49) + 1;
            if (!contains(lottoZahlen, lottoZahl)) {
                lottoZahlen[i] = lottoZahl;
                i++;
            }
        } while (i < 6);
        return minSort(lottoZahlen);
    }

    private static boolean contains(int[] input, int toCheck) {
        for (int i : input) {
            if (i == toCheck) {
                return true;
            }
        }
        return false;
    }

    private static void printArray(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.print(input[input.length - 1]);
    }
}
