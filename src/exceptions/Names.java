package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Names {

    public static void main(String[] args) {

        String[] names = {"Ada", "Beda", "Cålle"};
        //0    1        2
        int index = 5;
        System.out.println(names[index]);
        Scanner scan = new Scanner(System.in);


        System.out.print("Skriv en siffra: ");

        try {
            index = scan.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Input fel " + ime);
        } catch (Exception exception) {
            System.out.println("Något knepigt hände " + exception);
        }
        try {
            System.out.println(names[index]);
        } catch ( ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("indexet du angav fanns inte i arrayen " + aiobe);
        } catch (Exception exception) {
            System.out.println("Något knepigt hände " + exception);
        }
    }

}
