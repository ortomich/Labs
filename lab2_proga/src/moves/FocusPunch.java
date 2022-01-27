package moves;

import ru.ifmo.se.pokemon.*;

public class FocusPunch extends PhysicalMove {
    public FocusPunch() {
        super(Type.FIGHTING, 150, 100);
    }

    @Override
    protected String describe() {
        return "использует Focus Punch";
    }
}
