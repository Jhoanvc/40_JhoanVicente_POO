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
public class Empleado_40_E01 extends Persona_40_E01 {
     private String cargo;
     private String material;
     private String genero;

    public Empleado_40_E01(String cargo, String material, String genero, String Nombre, int edad) {
        super(Nombre, edad);
        this.cargo = cargo;
        this.material = material;
        this.genero = genero;
    }

    public void trabajar() {
        System.out.println(nombre + " trabaja como " + cargo);
    }
    
    public void empleado() {
        System.out.println("el empleado es un " + genero + " y se llamada" + nombre);
    }
}