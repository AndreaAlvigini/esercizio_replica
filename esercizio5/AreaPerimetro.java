import java.util.Scanner;

//package Esercizio_replica.esercizio5;

public class AreaPerimetro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci il lato");
        double lato = input.nextDouble();
        double perimetro = lato*4;
        double area = lato*lato;

        if(lato>40){
            System.out.println("il lato è troppo grande");
        }
        if(lato<0){
            System.out.println("il lato è troppo piccolo");
        }
        else{
           

        System.out.println("il perimetro è "+ perimetro);
        System.out.println("l'area è "+ area);//ciao

    }
}
}
