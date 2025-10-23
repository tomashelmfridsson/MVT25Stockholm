package exceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;

public class IntegerArray {
    public static void main(String[] args) {
        int index = 0; // Räknare för anatal poster i vår array med heltal
        int[] intArr = new int[5]; // skapar en array med 5 poster
        int inputMismatchExceptionCount = 0; // Räknare för antal gånger jag har skrivit inputMismatchException felet
        while (index < 5) {
            try {
                intArr[index] = readInteger();  // anropar en metod för inmatning
                index++;
            } catch (InputMismatchException ie) {
                System.out.println("Du skrev inget heltal");
                inputMismatchExceptionCount++;
            } catch (Exception exception) {
                System.out.println("Något fel inträffade" + exception);
            }
        }
        System.out.println(Arrays.toString(intArr));
        System.out.println("Du skrev fel inputMismatchException " + inputMismatchExceptionCount);

        inputMismatchExceptionCount = 0;
        int arrayIndexOutOfBoundsExceptionCount = 0;
        int numberFormatExceptionCount = 0;
        while (true) {
            System.out.println("Skriv ordn. 0-4 eller stop för att avsluta");
            try {
                Integer ordning = readInteger();
                if (ordning == null) break;
                System.out.println((intArr[ordning]));
                //System.out.println(intArr[readInteger()]);
            } catch (InputMismatchException ie) {
                System.out.println("Det blev inget heltal");
                inputMismatchExceptionCount++;
            } catch (ArrayIndexOutOfBoundsException abe) {
                System.out.println("Utanför index");
                arrayIndexOutOfBoundsExceptionCount++;
            } catch (NumberFormatException ne) {
                System.out.println("Var inget nummer");
                numberFormatExceptionCount++;
            } catch (Exception exception) {
                System.out.println("Det blev fel " + exception);
            }
        }

        System.out.println("ArrayIndexOutOfBoundsExceptionCount " + arrayIndexOutOfBoundsExceptionCount);
        System.out.println("inputMismatchExceptionCount " + inputMismatchExceptionCount);
        System.out.println("numberFormatExceptionCount " + numberFormatExceptionCount);

    }

    // Metod för att hantera min inmatning
    private static Integer readInteger() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Skriv in ett heltal");
        String inputStr = scan.nextLine();
        if (inputStr.equals("stop")) return null;
        else return Integer.parseInt(inputStr);
    }
}
