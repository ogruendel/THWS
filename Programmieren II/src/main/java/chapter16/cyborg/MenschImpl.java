package chapter16.cyborg;

public class MenschImpl implements Mensch, Autofahrer {

    @Override
    public Entscheidung entscheide(Gefahrensituationen gefahrensituation) {
        int rand = (int) (Math.random() * 4);

        if (rand == 0) {
            return Entscheidung.UNENTSCHIEDEN;
        } else if (gefahrensituation == Gefahrensituationen.GEFAHR_LINKS) {
            return Entscheidung.RECHTS;
        } else if (gefahrensituation == Gefahrensituationen.GEFAHR_RECHTS) {
            return Entscheidung.LINKS;
        } else {
            return Entscheidung.BREMSEN;
        }
    }
}
