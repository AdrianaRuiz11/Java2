/*Clase principal del proyecto. Aqui se crean objetos y se muestran sus datos.*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Creacion de objetos de la clase Persona!");

        //Crear el primer objeto y asignar valores.
        Persona objeto1 = new Persona();
        objeto1.nombre= "Adriana";
        objeto1.apellido="RUiz";
        objeto1.mostrarPersona();

        //Crear el segundo objeto y asignar valores.
        Persona objeto2 = new Persona();
        objeto2.nombre="Franco";
        objeto2.apellido = "Anastasio";
        objeto2.mostrarPersona();

        //Prueba de la clase Aritmetica.
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.numero1 = 3;
        aritmetica1.numero2 = 5;
        aritmetica1.sumar();
        aritmetica1.restar();

        //Creacion de un segundo objeto de la clase Aritmetica.
        Aritmetica aritmetica2 = new Aritmetica();
        aritmetica2.numero1 = 10;
        aritmetica2.numero2 = 2;
        aritmetica2.sumar();
        aritmetica2.restar();
    }
}