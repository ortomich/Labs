package moves;

import ru.ifmo.se.pokemon.*;

public class HyperBeam extends SpecialMove {
    public HyperBeam() {
        super(Type.NORMAL, 150, 90);
    }


    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setCondition(new Effect().condition(Status.SLEEP).turns(2));
    }

    @Override
    protected String describe() {
        return "применяет атаку Hyper Beam";
    }
}

