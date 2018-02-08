/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_git;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author mati
 */
public class Aplicacion {

    public static Scanner tc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de Variables
        int opt = 0, opt2 = 0, dia = 0, mes = 0, hora = 0, min = 0;
        boolean salir = false;
        Agenda ag = new Agenda();
        Pagina pagActual = new Pagina();
        Cita cita = new Cita();
        Calendar fecha;
        //Codigo
        do {
            opt = muestraMenu();
            switch (opt) {
                case 1:
                    System.out.println("Seleccione año de la agenda");
                    int año = tc.nextInt();
                    ag.setAnyo(año);
                    System.out.println("Seleccione dia");
                    dia = tc.nextInt();
                    System.out.println("Seleccione mes");
                    mes = tc.nextInt();
                    pagActual = ag.buscaPagina(dia, mes);
                    switch (opt2) {
                        case 1:
                            //Añadir metodos validacion de mes y año correcto
                             //Comprobar si la cita existe antes o no
                            System.out.println("Añadir cita");
                            System.out.println("Seleccione dia");
                            dia = tc.nextInt();
                            System.out.println("Seleccione mes");
                            mes = tc.nextInt();
                            //ag.pagAbierta=ag.buscaPagina(dia, mes);//Este es el metodo ortodoxo
                            pagActual = ag.buscaPagina(dia, mes);
                            System.out.println("Nos encontramos en el dia " + pagActual.getDia() + "Del mes" + pagActual.getMes());
                            ag.pagAbierta.añadirCita(cita);
                            break;
                        case 2:
                            //Añadir metodos de validacion de hora y minutos
                            //Comprobar si la cita existe antes o no
                            System.out.println("Indique hora");
                            hora = tc.nextInt();
                            System.out.println("Indique minutos");
                            min = tc.nextInt();
                            cita = pagActual.buscaCita(dia, min);

                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 0:
                            salir = true;
                            break;
                        default:
                            System.out.println("Opcion no especificada");
                            break;

                    }//Cierra el subSwitch
                    break;

                case 0:
                    salir = true;
                    break;

            }//Cierra el switch

        } while (!salir);
    }

    public static int muestraMenu() {
        int opt = 0;
        System.out.println("Iniciar agenda");
        opt = tc.nextInt();
        return opt;

    }
    public static int muestraOpciones(){
    int opt=0;
        System.out.println("1;Añadir cita");
        System.out.println("2;Borrar cita");
        System.out.println("3;Buscar cita");
        System.out.println("4;Modificar cita");
       opt=tc.nextInt();
        //Listar todas las citas del dia en el que estemos despues de cada opcion
    return opt;
    }

}
