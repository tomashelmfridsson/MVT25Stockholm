package hashmap_alfabetet;

import java.util.HashMap;

public class AlfabetetKodning {
    private static String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String symbols = "!?+#¤%&/()=@£${[]}^¨~<>|;:";

    private static HashMap<Character,Character> crypto = new HashMap<>();

    private static void createHashMap() {
        for (int i = 0; i < alfabet.length();i++ ){
            char key = alfabet.charAt(i);
            char value = symbols.charAt(i);
            crypto.put(key,value);
        }
    }

    public static String kryptera(String inputString) {
        createHashMap();
        String krypteradText ="";
        for (int i=0;i<inputString.length();i++){
            char inputChar = inputString.charAt(i);
            char symbol = crypto.get(inputChar);
            krypteradText += symbol;
        }
        return  krypteradText;
    }

    public static String dekryptera(String s) {
        return ""; // Ej klart
    }
}
