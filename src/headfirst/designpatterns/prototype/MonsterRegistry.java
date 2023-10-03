package headfirst.designpatterns.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonsterRegistry {
    private static final List<Monster> monsterList = new ArrayList<>(Arrays.asList(
            new Dragon("Smaug", true),
            new Dragon("Glaurung", false),
            new Drakon("Shenron", 1 ,true),
            new Drakon("Sisu",1,false),
            new Drakon("Hydra",5,false)
    ));

    public static List<Monster> getMonsterList(){
        return monsterList;
    }
}
