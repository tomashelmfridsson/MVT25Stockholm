package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        String[] names = {"Ada", "Beda", "Cålle"};

        Scanner scan = new Scanner(System.in);
        System.out.print("Skriv en siffra: ");

        try {
            int index = scan.nextInt();
            System.out.println(names[index]);
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("indexet du angav fanns inte i arrayen " + aiobe);
        } catch (InputMismatchException ime){
            System.out.println("Input fel "+ime);
        }catch (Exception exception){
            System.out.println("Något knepigt hände "+exception);
        }

    }

}
