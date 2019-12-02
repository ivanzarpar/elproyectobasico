/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elbasico;

/**
 *
 * @author ivan_
 */
public class Elbasico {
/**

     * Método para mostrar ejemplos de tipos numericos.

     */

    public static void logicos() {



        //Estos son los tipos básicos

        boolean bueno;

        int a;

        int b;



        //Ejemplos de asignación de valores a las variables de tipos básicos

        bueno = true;

        a = 5;

        b = 4;



        if (a > b){

        //Mostrar en pantalla el contendido siempre que se cumpla la condición.

        

       

        System.out.println(bueno);
    public static void numericos() {



        //Estos son los tipos básicos

        byte elmenor;

        short unpocomas;

        int elentero;

        long dosentero;

        float crece;

        double crecemas;



        //Ejemplos de asignación de valores a las variables de tipos básicos

        elentero = 10;

        crece = (float) 7.8;

        crecemas = 235.23;



        //Mostrar en pantalla el contendido de las variables de tipos básicos.

        System.err.println("Muestra un número entero");

        System.out.println(elentero);

        System.out.println("Muestra un número real");

        System.out.println(crece);

        System.out.println("Muestra un número real más grande que el anterior");

        System.out.println(crecemas);

    }

    public static void main(String[] args) {

       numericos();  

    }

    

    }

     public static void main(String[] args) {

        logicos();  // Llamada al método

    }
>>>>>>> logicos

}
