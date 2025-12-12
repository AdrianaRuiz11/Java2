import java.util.Scanner;

public class GeneradorEmails {

    public static void main(String[] args) {
        generadorEmails();
    }

    static void generadorEmails() {
        System.out.println("*** Generador Emails ***");
        var teclado = new Scanner(System.in);
        System.out.print("Cual es tu nombre? ");
        var nombre = teclado.nextLine().toLowerCase();
        System.out.print("Cual es tu apellido? ");
        var apellido = teclado.nextLine().toLowerCase();
        var correo = nombre + "." + apellido;
        var dominio = "@java.com";

        System.out.println(correo + dominio);
    }
}
