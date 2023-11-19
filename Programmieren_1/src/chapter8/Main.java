package chapter8;

public class Main {
    public static void main(String[] args) {
        Auto golf = new Auto();
        Auto a1 = new Auto();
        Auto corsa = new Auto();
        Auto[] autos = {golf, a1, corsa};

        golf.marke = "VW";
        golf.farbe = "blau";
        golf.hubraum = 1.5f;

        a1.marke = "Audi";
        a1.farbe = "gelb";
        a1.hubraum = 2f;

        corsa.marke = "Opel";
        corsa.farbe = "rot";
        corsa.hubraum = 1.2f;

        Auto autoGroessterHubraum = groessterHubraum(autos);
        System.out.println("Marke: " + autoGroessterHubraum.marke);
        System.out.println("Farbe: " + autoGroessterHubraum.farbe);
        System.out.println("Hubraum: " + autoGroessterHubraum.hubraum);

    }

    private static Auto groessterHubraum(Auto[] autos) {
        Auto autoGroessterHubraum = autos[0];
        for (Auto auto : autos) {
            if (auto.hubraum > autoGroessterHubraum.hubraum) autoGroessterHubraum = auto;
        }
        return autoGroessterHubraum;
    }
}
