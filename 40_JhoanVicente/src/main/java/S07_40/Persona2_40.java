
package S07_40;

public class Persona2_40 {
    //ATRIBUTOS
    String nombre;
    String apellido;
    int edad;    
    
    //METODO CON VALORES DE RETORNO
    public int años() {
        return 2 * edad;
    }
    
    public String ncompleto(){
        return nombre + apellido;
    }
    
    public String respuesta(){
        return "mi nombre es " + nombre + apellido + " y tengo " + edad;
    }
}