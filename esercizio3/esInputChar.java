import java.util.Scanner;

//package Esercizio_replica.esercizio3;

public class esInputChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero decimale");
        double numDec = input.nextDouble();
        System.out.println("Inserisci una parola");
        String parola = input.next();
        System.out.println("Inserisci una parola");
        char carattere = input.next().charAt(2);
        System.out.println("Il numero decimale è: " + numDec);
        System.out.println("La parola è: " + parola);
        System.out.println("Il carattere è: " + carattere);


    }
}
