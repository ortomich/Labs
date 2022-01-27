package moves;

import ru.ifmo.se.pokemon.*;

public class Sandstorm extends StatusMove {
    public Sandstorm() {
        super(Type.GROUND, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().turns(5).stat(Stat.HP, -1/16);
        p.addEffect(e);

    }

    @Override
    protected String describe() {
        return "использует Sandstorm";
    }
}

