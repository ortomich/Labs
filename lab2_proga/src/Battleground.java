import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

class Battleground {
    public static void main(String args[]) {
        Battle b = new Battle();

        Hariyama p1 = new Hariyama("", 1);
        Happiny p2 = new Happiny("", 2);
        Chansey p3 = new Chansey("", 2);

        Thundurus p4 = new Thundurus("", 1);
        Makuhita p5 = new Makuhita("", 3);
        Blissey p6 = new Blissey("", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}
