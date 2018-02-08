/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_git;

import java.util.Scanner;

/**
 *
 * @author mati
 */
public class Aplicacion {
public static Scanner tc=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de Variables
       int opt=0,opt2=0,dia=0,mes=0;
       boolean salir=false;
       Agenda ag=new Agenda();
       Pagina pagActual= new Pagina();
       //Codigo
       do{
       switch(opt){
       case 1:
           System.out.println("Seleccione dia");
           dia=tc.nextInt();
           System.out.println("Seleccione mes");
           mes=tc.nextInt();
           pagActual=ag.buscaPagina(dia,mes);
           switch(opt2){
               case 1:
                   break;
               case 2:
                   break;
               case 3:
                   break;
               case 4:
                   break;
               default:
                   System.out.println("Opcion no especificada");
                   break;
           
           
           }//Cierra el subSwitch
               break;
               
       case 0:
           salir=true;
           break;
       
       
       
       
       }//Cierra el switch
       
       
       }while(!salir);
    }
    
}
