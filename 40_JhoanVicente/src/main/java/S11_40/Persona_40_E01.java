/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_22_E01;

/**
 *
 * @author jvale
 */
public class Persona_40_E01 {
    //atributos
    String nombre;
    int edad;
    
    
    //metodos
    public Persona_40_E01(String Nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }

    public void mostrarEdad() {
        System.out.println("Tengo " + edad + " años.");
    }
    
    //get and set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}