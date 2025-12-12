/*En la clase Persona se declaran los atributos "nombre" y "apellido" y un
 metodo llamado "mostrarPersona", el cual imprime los valores de esos atributos*/

public class Persona {
    String nombre;
    String apellido;

    //Imprime los atributos nombre y apellido de la persona.
    void mostrarPersona(){
        System.out.println("NOmbre: "+nombre);
        System.out.println("Apellido: "+apellido);
    }
}
