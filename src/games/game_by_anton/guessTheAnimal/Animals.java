package games.game_by_anton.guessTheAnimal;

import java.util.LinkedHashMap;

public class Animals {

    // vilken hashMap ska användas?
    public LinkedHashMap<String, Boolean> getMap(int choice) {

        if (choice == 1) {
            return rhino();
        }
        if (choice == 2) {
            return penguin();
        }
        if (choice == 3) {
            return frog();
        }
        if (choice == 4) {
            return trex();
        }

        return null;
    }

    public LinkedHashMap<String, Boolean> rhino() {
        LinkedHashMap<String, Boolean> rhinoMap = new LinkedHashMap<>();

        rhinoMap.put("Has a tail?", true);
        rhinoMap.put("Is furry?", false);
        rhinoMap.put("Is bigger than a small car?", true);
        rhinoMap.put("Has 4 or more legs?", true);
        rhinoMap.put("Is vegetarian?", true);
        rhinoMap.put("Lay eggs?", false);
        rhinoMap.put("Will run faster than you?", true);
        rhinoMap.put("Will give the Mendela-Effect", true);
        rhinoMap.put("Can fly?", false);
        rhinoMap.put("Can (and will) kill you?", true);
        rhinoMap.put("Thrives in hot climate?", true);
        rhinoMap.put("Have you probably met?", false);
        rhinoMap.put("Likes water?", true);
        rhinoMap.put("Is multi-colored?", false);

        return rhinoMap;
    }

    public LinkedHashMap<String, Boolean> penguin() {
        LinkedHashMap<String, Boolean> penguinMap = new LinkedHashMap<>();

        penguinMap.put("Is furry?", false);
        penguinMap.put("Is smaller than a football?", false);
        penguinMap.put("Has less than 4 legs?", true);
        penguinMap.put("Is vegetarian?", false);
        penguinMap.put("Lay eggs?", true);
        penguinMap.put("Lives in packs?", true);
        penguinMap.put("Has arms or wings?", true);
        penguinMap.put("Will travel laying down?", true);
        penguinMap.put("Is multicolored?", true);
        penguinMap.put("Has distinct ears?", false);
        penguinMap.put("Is a great swimmer?", true);
        penguinMap.put("Lives on earth in 2025?", true);
        penguinMap.put("Can be deadly to humans?", false);
        penguinMap.put("Thrives in cold climate?", true);
        penguinMap.put("Have you probably met?", false);
        penguinMap.put("Likes water?", true);

        return penguinMap;
    }

    public LinkedHashMap<String, Boolean> frog() {
        LinkedHashMap<String, Boolean> frog = new LinkedHashMap<>();


        frog.put("Is furry?", false);
        frog.put("Usually gives the ick?", true);
        frog.put("Is smaller than a football?", true);
        frog.put("Can be deadly to humans?", true);
        frog.put("Has 4 or more legs?", true);
        frog.put("Is vegetarian?", false);
        frog.put("Careful if you kiss?", true);
        frog.put("Can be found in the whole world?", true);
        frog.put("Will run faster than you?", false);
        frog.put("Lay eggs?", true);
        frog.put("Likes water?", true);
        frog.put("Makes a recognisable sound?", true);
        frog.put("Has big bad teeth?", false);
        frog.put("Have you probably touched?", true);
        frog.put("Is a great swimmer?", true);
        frog.put("Can fly?", false);

        return frog;
    }

    public LinkedHashMap<String, Boolean> trex() {
        LinkedHashMap<String, Boolean> trex = new LinkedHashMap<>();


        trex.put("Is furry?", false);
        trex.put("Is bigger than a small car?", true);
        trex.put("Has 4 or more legs?", false);
        trex.put("Has big bad teeth?", true);
        trex.put("Has arms or wings?", true);
        trex.put("Is vegetarian?", false);
        trex.put("Lay eggs?", true);
        trex.put("Will run faster than you?", true);
        trex.put("Will ripple water?", true);
        trex.put("Makes a distinct sound?", true);
        trex.put("Lives on earth in 2025?", false);
        trex.put("Can (and will) kill you?", true);
        trex.put("Can fly?", false);

        return trex;
    }


}
