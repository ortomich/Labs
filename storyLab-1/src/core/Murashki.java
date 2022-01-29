package core;

import util.LocationEnum;
import util.MurashkiAbstract;

public class Murashki extends MurashkiAbstract {
    private String name;
    private LocationEnum TYPE;

    public Murashki() {
        super(true);
        name = "мурашки";
        TYPE = LocationEnum.SHELF;
    }

    public Murashki(String name, boolean murashki) {
        super(true);
        this.name = name;
    }


    public void MurashkiArrived() {
        if (TYPE == LocationEnum.SHELF) {
            System.out.println("что по спине забегали " + name + ".");
        }
    }
}
