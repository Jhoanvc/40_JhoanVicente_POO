
package S06_40;

import java.util.Scanner;

public class estudiante_40 {
    //ATRIBUTOS
    String nombre;
    int edad;

    //SOBRECARGA DE CONSTRUCTORES
    public estudiante_40(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public estudiante_40(String nombre) {
        this.nombre = nombre;
    }

    public estudiante_40(int edad) {
        this.edad = edad;
    }
    
    //METODOS
    public void hablar() {
        System.out.println(nombre + "Que sale causa!! gaaaaaaaaaaaa");
    }
    
    public void orden() {
        System.out.println(nombre + "levanto la mano");
    }
    
    public void edad() {
        System.out.println("Mi edad es " + edad);
    }
    
    // SOBRECARGA DE METODO
    public void hablar(String contestar){
        System.out.println("Vamos a jugar futbol" + contestar);
    }
    
    public void orden(String profesor){
        System.out.println("Contesta estas preguntas y precisas" + profesor);
    }
    
    public void edad(int años){
        System.out.println("Cuantos años de experiencias tienes " + años);
    }
    
    //METODO CON VALORES DE RETORNO
    public int dobleEdad() {
        return 2 * edad;
    }
    
    public String registro() {
        return nombre + edad;
    }
    
    public void preguntar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un nombre (Persona): ");
        nombre = scanner.next();
        System.out.print("Ingrese una edad (Edad): ");
        edad = scanner.nextInt();
        scanner.close();
    } 
}