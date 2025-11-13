package games.game_by_philip;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class VocabGameLogic {
    public static final String Reset = "\u001B[0m";
    public static final String Red = "\u001B[31m";
    public static final String Green = "\u001B[32m";

    private Map<String, String> vocab;
    private int score;

    public VocabGameLogic() {
        vocab = new HashMap<>();
        score = 0;
        loadWords();
    }

    // Load all words into the HashMap
    private void loadWords() {
        vocab.put("A small pet animal.", "Cat");
        vocab.put("A common animal kept as a pet.", "Dog");
        vocab.put("Something you read.", "Book");
        vocab.put("A place where people learn.", "School");
        vocab.put("Something you sit on.", "Chair");
        vocab.put("A place where someone lives.", "House");
        vocab.put("Something you eat.", "Food");
        vocab.put("Something you drink.", "Water");
        vocab.put("The star that lights our world.", "Sun");
        vocab.put("A person you like and trust.", "Friend");
        vocab.put("A tall plant with leaves and branches.", "Tree");
        vocab.put("A vehicle with four wheels.", "Car");
        vocab.put("A device used to call people.", "Phone");
        vocab.put("A round object used in games.", "Ball");
        vocab.put("A white drink from cows.", "Milk");
        vocab.put("A piece of furniture used for sleeping.", "Bed");
        vocab.put("A written or spoken story.", "Tale");
        vocab.put("A place where you buy food and items.", "Store");
        vocab.put("A large body of salt water.", "Ocean");
        vocab.put("A tool used for cutting paper.", "Scissors");
        vocab.put("A person who teaches students.", "Teacher");
        vocab.put("A sweet frozen dessert.", "Ice cream");
        vocab.put("A pointed writing tool often made of wood.", "Pencil");
        vocab.put("A flat device that shows pictures and videos.", "Screen");
        vocab.put("A time of day when the sun goes down.", "Evening");

    }

    // Runs the game
    public void VocabPlay() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the Vocabulary Game!");
        System.out.print("How many rounds would you like to play? ");
        int rounds = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= rounds; i++) {
            System.out.println("\nRound " + i + "/" + rounds);

            Object[] keys = vocab.keySet().toArray();
            String randomWord = (String) keys[rand.nextInt(keys.length)];

            System.out.println("What is the meaning of: " + randomWord + "?");
            String userAnswer = scanner.nextLine();

            String correctAnswer = vocab.get(randomWord);

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println(Green + "Correct!" + Reset);
                score++;
            } else {
                System.out.println(Red + "Incorrect." + Reset);
                System.out.println("Correct answer: " + correctAnswer);
            }
            vocab.remove(randomWord);
        }

        System.out.println("\nGame Over!");
        System.out.println("Your final score: " + score + "/" + rounds);
    }
}