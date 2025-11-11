package hashmap_alfabetet;

import java.util.Scanner;

public class AlfabetKodningMain {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        while (true) {
            System.out.print("Skriv in ett ord att kryptera: ");
            String mittOrd="";
            String krypteradText="";
            try {
                mittOrd = myscan.nextLine();
            } catch (Exception e){
                System.out.println("Något gick fel vid inmatning, försök igen");
            }
            if (mittOrd.equals("stop")) break;
            try {
                krypteradText = AlfabetetKodning.kryptera(mittOrd);
            }catch (Exception e){
                System.out.println("Något gick fel vid krypteringen, försök igen");
            }
            System.out.println(krypteradText);
        }
    }
}
