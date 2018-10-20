import java.util.Scanner;

public class Aciertos {

    public static void main(String[] args) {
        //Instanciar las variables
        int n = 0,cont = 0;
        int x = 0;
        //Minimo y el maximo del numero aleatorio
        int minimo = 10;
        int maximo = 50;
        //Ajustar el numero aleatorio
        for  (int i = 0; i < 1000; i++){
            x =(int)Math.floor(Math.random()*(minimo -( maximo +1))+(maximo));
        }
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
}
