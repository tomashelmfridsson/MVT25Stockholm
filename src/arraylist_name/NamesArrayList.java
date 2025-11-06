package arraylist_name;

import java.util.ArrayList;

public class NamesArrayList {
    // Attribut
    private ArrayList<String> namesArrList = new ArrayList<>();

    public boolean addName(String name) {
        if (!name.equals("stop")) {
            namesArrList.add(name);
            return true;
        }
        return false;
    }

    public String getNames() {
        String names="";
        for (String name:namesArrList){
            names = names.concat(name).concat(" ");
        }
        return names.trim();  //rensar bort mellanslag först och sist i strängen
    }

    public void renew(int index, String name) {
        namesArrList.set(index,name);
    }

    public void replace(int indexA, int indexB) {
        String tempNameA = namesArrList.get(indexA);
        namesArrList.set(indexA,namesArrList.get(indexB));
        namesArrList.set(indexB,tempNameA);
    }
}
