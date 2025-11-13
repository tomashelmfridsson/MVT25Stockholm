package games.game_by_anton.guessTheAnimal;
import java.util.ArrayList;
import java.util.Scanner;

public class GuessTheAnimal {
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> answersArray = new ArrayList<>();     // Spara och skriv ut frågorna man bett om
        Logic logic = new Logic();
        System.out.println("Animal 1-4?");
        int choice = scanner.nextInt();
        logic.loadMap(choice); // Ladda HashMap
        //System.out.println("How many questions?");
        //int questions = scanner.nextInt();
        scanner.nextLine();
        int questions = 0;                                    // Räkna hur många frågor/svar man fått
        int guesses = 0;                                        // Räkna hur många gissningar på rätt djur


        while (questions < 10 && guesses < 3) {                 // 10 rundor eller 3 chansningar på svar
            System.out.println();
            System.out.println(RED + "                      You have made " + questions + " / 10 trys!" + RESET);
            questions++;


            // Skriv ut lista med alla frågor
            System.out.println();
            for (int i = 0; i < logic.hashMap.size(); i++) {
                System.out.println((i + 1) + ": " + logic.getKeyAtIndex(i));
                for (int j = 0; j < answersArray.size(); j++) {
                }
            }
            // Scanna in gissning eller svar på nästa fråga
            System.out.println();
            String input = scanner.nextLine();

            if (input.matches("[0-9]+")) {
                // Göra om scanner till Int så den kan användas för att hämta index i hashmap
                int index = Integer.parseInt(input);
                index = index - 1;

                // Fånga upp key som en sträng "answer"
                String answer = logic.getKeyAtIndex(index);

                // Skicka answer till hashMap - få TRUE eller FALSE. Spara i array och skriv ut
                if (logic.returnAnswers(answer)) {
                    answersArray.add("                      " + answer + " ----> YES!");
                    for (int i = 0; i < answersArray.size(); i++) {
                        System.out.println(GREEN + answersArray.get(i) + RESET);
                    }

                    System.out.println();
                } else {
                    answersArray.add("                      " + answer + " ----> NO");
                    for (int i = 0; i < answersArray.size(); i++) {
                        System.out.println(GREEN + answersArray.get(i) + RESET);
                    }
                }

            }
            // Om svar är bokstäver, behandla som en gissning
            else if (input.matches("[a-zA-Z]+")) {
                if (input.equalsIgnoreCase(logic.correctAnswer)) {
                    System.out.println(GREEN + logic.correctAnswer.toUpperCase() + " IS THE CORRECT ANSWER!" + RESET);
                    System.exit(0);
                } else {
                    System.out.println(RED + input.toUpperCase() + " IS THE WRONG ANSWER!" + RESET);
                    guesses++;
                    System.out.println(RED + "You have made " + guesses + "/3 guesses" + RESET);
                }
            }


        }
        System.out.println();
        System.out.println(RED + "GAME OVER, THE CORRECT ANSWER WAS " + logic.correctAnswer.toUpperCase() + "!" + RESET);
    }
}






