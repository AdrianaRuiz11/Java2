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
    }
}