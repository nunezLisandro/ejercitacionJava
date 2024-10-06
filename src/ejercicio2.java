import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int peso, minutos;
        String ejercicio;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba su peso: ");
        peso = lectura.nextInt();
        System.out.println("Escriba el tiempo de su ejercitacion en minutos");
        minutos = lectura.nextInt();
        System.out.println("Ejercicio: \n Correr \n Nadar \n Bicicleta");
        ejercicio = lectura.next().toLowerCase();
        switch (ejercicio){
            case "correr":
                //para saber cuantas calorias gasta, nesito saber la intensidad
                //entonces utilizo un ritmo medio (MET)
                float met = 8.3F;
                int calorias = (int) (met*peso*(3.5/200)*minutos);
                System.out.println("Teniendo en cuenta una " +
                        "velocidad promedio de 8km/h");
                System.out.println("Usted esta quemando: " +calorias+ " calorias");
                break;
            case "nadar":
                //para saber cuantas calorias gasta, nesito saber la intensidad
                //entonces utilizo un ritmo medio (MET)
                met = 7;
                calorias = (int) (met*peso*(3.5/200)*minutos);
                System.out.println("Teniendo en cuenta que su ejercicio es en una intensidad media");
                System.out.println("Usted esta quemando: " +calorias+ " calorias");
                break;
            case "bicicleta":
                //para saber cuantas calorias gasta, nesito saber la intensidad
                //entonces utilizo un ritmo medio (MET)
                met = 8;
                calorias = (int) (met*peso*(3.5/200)*minutos);
                System.out.println("Teniendo en cuenta que su ejercicio es en una intensidad media");
                System.out.println("Usted esta quemando: " +calorias +" calorias");
                break;
            default:
                System.out.println("Usted escribio cualquier cosa");
        }

    }
}