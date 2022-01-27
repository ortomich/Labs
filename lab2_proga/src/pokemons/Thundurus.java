package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;



public class Thundurus extends Pokemon {
    public Thundurus(String name, int level) {
        super(name, level);
        setStats(79, 115, 70, 125, 80, 111);
        setType(Type.FAIRY, Type.ELECTRIC);
        setMove(new Tailwind(), new RazorWind(), new Splash(), new HyperBeam());
    }

}


