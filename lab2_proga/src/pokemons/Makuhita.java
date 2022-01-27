package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Makuhita extends Pokemon{
    public Makuhita(String name, int level) {
        super(name, level);
        setStats(72, 60, 30, 20, 30, 25);
        setType(Type.FIGHTING);
        setMove(new LeechSeed(), new Sandstorm(), new HyperBeam());
    }
}
