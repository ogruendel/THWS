package chapter16.muenzautomat;

public interface ChangeCalculator {
    /**
     * Mit Hilfe des Rueckgabewerts der nachfolgenden Methode
     * wird der Muenzausgabemechanismus des Automaten gesteuert.
     * An der Stelle 0 des Arrays steht, wie viele 1-Cent-Muenzen
     * ausgegeben werden sollen, an der Stelle 1, wie viele 2-Cent-
     * Muenzen usw. bis zu den 2-Euro-Muenzen an der Stelle 7.
     * <p>
     * Der Softwarevertrag dieser Methode lautet, dass der Wert der
     * zurueckgegebenen Muenzen genau dem Wert entsprechen muss, der
     * als Parameter uebergeben wird. Im Gegenzug sichert der
     * Aufrufer zu, dass
     * a) keine negativen Werte uebergeben werden
     * b) der Cent-Parameter keinen Wert > 99 annimmt
     */

    public int[] getChange(int euros, int cent);
}
