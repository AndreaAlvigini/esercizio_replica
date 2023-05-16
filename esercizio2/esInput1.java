//package Esercizio_replica.esercizio2;
import java.util.Scanner;

public class esInput1 {
    public static void main(String[] args) {
        Scanner ciccio = new Scanner(System.in);
        System.out.println("Digita il tuo nome");
        String nome = ciccio.next();
        System.out.println("Digita la tua età");
        int eta = ciccio.nextInt();
        System.out.println("Ciao " + nome + " la tua età è: " + eta);
        int soglia = 18;
        if(eta<soglia){
            System.out.println("sei minorenne");
        }
        else{ 
            System.out.println("sei maggiorenne");
        }
    }
}

