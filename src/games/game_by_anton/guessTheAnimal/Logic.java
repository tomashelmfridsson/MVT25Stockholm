package games.game_by_anton.guessTheAnimal;


import java.util.LinkedHashMap;


public class Logic {
    Animals animals = new Animals();
    LinkedHashMap<String, Boolean> hashMap = new LinkedHashMap<>(); // Super HashMap

    public String correctAnswer = "";

    // Ladda en random hashMap
    public void loadMap(int choice) {
        int min = 1;
        int max = 4;
        Integer random = (int) (Math.random() * (max - min)) + min;

        hashMap = animals.getMap(choice);

        String[] animal = {"Rhino", "Penguin", "Frog", "Trex"}; // String för rätt svar
        correctAnswer = animal[choice - 1];
    }

    // Skicka key till hashMap, få tillbaks true eller false
    public boolean returnAnswers(String input) {

        if (hashMap.get(input) == true) {
            hashMap.remove(input);
            return true;
        } else {
            hashMap.remove(input);
            return false;
        }
    }

    // Returnera hela listan
    public String getKeyAtIndex(int index) {
        int i = 0;
        for (String key : hashMap.keySet()) {
            if (i == index) {
                return key;
            }
            i++;
        }
        return null;
    }

}
