package chapter16.muenzautomat;

public class LargestChangeCalculator implements ChangeCalculator{
    public int[] getChange(int euros, int cent) {
        int zweiEuro = euros / 2;
        int einEuro = euros % 2;
        int fuenfzig = cent / 50;
        int zwanzig = (cent % 50) / 20;
        int zehn = ((cent % 50) % 20) / 10;
        int fuenf = (((cent % 50) % 20) % 10) / 5;
        int zwei = ((((cent % 50) % 20) % 10) % 5) / 2;
        int eins = ((((cent % 50) % 20) % 10) % 5) % 2;

        return new int[]{
                eins, // alles in 1-Cent-Muenzen
                zwei,                    // keine 2-Cent-Muenzen
                fuenf,                    // keine 5-Cent-Muenzen
                zehn,                    // keine 10-Cent-Muenzen
                zwanzig,                    // keine 20-Cent-Muenzen
                fuenfzig,                    // keine 50-Cent-Muenzen
                einEuro,                    // keine 1-Euro-Muenzen
                zweiEuro                    // keine 2-Euro-Muenzen
        };
    }
}
