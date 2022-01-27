package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Blissey extends Happiny {
    public Blissey(String name, int level) {
        super(name, level);
        setStats(255, 10, 10, 75, 135, 55);
        setType(Type.NORMAL);
        addMove(new DynamicPunch());
    }
}
