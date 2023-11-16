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
public class Main_S11_E01 {
     public static void main(String[] args) {
         Estudiante_40_E01 estudiante = new Estudiante_40_E01("Valle Grande", 22, 2, "Johan", 18);
         Profesor_40_E01 profesor = new Profesor_40_E01("POO", 4, "Roja", "Levano", 23);
         Empleado_40_E01 empleado = new Empleado_40_E01("Profeosr", "Carro", "Hombre", "Levano", 25);

        estudiante.saludar();
        estudiante.mostrarEdad();
        estudiante.estudiar();
        estudiante.orden();

        profesor.saludar();
        profesor.mostrarEdad();
        profesor.enseñar();
        profesor.años();

        empleado.saludar();
        empleado.mostrarEdad();
        empleado.trabajar();
        empleado.empleado();
     
     }
}