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
public class Profesor_40_E01 extends Persona_40_E01 {
     private String materia;
     private int expereciencia;
     private String ropa;

    public Profesor_40_E01(String materia, int expereciencia, String ropa, String Nombre, int edad) {
        super(Nombre, edad);
        this.materia = materia;
        this.expereciencia = expereciencia;
        this.ropa = ropa;
    }

    public void enseñar() {
        System.out.println(nombre + " está enseñando " + materia);
    }
    
    public void años() {
        System.out.println("mis años de experiencia son de " + expereciencia);
    }
}