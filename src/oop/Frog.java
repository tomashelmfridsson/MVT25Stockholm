package oop;
// Skapa en klass som representerar ett djur (t.ex. Frog)
//Lägg till en konstruktor till klassen med en parameter för djurets namn
//Spara djurets namn i ett attribut
//Skapa en metod som skriver ut djurets namn
//Lägg till en metod som representerar ett enkelt beteende (t.ex. Jump) för djuret som skrivs ut
// Uppdatera klassen Frog så att man kan läsa in två olika parametrar. Nu ska man kunna läsa in djurets namn och hur gammal den
// Uppdatera en beteende-metoden ifrån uppgift 5 så att den läser in två olika parametrar (t.ex. length och numberOfJumps)
// Använd dessa båda parametrar så att de används i metoden (t.ex. skriver ut hur långt grodan hoppar totalt)

public class Frog extends Animal{
    private int antalHopp;
    // Konstruktor
    public Frog(String namn, int alder, int antalHopp) {
        super(namn,alder);
        this.antalHopp = antalHopp;
    }

    public void beteende(int langd) {
        System.out.println("Hoppar " + langd * antalHopp + "m");
    }

    @Override
    public void getMat(){
        System.out.println("Äter flugor");
    }

    public void print(){
        this.getMat();
        super.getMat();
    }
}
