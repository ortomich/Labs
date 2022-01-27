package moves;

import ru.ifmo.se.pokemon.*;

public class Splash extends PhysicalMove {
    public Splash() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected String describe() {
        return "использует Splash";
    }
}
