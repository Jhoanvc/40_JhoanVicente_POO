/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S07_40;

/**
 *
 * @author jvale
 */
public class Persona1_40 {
    //METODO CON PARAMETROS
    public void saludar(String nombre){
        System.out.println("Hola " + nombre + "....");
    }
    
    public void sumar(int a, int b) {
        int resultado = a + b;
        System.out.println("La suma de " + a + " y " + b + " es: " + resultado);
    }
    
    public void datos(String correo, String contraseña){
        System.out.println("Mi correo es " + correo + " y mi contrasela es " + contraseña);
    }
}