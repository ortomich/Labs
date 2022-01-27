package moves;

import ru.ifmo.se.pokemon.*;

public class SacredFire extends PhysicalMove {
    public SacredFire() {
        super(Type.FIRE, 100, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.5) {
            Effect.burn(p);
        }

    }

    @Override
    protected String describe() {
        return "использует Sacred Fire";
    }
}
