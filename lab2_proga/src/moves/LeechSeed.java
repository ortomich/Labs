package moves;

import ru.ifmo.se.pokemon.*;

public class LeechSeed extends StatusMove {
    public LeechSeed() {
        super(Type.GRASS, 0, 90);
    }

    @Override
    protected String describe() {
        return "использует Leech Seed";
    }
}
