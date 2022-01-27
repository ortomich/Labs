package moves;

import ru.ifmo.se.pokemon.*;

public class RazorWind extends SpecialMove {
    public RazorWind() {
        super(Type.NORMAL, 80, 100);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (Math.random() < att.getStat(Stat.SPEED) * 3 / 512)
            return 2;
        return 1;
    }

    @Override
    protected String describe() {
        return "применяет атаку Razor Wind";
    }
}
