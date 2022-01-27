package moves;
import ru.ifmo.se.pokemon.*;
public class TakeDown extends PhysicalMove{
    public TakeDown(){
        super(Type.NORMAL, 90, 85);
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage){
        att.setMod(Stat.HP, (int) (damage/4));
    }
    @Override
    protected String describe(){
        return "использует Take Down";
    }
}

