import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su dia de nacimiento: ");
        int dia = scanner.nextInt();
        System.out.println("Ingrese su mes de nacimiento: ");
        int mes = scanner.nextInt();

        String signo;
        if (mes == 1) {
            signo = (dia <= 19) ? "Capricornio" : "Acuario";
        } else if (mes == 2) {
            signo = (dia <= 18) ? "Acuario" : "Piscis";
        } else if (mes == 3) {
            signo = (dia <= 20) ? "Piscis" : "Aries";
        } else if (mes == 4) {
            signo = (dia <= 19) ? "Aries" : "Tauro";
        } else if (mes == 5) {
            signo = (dia <= 20) ? "Tauro" : "Géminis";
        } else if (mes == 6) {
            signo = (dia <= 20) ? "Géminis" : "Cáncer";
        } else if (mes == 7) {
            signo = (dia <= 22) ? "Cáncer" : "Leo";
        } else if (mes == 8) {
            signo = (dia <= 22) ? "Leo" : "Virgo";
        } else if (mes == 9) {
            signo = (dia <= 22) ? "Virgo" : "Libra";
        } else if (mes == 10) {
            signo = (dia <= 22) ? "Libra" : "Escorpio";
        } else if (mes == 11) {
            signo = (dia <= 21) ? "Escorpio" : "Sagitario";
        } else {
            signo = (dia <= 21) ? "Sagitario" : "Capricornio";
        }

        System.out.println("Tu signo zodiacal es: " + signo);
    }
}
