package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// pi		3.1415926535
//e		2.7182818284
//sqrt2	1.4142135623
//phi		1.6180339887
//ln10		2.3025850929
public class MatteKonstanter {
    public static void main(String[] args) {
        // array +snabb +primitiva typer -statisk
        double[] constArr = {3.1415926535, 2.7182818284, 1.4142135623, 1.6180339887, 2.3025850929};
        System.out.println(Arrays.toString(constArr));
        for (int i = 0; i < constArr.length; i++) System.out.println(constArr[i]);
        for (double c : constArr) System.out.println(c);  // saknar index och loopa igenom allt

        // Arraylist +flexibel i slutet -hantera mittposter -långsammare - ej primitiva typer
        ArrayList<Double> constArrList = new ArrayList<>();
        constArrList.add(3.1415926535);
        constArrList.add(2.7182818284);
        constArrList.add(1.4142135623);
        System.out.println(constArrList);


        // Hashmap bra på söka på en "nyckel" snabb på det. dict i python .net -dubbletter ej ok,-oordning
        // Nyckelord -> Värde
        HashMap<String, Double> constHashMap = new HashMap<>();
        constHashMap.put("pi", 3.1415926535);
        constHashMap.put("e", 2.7182818284);
        System.out.println(constHashMap);
    }
}
