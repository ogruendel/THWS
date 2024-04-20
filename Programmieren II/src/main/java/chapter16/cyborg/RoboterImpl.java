package chapter16.cyborg;

public class RoboterImpl implements Roboter, Autofahrer {

    @Override
    public Entscheidung entscheide(Gefahrensituationen gefahrensituation) {
        if (gefahrensituation == Gefahrensituationen.GEFAHR_LINKS) {
            return Entscheidung.RECHTS;
        } else if (gefahrensituation == Gefahrensituationen.GEFAHR_RECHTS) {
            return Entscheidung.LINKS;
        } else {
            return Entscheidung.BREMSEN;
        }
    }
}
