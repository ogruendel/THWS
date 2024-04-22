package chapter16.cyborg;

public class CyborgImpl implements Cyborg, Mensch, Roboter, Autofahrer {
    public MenschImpl mensch = new MenschImpl();
    public RoboterImpl roboter = new RoboterImpl();

    @Override
    public Entscheidung entscheide(Gefahrensituationen gefahrensituation) {
        Entscheidung entscheidungMensch = mensch.entscheide(gefahrensituation);
        Entscheidung entscheidungRoboter = roboter.entscheide(gefahrensituation);

        if (entscheidungMensch == entscheidungRoboter) {
            return entscheidungMensch;
        } else {
            int rand = (int) (Math.random() * 2);
            if (rand == 0) {
                return entscheidungMensch;
            } else {
                return entscheidungRoboter;
            }
        }
    }

    @Override
    public void essen() {

    }

    @Override
    public void schlafen() {

    }

    @Override
    public void aufladen() {

    }

    @Override
    public void warten() {

    }

    @Override
    public void arbeiten() {

    }
}
