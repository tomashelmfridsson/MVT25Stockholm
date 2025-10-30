package oop;

import java.util.Scanner;

// Skapa en ny klass med main-metod. I denna
 // klass skapar du två objekt av samma typ
 // (t.ex. Frog) och ge dem olika namn
public class Main {
     public static void main(String[] args) {
         try {
             Frog frogBoll = new Frog(name(), age(),3);
             frogBoll.getNamn();
             frogBoll.beteende();
             frogBoll.beteende();
             frogBoll.getMat();

         } catch (Exception e){
             System.out.println("Det blev fel");
         }
         Dog fido = new Dog("Fido",1,"asd");
         fido.getNamn();
         fido.beteende();
         fido.getMat();

         Animal amoeba = new Animal("ooops",5);
         ((Frog) amoeba).beteende(6);

     }

     static private String name(){
         Scanner scan = new Scanner(System.in);
         System.out.print("Ange namn: ");
         return scan.nextLine();
     }

     static private int age(){
         Scanner scan = new Scanner(System.in);
         System.out.println("Ange åldwere: ");
         return scan.nextInt();
     }


}
