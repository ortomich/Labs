package run;

import core.*;
import util.*;


public class startStory {
    public static void main(String[] args){

        System.out.println("Вариант №55");
        Person FandR = new Person("Филле и Рулле", LocationEnum.TAMBUR,false);
        FandR.PushProvolka();
        Person MandK = new Person("Малыш и Карлсон", LocationEnum.TAMBUR, LocationEnum.TABLE,true);
        MandK.NotSeeButListen();
        FandR.Join();
        MandK.Sit();
        Person Malysh = new Person("Малыш", LocationEnum.TABLE,false);
        Malysh.Sleep();
        Malysh.WakeUp();
        Malysh.Scare();

        Murashki murash = new Murashki();
        murash.MurashkiArrived();

        Person Karlson = new Person("Карлсон", LocationEnum.TABLE,false);
        Karlson.Help();
    }
}
