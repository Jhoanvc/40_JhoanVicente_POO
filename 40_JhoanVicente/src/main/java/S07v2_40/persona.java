
package S07v2_40;

public class persona {
    String nombre;
    int edad;
    
    //METODOS
    public void  dormir() {
        System.out.println("Quiero dormir" + nombre);
    }
    
    public void hablar () {
        System.out.println("hola" + nombre + " y tengo " + edad);
    }
    
    //SOBRECARGAR DE METODO
    public void dormir(int hora){
        System.out.println("Yo duermo " + hora + "horas");
    }
    
    public void hablar(String xpersona){
        System.out.println("Un gusto conocerte " + xpersona);
    }
     
    //METODO DE RETORNO
    public void correr() {
        return;
    }
    
    public int añ0(){
        return 18;
    }
    
    public String nombre() {
        return "Jvalerius";
    }
    
    //METODO CON PARAMETORS Y ARGUMENTOS
    public void metodo1(int a) {
        System.out.println("Parametro con entero " + a);
    }
    
     public void metodo1(String a) {
         System.out.println("Parametro con cadena de texto " + a);
    } 
}