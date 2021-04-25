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
public class OperacionesCodificar {
    private String texto, palabra;
    private String mensajeCodificado="", mensajeDecodificado= "";
    private int posLetra,posMorse, letraMorse;
    private String A=".--";
    private String B="-...";
    private String C="-.-.";
    private String D="-..";
    private String E=".";
    private String F="..-.";
    private String G="--.";
    private String H="....";
    private String I="..";
    private String J=".---";
    private String K="-.-";
    private String L=".-..";
    private String M="--";
    private String N="-.";
    private String O="---";
    private String P=".--.";
    private String Q="--.-";
    private String R=".-.";
    private String S="...";
    private String T="-";
    private String U="..-";
    private String V="...-";
    private String W=".--";
    private String X="-..-";
    private String Y="-.--";
    private String Z="--..";
    //                              A     B      C      D    E    F     G      H     I     J     K     L     M    N     O     P      Q     R      S    T    U     V      W      X     Y     Z     esp
    private String codigoMorse[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".--","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."," "};
    private String alfabeto= (String) "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";//+" ";
    //pendiente constructor

    public OperacionesCodificar(String texto){
        this.texto=texto;
    }
    public OperacionesCodificar(){
    }
    //Mensaje a codificar Texto a morse
    public String mensajeCodificar(String texto){
        texto=texto.toUpperCase();
        //Scanner ingresar=new Scanner(System.in);
       // System.out.println("Ingrese el mensaje a codificar");
        //texto=ingresar.next();
        
        //CAMBIAR DE STRING A CHAR
        for(int i=0;i<texto.length(); i++){
            
            posLetra= alfabeto.indexOf(texto.charAt(i));
            mensajeCodificado=mensajeCodificado+" "+codigoMorse[posLetra];
           // mensajeCodificado=mensajeCodificado;
            //System.out.println("El mensaje codificado es:"+mensajeCodificado);
        }
        return mensajeCodificado;
    }
    
    public String mensajeDecodificar(String texto){
        String textoArray[]=texto.split("\\/");
        int i=0;
        //char letraMensajeDecodificado;
       // System.out.println("La longitud del array es:"+textoArray.length);
        for(i=0;i<textoArray.length;i++){
            String letraMorse = textoArray[i];
            //System.out.println("La letra es:"+letraMorse);
            for(int j=0;j<codigoMorse.length; j++){
               // System.out.println(codigoMorse[j]);
                if(letraMorse.equals(codigoMorse[j])){
                   // letraMensajeDecodificado = alfabeto.charAt(j);
                     mensajeDecodificado=mensajeDecodificado+alfabeto.charAt(j);
                     
                } else{
                    //System.out.println("Las letras no se encuentran");
                    mensajeDecodificado="";
                }
                    
                
              
//            }
//            if(mensajeDecodificado==""){
//                throw new ArrayIndexOutOfBoundsException();
//            }
//                      
//        }
//        
//    
    }
        }
        
     return mensajeDecodificado;
    }
    
        
//DE TEXTO A MORSE
   public void mostrarMorse(String texto){
       System.out.println("El mensaje ingresado fue:"+ texto);
       System.out.println("El mensaje transformado es:"+ mensajeCodificar(texto));
   }
//DE MORSE A TEXTO
   public void mostrarTexto(String texto){
       System.out.println("El mensaje ingresado fue:"+ texto);
       System.out.println("El mensaje transformado es:"+ mensajeDecodificar(texto));
   }
   //En caso de contener variable distinta a una letra hacer?
    public void validarAlfabeto(String texto){
        try{
           mostrarMorse(texto);
        }catch(Exception e){
            System.out.println("Los datos ingresados no son correctos");
           
        }
    }
    //En caso de contener variable distinta a .- y / hacer?
    public void validarMorse(String texto){
        try{
           mostrarTexto(texto);
        }catch(Exception e){
            System.out.println("Los datos ingresados no son correctos");
           
        }
    }
}
