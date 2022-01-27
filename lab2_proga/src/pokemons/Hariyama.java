package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Hariyama extends Makuhita{
    public Hariyama(String name, int level) {
        super(name, level);
        setStats(144, 120, 60, 40, 60, 50);
        setType(Type.FIGHTING);
        addMove(new SacredFire());
    }
}
