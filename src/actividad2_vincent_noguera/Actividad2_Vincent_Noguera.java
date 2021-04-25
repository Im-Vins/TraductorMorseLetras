/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2_vincent_noguera;


import java.util.Scanner;

/**
 *
 * @author Vins
 */
public class Actividad2_Vincent_Noguera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int decision=0;
        String texto;
        Scanner scan=new Scanner(System.in);
        System.out.println("Instrucciones:");
        System.out.println("Ingrese el texto para transformar a morse, no debe ingresar caracteres distintos al alfabeto o espacios");
        System.out.println("Para transformar de morse a texto debe separar cada letra con un slash (/) y escribir seguido Ej:(..../---/.-../.-)=HOLA");
        System.out.println("Para separar 2 o más palabras usar el espacio entre slash ejemplo: (..../ /---/ /.-../ /.-)=H O L A");
        System.out.println("Ingrese el texto a transformar");
        texto=scan.nextLine();
        // System.out.println(texto.length());
         //System.out.println(texto);
        OperacionesCodificar palabra=new OperacionesCodificar();
        
        
        System.out.println("Que desea hacer:");
        System.out.println("Para transformar de texto a morse ingrese (1)");
        System.out.println("Para transformar de morse a texto ingrese (2)");
        decision=scan.nextInt();
        if(decision==1){
//           palabra.validarAlfabeto(palabra.mostrarMorse(texto));    
            palabra.validarAlfabeto(texto);
            //palabra.validarAlfabeto.mensajeCodificar(texto);
        } else if (decision==2){
            //palabra.mensajeDecodificar(texto);
            palabra.validarMorse(texto);
        } else{
            System.out.println("Opción no valida");
        }
       
        
    }
}
