package core;

import util.LocationEnum;
import util.PersonInterface;

public class Person implements PersonInterface {
    private String name;
    private LocationEnum TYPE;
    private LocationEnum TYPE2;
    private boolean mainCharacter;

    public Person(String name, Enum TYPE, Enum TYPE2, boolean mainCharacter) {
        this.name = name;
        this.TYPE = (LocationEnum) TYPE;
        this.TYPE2 = (LocationEnum) TYPE2;
        this.mainCharacter = mainCharacter;
    }

    public Person(String name, Enum TYPE, boolean mainCharacter) {
        this.name = name;
        this.TYPE = (LocationEnum) TYPE;
        this.mainCharacter = mainCharacter;
    }

    public void PushProvolka() {
        System.out.println("И вот наконец в щель почтового ящика " + name +" просунул проволоку");
    }

    public void NotSeeButListen() {
        if (TYPE == LocationEnum.TAMBUR) {
            System.out.println("Собственно говоря, " + name + " этого не увидели, потому что в тамбуре было темно, хоть глаз выколи, а услышали: раздалось полязгивание и скрежет, так что сомнений быть уже не могло --");
        }
    }

    public void Join() {
        if (TYPE == LocationEnum.TAMBUR) {
            System.out.println("вот они, долгожданные " + name + "!");
        }
    }

    public void Sit() {
            System.out.println("Все это время " + name + " просидели на корточках под круглым столиком в прихожей и ждали. Так прошло не меньше часа.");
    }

    public void Sleep() {
        if (TYPE == LocationEnum.TABLE) {
            System.out.println(name + " даже задремал");
        }
    }

    public void WakeUp() {
        if (TYPE == LocationEnum.TABLE) {
            System.out.println(name + " разом проснулся, когда в ящике что-то заскрежетало");
        }
    }

    public void Scare() {
        if (TYPE == LocationEnum.TABLE) {
            System.out.println("Ой, вот сейчас все начнется! С " + name + " мигом слетел всякий сон, ему было так страшно,");
        }
    }

    public void Help() {
        if (TYPE == LocationEnum.TABLE) {
            System.out.println(name + " решил его ободрить.");
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public LocationEnum whatLocation() {
        return TYPE;
    }

    @Override
    public boolean isMainCharacter() {
        return mainCharacter;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person) {
            return (name.equals(((Person) obj).getName()) && isMainCharacter() == ((Person) obj).isMainCharacter()
                    && TYPE == ((Person) obj).whatLocation());
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        if (isMainCharacter()) {
            return name.hashCode() + name.length();
        } else {
            return name.hashCode();
        }
    }
}
