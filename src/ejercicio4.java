import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        System.out.println("¿Como se siente usted? \n Feliz(F) \n Triste (T) \n Energico (E) \n relajado (R)");
        Scanner lectura = new Scanner(System.in);
        String sentimiento = lectura.next().toLowerCase();
        switch (sentimiento) {
            case "f":
                System.out.println("3 CANCIONES FELICES \n");
                System.out.println("- Walking on Sunshine \n");
                System.out.println("- Happy \n");
                System.out.println("- Canto Stop the Feeling \n");

            case "t":
                System.out.println("3 CANCIONES TRISTE \n");
                System.out.println("- Someone Like You \n");
                System.out.println("- The Nigth We Met \n");
                System.out.println("- Creep \n");

            case "e":
                System.out.println("3 CANCIONES ENERGICAS\n ");
                System.out.println("- Eye of tiger \n");
                System.out.println("- Lose Yourself \n");
                System.out.println("- Uptown Funk \n");

            case "r":
                System.out.println("3 CANCIONES TRISTES \n");
                System.out.println("- Everybody Hurts \n");
                System.out.println("- Hurt \n");
                System.out.println("- Tears Dry on Their Own \n");
            default:
                System.out.println("Usted escribio una letra no valida!");
        }


    }
}
