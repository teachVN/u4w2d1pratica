import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {

    public static void main(String[] args) {



        int[] numeri = new int[5];

        for(int i=0; i< numeri.length; i++){
            numeri[i]=new Random().nextInt(1,11);
        }

        for(int numero:numeri){
            System.out.println(numero);
        }

        inserisciNumeroInArray(numeri);

        for(int numero:numeri){
            System.out.println(numero);
        }


    }

    public static void inserisciNumeroInArray(int[] array){
        Scanner scanner = new Scanner(System.in);
        int numero=0;
        do {
            System.out.println("Dammi un numero");
            numero = scanner.nextInt();

            System.out.println("Posizione nell'array");
            int pos = scanner.nextInt();

            try {
                if (numero != 0)
                    array[pos] = numero;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Errore! Indice dell'array compreso solo tra 0 e 4");
            }

        }while(numero!=0);
    }

}
