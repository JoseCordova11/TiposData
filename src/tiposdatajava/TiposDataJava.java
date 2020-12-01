/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdatajava;

/**
 *
 * @author Jose Cordova 
 */
public class TiposDataJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        System.out.println("Programa de tipos de datos, operadores y expresiones Java");
        System.out.println("Introduccion a la programacion");   
        System.out.println("Jose Cordova");
        System.out.println("------");
        
        //Tipos, operadores y expresiones - int
        int num1 = 12;
        int num2 = 4;
        int num3 = num1 + num2;
        System.out.println("El valor de la variable entera num3 es:" +num3);
        
        //Tipos, operadores y expresiones - Double
        System.out.println("------");
        double dec1 = 0.5;
        double dec2 = 10.55;
        double dec3 = dec1 + dec2;
        System.out.println("El valor de la variable decimal dec3 es = " +dec3);

        //Tipos, operadores y expresiones - Char
        System.out.println("------");
        char letra1 = 'J';
        char letra2 = 'C';
        System.out.println("Los caracteres son:" +letra1 + letra2);
        
        //Tipos, operadores y expresiones - String
        System.out.println("------");
        
        String nombre, apellido, domicilio, telefono;
        
        //inicializar los String
        nombre = "Jose";
        apellido = "Cordova";
        domicilio = "Loja";
        telefono = "0994459764";
        
        System.out.println("Mi nombre es: " +nombre);
        System.out.println("Mi apellido es: " +apellido);
        System.out.println("Vivo en:" + domicilio);
        System.out.println("Mi número de teléfono es: " +telefono);
        System.out.println("\n");
        
        System.out.println("**Presentar en una solo linea **");
        
        System.out.println("me llamo " +nombre+""+apellido+
                  ",vivo en "+domicilio+ ", y mi teléfono es"
                  +telefono+"\n");
        
        System.out.println("**Presentar contatenando variables de tipo string** \n");
        
        System.out.println("me llamo".concat(nombre).concat(apellido).concat("vico en")
                .concat(domicilio).concat("y mi teléfono es").concat(telefono) );
        
    }
}













    