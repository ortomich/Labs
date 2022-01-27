package moves;

import ru.ifmo.se.pokemon.*;

public class Smog extends SpecialMove {
    public Smog() {
        super(Type.POISON, 30, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.4) {
            Effect.poison(p);
        }

    }

    @Override
    protected String describe() {
        return "использует Smog";
    }
}
