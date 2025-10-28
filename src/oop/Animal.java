package oop;

public class Animal {
    private String namn; // Objekt attribut
    private int alder;

    // Konstruktor Super class
    public Animal(String namn, int alder) {
        this.namn = namn;
        this.alder = alder;
    }

    protected void getMat() {
        System.out.println("Äter gräs");
    }

    protected void beteende(){
        System.out.println("Sover");
    }

    protected void getNamn() {
        System.out.println(this.namn);
    }

    protected int getAlder() {
        return alder;
    }
}
