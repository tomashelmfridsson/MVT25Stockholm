package oop;
// Skapa en till klass som representerar
// ett annat djur (t.ex. Dog) med en liknande
// struktur som i OOP övning 1
public class Dog extends Animal{


    private final String ras;

    public Dog(String namn, int alder, String ras) {
        super(namn, alder);
        this.ras = ras;
    }

    @Override
    public void beteende(){
        System.out.println("Bark");
    }
}
