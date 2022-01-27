package moves;
import ru.ifmo.se.pokemon.*;
public class Tailwind extends StatusMove{
    public Tailwind(){
        super(Type.FLYING, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().turns(4).stat(Stat.SPEED, 2);
        p.addEffect(e);

    }

    @Override
    protected String describe(){
        return "использует Tail Wind";
    }
}
