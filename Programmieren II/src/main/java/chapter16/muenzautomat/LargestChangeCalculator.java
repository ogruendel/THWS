package chapter16.muenzautomat;

public class LargestChangeCalculator implements ChangeCalculator{
    public int[] getChange(int euros, int cent) {
        int zweiEuro = euros / (Coin.EURO_2.value / 100);
        int einEuro = euros % (Coin.EURO_2.value / 100);

        int fuenfzig = cent / Coin.CENT_50.value;
        int zwanzig = (cent % Coin.CENT_50.value) / Coin.CENT_20.value;
        int zehn = ((cent % Coin.CENT_50.value) % Coin.CENT_20.value) / Coin.CENT_10.value;
        int fuenf = (((cent % Coin.CENT_50.value) % Coin.CENT_20.value) % Coin.CENT_10.value) / Coin.CENT_5.value;
        int zwei = ((((cent % Coin.CENT_50.value) % Coin.CENT_20.value) % Coin.CENT_10.value) % Coin.CENT_5.value) / Coin.CENT_2.value;
        int eins = ((((cent % Coin.CENT_50.value) % Coin.CENT_20.value) % Coin.CENT_10.value) % Coin.CENT_5.value) % Coin.CENT_2.value;

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
